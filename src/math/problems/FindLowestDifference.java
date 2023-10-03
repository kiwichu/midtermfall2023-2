package math.problems;

public class FindLowestDifference {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        public static int findSmallestDifference(int[] array1, int[] array2, int a, int b) {
            int minDiff = Integer.MAX_VALUE;
            for(int i = 0; i < a; ++i) {
                for(int j = 0; j < b; ++j) {
                    int diff = Math.abs(array1[i] - array2[j]);
                    if (diff < minDiff) {
                        minDiff = diff;
                    }
                }
            }
            return minDiff;
        }
    public static void main(String[] args) {
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int a = array1.length;
        int b = array2.length;

        System.out.println("The lowest number between the two array cells is: " + findSmallestDifference(array1, array2, a, b));
    }
}
