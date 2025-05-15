package classes;

//Concrete Class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Abstract Class
abstract class Shape {
    abstract void draw(); // abstract method

    void color() {
        System.out.println("Shape has color");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// Final Class
final class MathUtils {
    int square(int x) {
        return x * x;
    }
}

// Static Nested Class
class Outer {
    static class Inner {
        void msg() {
            System.out.println("Static nested class");
        }
    }
}

// Non Static Nested Class
class Outer1 {
    class Inner1 {
        void show() {
            System.out.println("Inner class");
        }
    }
}

// Local Inner Class
class Outer2 {
    void display() {
        class Local {
            void show() {
                System.out.println("Local inner class");
            }
        }
        Local obj = new Local();
        obj.show();
    }
}

abstract class Person {
    abstract void greet();
}

// Plain Old Javascript Object Class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Immutable Class
final class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Singleton Class
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//Generic Classes
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public <T extends Number> void display(T num) {
        System.out.println(num);
    }
}

// Multi Bound
class MultiBound<T extends Number & Comparable<T>> {
    T value;

    public MultiBound(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println("Value: " + value);
    }
}

public class classTypes {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.sound();
        Outer.Inner obj = new Outer.Inner();
        obj.msg();
        Outer1.Inner1 inner1 = new Outer1().new Inner1();
        inner1.show();
        Outer2 obj2 = new Outer2();
        obj2.display();

        // Anonymous Class
        Person p = new Person() {
            void greet() {
                System.out.println("Hi I am a Person Class");
            }
        };

        p.greet();

        Student s = new Student("Yash", 34);
        s.getAge();
        s.getName();
        MathUtils m = new MathUtils();
        m.square(6);

        Book b = new Book("Hi Title Here");
        b.getTitle();

        Singleton s1 = Singleton.getInstance(); // First call — creates instance
        Singleton s2 = Singleton.getInstance(); // Second call — returns same instance

        System.out.println(s1 == s2); // true — both are the same object

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get()); // 123

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get()); // Hello
        strBox.display(1);

        MultiBound<Integer> multiObj = new MultiBound<>(43);
        multiObj.show();
    }
}
