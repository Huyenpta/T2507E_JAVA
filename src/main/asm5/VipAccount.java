package main.asm5;

public class VipAccount extends BankAccount{
    public VipAccount() {
    }

    public VipAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount >0){
            balance = balance + (amount*1.01);
        }
    }
}
