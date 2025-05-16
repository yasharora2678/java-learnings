package exceptions.checkedExceptions;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        });

        thread.start();
        thread.interrupt(); // Interrupting the thread
    }
}
