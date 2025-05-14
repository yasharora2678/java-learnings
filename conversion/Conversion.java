package conversion;

public class Conversion {
    public static void main(String[] args) {
        // Automatic Conversion (Widening Conversion)
        // int num = 100;
        // double price = num;

        // System.out.println(price);
        // Narrowing (Downcasting) or Explicit Conversion
        // double price = 99.99;
        // int num = price; // ❌ ERROR! Cannot convert double to int automatically.

        double price = 99.99;
        int num = (int) price; // ✅ Explicit conversion from double → int

        System.out.println(num); // Output: 99 (Decimal part lost)

        // Promotion During Expression (Automatic Upcasting)

        byte a = 10;
        byte b = 20;
        int result = a + b; // ✅ Java automatically promotes byte to int

        System.out.println(result); // Output: 30

        // Explicit Casting During Expression
        // byte a1 = 50;
        // byte b1 = 50;
        // byte result1 = a1 + b1; // ❌ ERROR! 'int' cannot be assigned to 'byte'

        byte a1 = 50;
        byte b1 = 50;
        byte result1 = (byte) (a1 + b1); // ✅ Explicit conversion from int → byte

        System.out.println(result1); // Output: 100

    }
}
