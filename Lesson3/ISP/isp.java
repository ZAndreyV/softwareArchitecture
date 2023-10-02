package Lesson3.ISP;
// Обобщенный интерфейс с методами для летающих и плавающих объектов
interface FlyingSwimmingObject {
    void fly();
    void swim();
}

// Класс, реализующий только метод лета для объектов, которые могут летать
class FlyingObject implements FlyingSwimmingObject {
    public void fly() {
        // реализация полета
    }

    public void swim() {
        // ошибка: метод не применим к объектам, которые могут только летать
    }
}

// Класс, реализующий только метод плавания для объектов, которые могут плавать
class SwimmingObject implements FlyingSwimmingObject {
    public void fly() {
        // ошибка: метод не применим к объектам, которые могут только плавать
    }

    public void swim() {
        // реализация плавания
    }
}

// Класс, реализующий и метод лета, и метод плавания для объектов, которые могут и летать, и плавать
class FlyingSwimmingObjectImpl implements FlyingSwimmingObject {
    public void fly() {
        // реализация полета
    }

    public void swim() {
        // реализация плавания
    }
}

// Пример использования классов
FlyingObject flyingObject = new FlyingObject();
flyingObject.fly();

SwimmingObject swimmingObject = new SwimmingObject();
swimmingObject.swim();

FlyingSwimmingObjectImpl flyingSwimmingObject = new FlyingSwimmingObjectImpl();
flyingSwimmingObject.fly();
flyingSwimmingObject.swim();

//В данном примере интерфейс FlyingSwimmingObject разделен на специфические интерфейсы.
// Класс FlyingObject реализует только метод fly(), класс SwimmingObject реализует только метод swim(),
// а класс FlyingSwimmingObjectImpl реализует оба метода. Таким образом, принцип разделения интерфейса
// позволяет создавать более гибкую архитектуру, где клиенты не зависят от методов, которые они не используют.