package exceptions.uncheckedExceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception " + e);
        }
    }
}
