package exceptions.uncheckedExceptions;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        int str = (int) obj;
        System.out.println(str);
        String str1 = (String) obj; // Invalid casting
    }
}

