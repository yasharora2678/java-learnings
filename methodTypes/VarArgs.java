package methodTypes;

public class VarArgs {
    static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); // Output: 1 2 3 4 5
    }
}
