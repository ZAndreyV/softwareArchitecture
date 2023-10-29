# Определение класса Product
class Product:
    def __init__(self, id, name, price):
        self.id = id
        self.name = name
        self.price = price

# Определение класса ProductDAO
class ProductDAO:
    def add_product(self, product):
        # логика добавления продукта в базу данных
        pass
    
    def delete_product(self, product_id):
        # логика удаления продукта из базы данных
        pass
    
    def get_product(self, product_id):
        # логика получения продукта из базы данных
        pass

# Определение класса ProductRepository
class ProductRepository:
    def __init__(self, product_dao):
        self.product_dao = product_dao
    
    def add_product(self, product):
        # логика добавления продукта с валидацией
        self.product_dao.add_product(product)
    
    def delete_product(self, product_id):
        # логика удаления продукта с валидацией
        self.product_dao.delete_product(product_id)
    
    def get_product(self, product_id):
        # логика получения продукта с валидацией
        return self.product_dao.get_product(product_id)

# Определение класса ProductService
class ProductService:
    def __init__(self, product_repository):
        self.product_repository = product_repository
    
    def add_product(self, id, name, price):
        # логика добавления продукта с бизнес-проверками
        product = Product(id, name, price)
        self.product_repository.add_product(product)
    
    def delete_product(self, product_id):
        # логика удаления продукта с бизнес-проверками
        self.product_repository.delete_product(product_id)
    
    def get_product(self, product_id):
        # логика получения продукта с бизнес-проверками
        return self.product_repository.get_product(product_id)

# Определение класса UnitOfWork
class UnitOfWork:
    def __init__(self):
        self.added_products = []
        self.deleted_products = []
    
    def add_product(self, product):
        self.added_products.append(product)
    
    def delete_product(self, product):
        self.deleted_products.append(product)
    
    def commit(self):
        # логика сохранения изменений в базу данных
        pass
    
    def rollback(self):
        # логика отмены изменений
        pass

# Главная программа
if __name__ == "__main__":
    product_dao = ProductDAO()
    product_repository = ProductRepository(product_dao)
    product_service = ProductService(product_repository)
    unit_of_work = UnitOfWork()
    
    # Добавление продуктов
    unit_of_work.add_product(Product(1, "Product 1", 10))
    unit_of_work.add_product(Product(2, "Product 2", 20))
    
    # Удаление продукта
    unit_of_work.delete_product(Product(3, "Product 3", 30))
    
    # Отмена изменений
    unit_of_work.rollback()
    
    # Сохранение изменений
    unit_of_work.commit()
    
    # Вывод списка продуктов
    products = product_service.get_product_list()
    for product in products:
        print(f"ID: {product.id}, Name: {product.name}, Price: {product.price}")
