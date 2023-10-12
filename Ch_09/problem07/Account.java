package Ch_09.problem07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthlyInterestRate=getAnnualInterestRate()/12;
        return monthlyInterestRate*balance;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdraw done, and your balance now is : "+getBalance());
        }else {
            System.out.println("Can't withdraw!, Your current balance is : "+balance);
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit done, and your balance now is : "+getBalance());
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", monthly interest=" + getMonthlyInterestRate() +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
