package people;

public class Person {
    public String name = "Alice";            // accessible everywhere
    protected int age = 30;                  // accessible in subclass / same package
    String city = "New York";                // default (package-private)
    private String secret = "MySecret123";   // only accessible within Person class

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Secret: " + secret);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.showInfo();
    }
}