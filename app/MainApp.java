package app;

import people.Person;

public class MainApp {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.name);    // ✅ public: accessible

        // System.out.println(p.age);  // ❌ protected: not accessible outside package (unless subclass)
        // System.out.println(p.city); // ❌ default: not accessible outside package
        // System.out.println(p.secret); // ❌ private: not accessible

        p.showInfo();  // ✅ method is public, so this works
    }
}
