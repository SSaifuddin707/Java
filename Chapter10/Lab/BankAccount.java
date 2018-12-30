package Chapter10.Lab;
//  Created by Safeeullah Saifuddin
//  09/05/2018
//  CSP 26B Ch 10 Lab

public class BankAccount {
    private double balance;
    private int nDeposits;
    private int nWithdrawals;
    private double annualInterest;
    private double monthlyCharge;


    public BankAccount(double balance, double annualInterest) {
        this.balance = balance;
        this.annualInterest = annualInterest;
    }

    public void deposit(double dep) {
        //add deposit amount to balance
        balance = balance + dep;
        //increment variable holding number of deposits
        nDeposits++;

    }

    public void withdraw(double withdraw) {
        //subtract withdrawal amount from balance
        balance = balance - withdraw;
        //increment number of withdrawals
        nWithdrawals++;
    }

    public void calcInterest() {
        double monthlyInterestRate;
        double monthlyIntterest;
        monthlyInterestRate = annualInterest / 12;
        monthlyIntterest = balance * monthlyInterestRate;
        balance = balance + monthlyIntterest;
    }

    public int getnDeposits() {
        return nDeposits;
    }

    public void monthlyProcess() {
        balance = balance - monthlyCharge;
        calcInterest();
        nDeposits = 0;
        nWithdrawals = 0;
        monthlyCharge = 0;

    }

    public double getBalance() {
        return balance;
    }

    public int getnWithdrawals() {
        return nWithdrawals;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setMonthlyServiceCharge(double serviceCharge) {
        this.monthlyCharge = serviceCharge;

    }
}
