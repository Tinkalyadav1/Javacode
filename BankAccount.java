public class BankAccount {
    private double balance;

    // deposit method
    public void deposit(double amount){
        balance =balance + amount;
    }

    // withdraw method
    public void withdraw(double amount){
        balance = balance- amount;
    }

    // getter method
    public double getBalance(){
        return balance;
    }

    // main method inside the same class
    public static void main(String[] args){
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
