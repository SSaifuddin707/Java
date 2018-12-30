package Chapter16.Homework;

import java.util.Scanner;

class PalPartitioning
{
    public static boolean isPalindrome(String X, int i, int j)
    {
        while (i <= j) {
            if (X.charAt(i++) != X.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static int minPalinPartition(String X, int i, int j)
    {

        if (i == j || isPalindrome(X, i, j)) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++)
        {
            int count = 1 + minPalinPartition(X, i, k) +
                    minPalinPartition(X, k + 1, j);

            if (count < min)
                min = count;
        }

        return min;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string:");
        String X = keyboard.nextLine();

        System.out.print("The minimum cuts required are "
                + minPalinPartition(X, 0, X.length() - 1));
    }
}
