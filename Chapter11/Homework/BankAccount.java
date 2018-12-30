package Chapter11.Lab.Homework;

import java.io.*;

public class BankAccount implements Serializable{
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return accountNumber + " " + accountHolder + " " + accountBalance;
    }
}
