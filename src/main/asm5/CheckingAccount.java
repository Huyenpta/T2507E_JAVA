package main.asm5;

public class CheckingAccount extends BankAccount{
    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    private static final double LIMIT = -5000000 ;

    @Override
    public void withdraw(double amount) {
        if (amount>0 && balance - amount >LIMIT){
            balance = balance - amount ;
        }
    }
}
