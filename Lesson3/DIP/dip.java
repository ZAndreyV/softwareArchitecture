package Lesson3.DIP;
// Абстракция для некоторого сервиса
interface Service {
    void performAction();
}

// Реализация некоторого сервиса
class ConcreteService implements Service {
    public void performAction() {
        // реализация действия
    }
}

// Класс, который зависит от абстракции Service
class HighLevelModule {
    private Service service;

    public HighLevelModule(Service service) {
        this.service = service;
    }

    public void doSomething() {
        // выполняем действие, используя сервис
        service.performAction();
    }
}

// Пример использования классов
Service concreteService = new ConcreteService();
HighLevelModule highLevelModule = new HighLevelModule(concreteService);
highLevelModule.doSomething();


// В данном примере класс HighLevelModule зависит от абстракции Service, а не от конкретной реализации.
// Это позволяет легко заменять реализацию сервиса без изменения кода высокоуровневого модуля.

//Принцип инверсии зависимостей позволяет создавать модули, которые легко тестируются, масштабируются и поддерживаются.
// Он также способствует более гибкой архитектуре, где модули независимы друг от друга и могут быть переиспользованы.
