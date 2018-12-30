package Chapter10.Lab;
//  Created by Safeeullah Saifuddin
//  09/05/2018
//  CSP 26B Ch 10 Lab

public class SavingsAccount extends BankAccount {

    private boolean isActiveacc;

    public SavingsAccount(double balance, double annualInterest) {
        super(balance, annualInterest);
        if (getBalance() < 25) {
            isActiveacc = false;
            System.out.println("Balance under $25. Account unactivated!");

        } else {
            isActiveacc = true;
            System.out.println("Account Active!");
        }
    }

    public void withdraw(double withdrawamount) {
        if (isActiveacc) {
            super.withdraw(withdrawamount);
            System.out.println("Withdrew $" + withdrawamount + " Successfully!");

            if (getBalance() < 25) {
                isActiveacc = false;
                System.out.println("Balance under $25. Account unactivated!");
            }
        } else {
            System.out.println("Account is inactive!");
        }
    }

    public void deposit(double dep) {

        super.deposit(dep);
        System.out.println("Deposited $" + dep + " Successfully!");
        if (!isActiveacc) {
            if (getBalance() >= 25) {
                isActiveacc = true;
                System.out.println("Account Activated!");
            }
        }
    }

    public void monthlyProcess() {
        if (getnWithdrawals() > 4) {
            int serviceCharge = getnWithdrawals() - 4;

            setMonthlyServiceCharge(serviceCharge);
            super.monthlyProcess();
            System.out.println("Monthly Service Charged!");
            System.out.println("Account Balance: " + getBalance());

            if (getBalance() < 25) {
                isActiveacc = false;
                System.out.println("Balance under $25. Account unactivated!");
            } else {
                isActiveacc = true;
                System.out.println("Account Active!");
            }

        } else System.out.println("Number of withdrawals under 4, no monthly process due.");
    }


    public void tostring() {
        System.out.println("Account Balance: $" + getBalance()
                + "\nNumber of Monthly Deposits: " + getnDeposits()
                + "\nNumber of Monthly Withdrawals: " + getnWithdrawals()
                + "\nAnnual Interest Rate: %" + getAnnualInterest());
    }
}
