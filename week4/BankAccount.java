package week4;

public class BankAccount {
    
    double balance;
    
    public BankAccount(){
        balance += 100.00;
    }

    public BankAccount(double n){
        balance = n;
    }

    public void withdraw(double n){
        balance -= n;
    }

    public void deposit(double n){
        balance += n;
    }

    public String toString(){
        return("The balance is " + balance);
    }

    public double setBalance(double n){
        balance += n;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

}
