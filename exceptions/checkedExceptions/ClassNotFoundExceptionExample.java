package exceptions.checkedExceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> class1 = Class.forName("exceptions.checkedExceptions.FileNotFoundExceptionExample");
            System.out.println(class1);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

