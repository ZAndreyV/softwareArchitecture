class SubComponent(Component):
    def __init__(self):
        super().__init__()

    def add_element(self, element):
        super().add_element(element)
        assert self.get_length() <= 10, "Постусловие: список не должен содержать более 10 элементов"

    def get_element(self, index):
        return super().get_element(index).upper()

    def remove_element(self, element):
        assert not self.has_element(element.upper()), "Инвариант: удаляемый элемент должен быть в верхнем регистре"
        super().remove_element(element)


my_component = SubComponent()
my_component.add_element("apple")
my_component.add_element("banana")
print(my_component)

# В данном примере существует абстрактный класс Component, 
# который определяет базовую функциональность для хранения и
#  манипуляции данными. Этот класс имеет предусловия, постусловия,
#  инварианты и методы для выполнения операций.
# Затем создается конкретный класс SubComponent,
# который наследуется от Component и реализует некоторые
# дополнительные функции. В данном классе также определены предусловия,
# постусловия и инварианты.
