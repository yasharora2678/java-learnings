package app;

import people.Person;

public class Employee extends Person {
    public void show() {
        System.out.println(name);   // ✅ public
        System.out.println(age);    // ✅ protected — accessible in subclass
        // System.out.println(city); // ❌ default — not accessible
        // System.out.println(secret); // ❌ private — not accessible
    }

    public static void main(String[] args) {
        Employee empObj = new Employee();
        empObj.show();
    }
}