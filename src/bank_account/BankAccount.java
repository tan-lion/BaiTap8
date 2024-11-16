package bank_account;

public class BankAccount {
    private int account_number;
    private double balance;

    public BankAccount(int account_number, double balance) {
        this.account_number=account_number;
        this.balance=balance;
    }

    public BankAccount(){

    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void display_balance(){
        System.out.println("Account balance: "+this.balance);
    }
}
