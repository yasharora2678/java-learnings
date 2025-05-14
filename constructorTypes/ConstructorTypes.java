package constructorTypes;

//Default Constructor
class Bike {
    // No constructor written by us
    void show() {
        System.out.println("Bike is running.");
    }
}

// No Argument Constructor
class Car {
    Car() {
        System.out.println("Car is created");
    }

    void drive() {
        System.out.println("Driving...");
    }
}

// Parameterized Constructor
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

// Copy Constructor
class Book {
    String title;

    Book(String t) {
        title = t;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
    }

    void show() {
        System.out.println("Book title: " + title);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {
        Bike b = new Bike(); // Default constructor is called
        b.show();

        Car c = new Car(); // Calls your custom no-arg constructor
        c.drive();

        Student s1 = new Student("Alice", 20); // Pass values directly
        s1.display();

        Student s2 = new Student("Bob", 22);
        s2.display();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book(b1); // Copies from b1

        b1.show();
        b2.show();
    }
}
