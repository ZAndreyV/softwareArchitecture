class Component:
    def __init__(self):
        self.data = []

    def add_element(self, element):
        assert element is not None, "Предусловие: элемент не должен быть пустым"
        self.data.append(element)

    def remove_element(self, element):
        assert element in self.data, "Предусловие: элемент должен существовать в списке"
        self.data.remove(element)
        
    def get_element(self, index):
        assert 0 <= index < len(self.data), "Предусловие: индекс должен быть в пределах списка"
        return self.data[index]

    def has_element(self, element):
        return element in self.data

    def get_length(self):
        return len(self.data)

    def __str__(self):
        return str(self.data)