package math.problems;

public class MakePyramid {
    public static void pyramid(int p) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        for(int i = 0; i < p; ++i) {
            int j;
            for(j = p - i; j > 1; --j) {
                System.out.print(" ");
            }


            for(j = 0; j <= i; ++j) {
                System.out.print("* ");
            }


            System.out.println();
        }


    }


    public static void main(String[] args) {
        int p = 6;
        pyramid(p);
    }
}