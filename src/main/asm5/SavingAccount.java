package main.asm5;

public class SavingAccount extends BankAccount{
    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double Tong = amount*1.02;
        if (amount >0 && amount <= balance){
            balance = balance - Tong;
        }
    }
}
