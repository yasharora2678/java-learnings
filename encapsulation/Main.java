package encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);  // Initial balance: 5000
        
        account.deposit(2000);  // ✅ Deposits 2000
        System.out.println("Current Balance: " + account.getAccountBalance());

        account.withdraw(3000);  // ✅ Withdraws 3000
        System.out.println("Current Balance: " + account.getAccountBalance());

        account.withdraw(6000);  // ❌ Fails (not enough balance)
    }
}
