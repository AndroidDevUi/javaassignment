package Assignment_1.Question_3;

import java.util.Scanner;

/**
 * find the biggest of four number
 */
public class FindBiggestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Four number ");

        var largest = Math.max(Math.max(sc.nextInt(), sc.nextInt()),
                Math.max(sc.nextInt(), sc.nextInt()));

        System.out.println("The biggest  number is: " + largest);

        sc.close();
    }


}
