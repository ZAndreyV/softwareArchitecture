package Lesson3.LSP;
// Пример соблюдения принципа LSP

// Базовый класс, представляющий фигуру
class Shape {
    public double area() {
        return 0;
    }
}

// Класс, представляющий прямоугольник
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return width * height;
    }
}

// Класс, представляющий квадрат
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double area() {
        return side * side;
    }
}

// Класс, который использует фигуры для вычисления суммарной площади
class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }
}

// Пример использования фигур и калькулятора площадей
public class Main {
    public static void main(String[] args) {
        // Создание объектов фигур
        Shape rectangle = new Rectangle(5, 3);
        Shape square = new Square(4);

        // Создание массива фигур
        Shape[] shapes = {rectangle, square};

        // Создание объекта калькулятора площадей
        AreaCalculator areaCalculator = new AreaCalculator();

        // Вычисление суммарной площади фигур
        double totalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}


// В этом примере показано, как соблюдается принцип LSP. Базовый класс Shape представляет собой абстракцию фигуры
// и имеет метод area(), который возвращает площадь фигуры. Классы Rectangle и Square являются производными от Shape
// и предоставляют реализации для метода area() в соответствии с особенностями прямоугольников и квадратов.
// Класс AreaCalculator использует полиморфизм и метод area() базового класса Shape для вычисления суммарной площади фигур, хранящихся в массиве. 
// В Main создаются объекты Rectangle и Square, а также массив фигур shapes, содержащий эти объекты.
// Затем создается объект AreaCalculator, который используется для вычисления суммарной площади фигур,
// вызывая метод calculateTotalArea() и передавая ему массив shapes.
//Такой подход позволяет заменять объекты базового класса Shape объектами производных классов Rectangle и Square
// без нарушения корректности программы. Код, который использует фигуры, не зависит от конкретного типа каждой фигуры
// и может работать с ними, исходя только из их общего интерфейса, определенного в базовом классе Shape.
// Это обеспечивает гибкость и расширяемость системы.
