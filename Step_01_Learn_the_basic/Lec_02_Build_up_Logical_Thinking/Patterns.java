package Step_01_Learn_the_basic.Lec_02_Build_up_Logical_Thinking;

import java.util.Scanner;

/* 

Patterns:
- To print pattern we always we nested loops.
- Somehow connect the rows to the columns by forming a logic.
- Observe symmetry in the pattern or check if a pattern is a combination of
  two or more similar patterns.

 */

public class Patterns {

    // Pattern 1:
    // Input: num = 3
    // Output:
    // * * *
    // * * *
    // * * *

    public static void pattern1(int num) {
        for (int row = 0; row < num; row++) { // Outer loop for rows
            for (int col = 0; col < num; col++) { // Inner loop for columns
                System.out.print("*"); // Print a single star
            }
            System.out.println(""); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            System.out.println("Enter the number:");
            int num = sc.nextInt();

            pattern1(num); // Pattern1 -> Rectangular Start Pattern
        }

        sc.close();
    }
}
