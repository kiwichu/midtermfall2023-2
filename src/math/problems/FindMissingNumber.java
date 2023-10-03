package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array1 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        //first have to sort from highest to lowest

        int num1 = 0;

        for (int i = 0; i < array1.length; i++) {
            num1 = num1 + array1[i];
        }
        int num2 = 0;
        for (int i = 1; i <= 10; i++) {
            num2 = num2 + i;
        }

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("The missing number is: " + (num2 - num1));

    }
}
