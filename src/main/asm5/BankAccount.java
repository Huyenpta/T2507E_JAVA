package main.asm5;

public class BankAccount {
    private String accountNumber;
    Double balance;

    public BankAccount(){

    }

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount >0) {
            balance = balance+amount;
        }
    }

    public void withdraw(double amount){
        if (amount >0 && amount<=balance){
            balance = balance - amount ;
        }
    }

    public void printBalance(){
        System.out.println("Số tiền dư còn lại trong tài khoản là: " +balance);
    }
}
