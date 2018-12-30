package Chapter16.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromePartitioning {
    public static void main(String[] args) {
        int mininmum = 0;
        Scanner keyboard = new Scanner(System.in);
        String pString;
        System.out.println("Enter a string for its palindromes");
        pString = keyboard.nextLine();
        if (findPalindrome(pString)){
            System.out.println("Minimum cuts: " + mininmum);
        }else{
            displayAllPalindromes(pString);

        }
    }

    private static boolean findPalindrome(String ps) {
        for (int i = 0; i <= ps.length() / 2; i++) {
            if (ps.charAt(i) != ps.charAt(ps.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static void displayAllPalindromes(String s) {
        ArrayList<String> palList = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j < s.length(); j++) {
                if (!findPalindrome(s.substring(i, j+1 ))) {
                    palList.add(s.substring(i, j+1));
                    System.out.println(palList);
                    removeDuplicates(palList);
                }
            }
        }
    }

    private static void removeDuplicates(ArrayList<String> palList) {
        for (int i=0; i< palList.size(); i++){
            for (int j = i; j < palList.size()-1;j++){
                if (palList.get(i).equalsIgnoreCase(palList.get(j+1))){
                    palList.remove(j+1);
                }
            }
        }
        System.out.println("NO Dupplicates: " +  palList);
    }
}
