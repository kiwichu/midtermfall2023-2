package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int first = 0;
        int next = 1;
        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print("" + first + " " + next);


        for (int i = 1; i <= n - 2; ++i) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);


        }
    }
}
