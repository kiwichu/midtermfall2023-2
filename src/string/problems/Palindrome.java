package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome string");
        } else {
            System.out.println(input + " is not a palindrome string");
        }


    }


    public static boolean isPalindrome(String str) {
        int left = 0;


        for(int right = str.length() - 1; left < right; --right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }


            ++left;
        }


        return true;
    }
}

