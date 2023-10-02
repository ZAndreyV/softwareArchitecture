package Lesson3.OCP;
// Пример соблюдения принципа OCP

// Абстрактный класс, представляющий компонент с функциональностью
abstract class Component {
    public abstract void doSomething();
}

// Класс, представляющий конкретную реализацию компонента 1
class Component1 extends Component {
    public void doSomething() {
        // Логика работы компонента 1
    }
}

// Класс, представляющий конкретную реализацию компонента 2
class Component2 extends Component {
    public void doSomething() {
        // Логика работы компонента 2
    }
}

// Класс, который использует компоненты для выполнения определенных задач
class Client {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void executeTask() {
        // Выполнение задачи с использованием выбранного компонента
        component.doSomething();
    }
}

// Пример использования компонентов и клиента
public class Main {
    public static void main(String[] args) {
        // Создание объектов компонентов
        Component component1 = new Component1();
        Component component2 = new Component2();

        // Создание объекта клиента
        Client client = new Client();

        // Передача компонента 1 клиенту и выполнение задачи
        client.setComponent(component1);
        client.executeTask();

        // Передача компонента 2 клиенту и выполнение задачи
        client.setComponent(component2);
        client.executeTask();
    }
}


// В этом примере показано, как соблюдается принцип OCP. Компоненты представлены абстрактным классом Component,
// который имеет абстрактный метод doSomething(). Конкретные реализации компонентов Component1 и Component2 наследуются от абстрактного класса
// и предоставляют реализации для метода doSomething(). 
// Клиентский класс Client использует компоненты для выполнения определенных задач. Он содержит поле типа Component и методы
// для установки компонента и выполнения задачи с использованием выбранного компонента. 
// В Main создаются объекты компонентов Component1 и Component2, а также объект клиента Client.
// Затем компоненты устанавливаются клиенту с помощью метода setComponent(), а метод executeTask() вызывается для выполнения задачи с выбранным компонентом. 
// Такой подход позволяет добавить новые компоненты, просто создавая новые классы, наследующиеся от Component,
// без изменения уже существующего кода в клиенте Client. Таким образом, компоненты закрыты для модификации, но они расширяемы путем создания новых классов.

