package Chatper11;
import Chapter9.Account;
import java.util.Date;


public class SavingsAccount extends Account { // question 3

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Savings Account: Unable to withdraw");
    }

}
