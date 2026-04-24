class BankAccount {
    String owner;
    double balance;
    long accountNumber;
    

    
    public BankAccount(String owner, double startingMoney, long accountNumber) {
        this.owner = owner;
        this.balance = startingMoney;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Done! New balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Done! Remaining: $" + balance);
        } else {
            System.out.println("Not enough money!");
        }
    }
}

