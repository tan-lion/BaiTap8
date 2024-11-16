package bank_account;

public class Main {
    public static void main(String[] args) {

        //declare
        BankAccount bankAccount=new BankAccount();

        //input
        bankAccount.setAccount_number(987654321);
        bankAccount.setBalance(500000);
        bankAccount.display_balance();

        //deposit
        bankAccount.deposit(100000);
        bankAccount.display_balance();

        //withdraw
        bankAccount.withdraw(50000);
        bankAccount.display_balance();
    }
}
