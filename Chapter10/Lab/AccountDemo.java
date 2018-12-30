package Chapter10.Lab;
//  Created by Safeeullah Saifuddin
//  09/05/2018
//  CSP 26B Ch 10 Lab

import java.util.Scanner;

public class AccountDemo {

    public static SavingsAccount savingsAccount;
    public static double annualInterestRate;
    public static Scanner keyboard = new Scanner(System.in);
    public static double balance;

    public static void main(String[] args) {
        resetProgram();
    }

    public static void mainMenu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("What would you like to do?");

        System.out.println(
                "1. Deposit\n" +
                "2. Withdraw\n" +
                "3. Monthly Process\n" +
                "4. Account Info \n" +
                "5. Change Balance\n" +
                "6. Exit");

        int menuItem = keyboard.nextInt();

        switch (menuItem) {
            case 1:
                System.out.println("How much do you want to deposit?");
                double dep = keyboard.nextDouble();
                savingsAccount.deposit(dep);
                mainMenu();
                break;
            case 2:
                System.out.println("How much do you want to withdraw?");
                double with = keyboard.nextDouble();
                savingsAccount.withdraw(with);
                mainMenu();

                break;
            case 3:
                savingsAccount.monthlyProcess();
                mainMenu();

                break;
            case 4:
                savingsAccount.tostring();
                mainMenu();
                break;
            case 5:
                resetProgram();
                break;
            case 6:
                System.out.println("Thank you for using Bank Account Java Demo!");
                break;
            default:
                System.out.println("Please enter a correct menu item [1-6]");
                mainMenu();
                break;

        }

    }

    public static void resetProgram() {
        System.out.println("Welcome to Bank Account Java Demo!");
        askForBalance();
        mainMenu();
    }

    public static void askForBalance() {
        System.out.println("Please enter your current account balance!");
        balance = keyboard.nextDouble();
        if (balance > 0) {
            askForAnnualRate();
        } else askForBalance();
    }

    private static void askForAnnualRate() {
        System.out.println("Please enter your annual interest rate");
        annualInterestRate = keyboard.nextDouble();
        if (annualInterestRate > 0) {
            savingsAccount = new SavingsAccount(balance, annualInterestRate);
        } else askForAnnualRate();

    }
}
