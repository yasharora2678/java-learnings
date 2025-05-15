package locking;

//Basic Singleton
// class Singleton {
//     private static Singleton instance;
//     private Singleton() {}

//     public static Singleton getInstance() {
//         if(instance == null) {
//             instance = new Singleton();
//         }
//         return instance;
//     }
// }

///Synchronized Method - it makes one by one call if two instance calls at one time but lead to performance overhead
// class Singleton {
//     private static Singleton instance;

//     private Singleton() { }

//     public static synchronized Singleton getInstance() {
//         if (instance == null) {
//             instance = new Singleton(); // thread-safe but slow
//         }
//         return instance;
//     }
// }

// This improves performance by checking twice: once without locking, and once with locking.
// class Singleton {
//     private static volatile Singleton instance; // volatile keyword is important

//     private Singleton() { }

//     public static Singleton getInstance() {
//         if (instance == null) { // first check (no lock)
//             synchronized (Singleton.class) {
//                 if (instance == null) { // second check (with lock)
//                     instance = new Singleton();
//                 }
//             }
//         }
//         return instance;
//     }
// }

//Bill Pugh Solutionhavign a static inner class for returning instance
class Singleton {

    private Singleton() { }

    // inner static helper class
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}

public class locking {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

    }
}
