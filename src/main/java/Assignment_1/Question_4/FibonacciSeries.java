package Assignment_1.Question_4;

import java.util.Scanner;

/**
 * print fibonacci Series
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        var n = sc.nextInt();

        var firstTerm = 0L;
        var secondTerm = 1L;

        System.out.print("Fibonacci Series: ");

        for (var i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Update the terms using only firstTerm and secondTerm
            secondTerm = firstTerm + secondTerm;
            firstTerm = secondTerm - firstTerm;
        }

        sc.close();
    }
}

