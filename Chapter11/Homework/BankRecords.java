package Chapter11.Homework;
//Created by Safeeullah Saifuddin
//Java 26B
//Chapter 11 Homework

import java.io.*;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BankRecords {
    public static void main(String[] args) {
        System.out.println("Creating bank accounts");

        int accNum;
        String accName;
        double accBalance;
        Scanner keyboard = new Scanner(System.in);
        int accNummm;

        Random rand = new Random();

        File file = new File("randomaccessfile.txt");

//        Writing Objects to file
        try {
            FileOutputStream FOS = new FileOutputStream(file);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);

            for (int i = 0; i < 1000; i++) {
                accNum = rand.nextInt(1000) + 1;
                accName = getRandomString();
                accBalance = ThreadLocalRandom.current().nextDouble(0, 99000);

                Chapter11.Lab.Homework.BankAccount BA = new Chapter11.Lab.Homework.BankAccount(accNum, accName, accBalance);
                OOS.writeObject(BA);
            }
            OOS.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Reading Objects From File
        try {
            ArrayList<Chapter11.Lab.Homework.BankAccount> recordsArray = new ArrayList<>();
            FileInputStream FIS = new FileInputStream(file);
            ObjectInputStream OIS = new ObjectInputStream(FIS);

            Chapter11.Lab.Homework.BankAccount currentRecord;
            for (int i = 0; i < 1000; i++) {
                currentRecord = (Chapter11.Lab.Homework.BankAccount) OIS.readObject();
                recordsArray.add(currentRecord);
            }

            Collections.reverse(recordsArray);
            OIS.close();

            for (Chapter11.Lab.Homework.BankAccount ba : recordsArray) {
                System.out.println(ba.toString());
            }

            System.out.println("Enter account number to search for");
            accNummm = keyboard.nextInt();

            for (Chapter11.Lab.Homework.BankAccount ba: recordsArray){
                if (ba.getAccountNumber() == accNummm){
                    System.out.println("Account balance for Account Number " + ba.getAccountNumber() + " is " + ba.getAccountBalance());
                    break;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }






    }

    private static String getRandomString() {
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder st = new StringBuilder();
        Random rnd = new Random();
        while (st.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            st.append(CHARS.charAt(index));
        }
        String Str = st.toString();
        return Str;

    }
}
