package main.asm5;

public class Main {
    public static void main(String[] args) {
        BankAccount[] bankaccounts = {
          new SavingAccount("AC01", 500000.0),
          new CheckingAccount("CA56",300000.0),
          new VipAccount("VA01",6000000.0)
        };
        for (BankAccount v : bankaccounts){
            v.withdraw(100);
            v.deposit(2000);
            v.printBalance();
        }
    }
}
