
class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private float balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, float balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Deposit
    float deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }

        return this.balance;
    }

    // Withdraw
    float withdraw(float amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal Successful");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else {
            System.out.println("Not Enough Balance");
        }

        return this.balance;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    // Setters
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    // Display current balance
    public void printBalance() {
        System.out.println("Your Balance is: " + this.balance);
    }
}

class Hello {

    public static void main(String[] args) {

        System.out.println("Welcome To SBI Bank");

        BankAccount b1
                = new BankAccount("Nikhil Sharma", 1234567890, 5000);

        System.out.println("Account Holder: " + b1.getAccountHolder());
        System.out.println("Account Number: " + b1.getAccountNumber());

        b1.printBalance();

        b1.deposit(2000);
        b1.printBalance();

        b1.withdraw(1500);
        b1.printBalance();

        // Test insufficient balance
        b1.withdraw(10000);
        b1.printBalance();

        // Test invalid deposit
        b1.deposit(-500);
        b1.printBalance();
    }
}
