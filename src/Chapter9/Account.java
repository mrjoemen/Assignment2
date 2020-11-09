package Chapter9;

import java.util.Date;

public class Account { //question 7

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 0, 0, new Date());
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * this.balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    //getters and setters below

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
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
