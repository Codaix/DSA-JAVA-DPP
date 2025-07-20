/*"Print a hollow square pattern of n rows and n columns using *. eg :-
****
*   *
*   *
****"
Input a number n. Print the sum of all numbers from 1 to n without using any formula.*/
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // 1. Print Hollow Square
        System.out.println("Hollow Square Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print * if it's the first or last row/column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2. Calculate Sum from 1 to n (without formula)
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
