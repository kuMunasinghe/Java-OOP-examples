//import java.util.*;
//
public class PyramidPattern {
    public static void main(String args[]) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        piramid();

    }

    public static void piramid() {

        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = row - i; j > 1; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }
            // throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}