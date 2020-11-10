package Chatper11;
import Chapter9.Account;

import java.util.Date;

public class CheckingAccount extends Account { // question 3

    double overdraft;

    public CheckingAccount(int id, double balance, double overdraft) {
        super(id, balance);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double n) {
        double totalWithdrawAmount = overdraft + this.getBalance();

        if (n > totalWithdrawAmount) {
            System.out.println("Over your withdraw limit");
        }
        else {
            this.setBalance(this.getBalance() - n);
        }
    }
}
