package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
    private String name;
    public int age;

    public Person() {
    }

    private void sayHello() {
        System.out.println("Hello!");
    }

    public void sayHello(String name) {
        System.out.println("Hi " + name);
    }
}

public class reflections {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException, InstantiationException {
        // 1. Using .class
        Class<?> cls1 = Person.class;

        // 2. Using object instance
        Person p = new Person();
        Class<?> cls2 = p.getClass();

        // 3. Using Class.forName
        Class<?> cls3 = Class.forName("reflections.Person");
        System.out.println(cls1);
        System.out.println(cls2);

        // Reflection of Fields
        Field[] allFields = cls3.getDeclaredFields();

        for (Field f : allFields) {
            System.out.println("Field: " + f.getName() + ", Type: " + f.getType());
        }

        Person p1 = new Person();
        Field nameField = cls1.getDeclaredField("name");
        nameField.setAccessible(true); // Bypass private access
        nameField.set(p1, "John"); // Set value
        System.out.println("Name via reflection: " + nameField.get(p1));

        // Get all declared methods
        Method[] methods = cls1.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        // Invoke method
        Method sayHelloMethod = cls1.getDeclaredMethod("sayHello", String.class);
        sayHelloMethod.invoke(new Person(), "John"); // Output: Hello John!

        // Invoke method
        Method privateSayHelloMethod = cls1.getDeclaredMethod("sayHello");
        privateSayHelloMethod.setAccessible(true); // Needed if it's private
        privateSayHelloMethod.invoke(new Person()); // Output: Hello!

        Constructor<?> constructor = cls1.getConstructor();
        Person cons = (Person) constructor.newInstance();
        System.out.println(cons);

    }
}
