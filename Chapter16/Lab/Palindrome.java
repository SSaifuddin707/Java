package Chapter16.Lab;
//Created by Safeeullah Saifuddin
// 09-20-2018
//Java 26B

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String pString;
        System.out.println("Enter a string for its palindromes");
        pString = keyboard.nextLine();

        displayAllPalindromes(pString);
    }

    private static boolean findPalindrome(String ps) {
       for (int i = 0;i<= ps.length()/2;i++){
           if (ps.charAt(i)!=ps.charAt(ps.length()-1-i)){
               return false;
           }

       }
        return true;
    }
    private static void displayAllPalindromes(String s){
        for (int i = 0; i < s.length()-1;i++){
            for (int j = i; j<s.length();j++){
                if (findPalindrome(s.substring(i, j+1))){
                    System.out.println(s.substring(i, j+1));
                }
            }
        }
    }
}
