import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BankAccount myAcc = new BankAccount("Nani",100.0,1000700);
        System.out.println("please enter code: ");

        while(true){
        long accNum = input.nextLong();
        if (accNum == 1234567) {    
            System.out.println("correct!");
            break;  
    
        }
        else {
            System.out.println("incorrect password! Try again.");
        }   
        
    }


        System.out.println("Welcome " + myAcc.owner);
        System.out.println("account number: " + myAcc.accountNumber + " balance: $" + myAcc.balance );
        System.out.println("1. Deposit: ");
        System.out.println("2. Withdraw: ");
        System.out.println("3. Exit: ");


        while (true) {
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
 
            if (choice == 1) {
                System.out.print("Amount to deposit: ");
                double amt = input.nextDouble();
                myAcc.deposit(amt);
            } 
            else if (choice == 2) {
                System.out.print("Amount to withdraw: ");
                double amt = input.nextDouble();
                myAcc.withdraw(amt);
            } 
            else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
