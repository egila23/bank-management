import java.util.Scanner;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        BankAccount account = new BankAccount(accountHolder);

        account.deposit(1000);
        account.withdraw(500);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Balance: $" + account.getBalance());

        scanner.close();
    }
}
