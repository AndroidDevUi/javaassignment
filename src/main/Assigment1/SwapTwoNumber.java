package Assigment1;


/**
 * write a program to swap two number without third variable
 */
public class SwapTwoNumber {
    public static void main(String[] args) {
        int num1 = 15, num2 = 20;

        num1 = num1 + num2;
        num2 = num1- num2;
        num1 = num1 - num2;


        System.out.println("\t After swapping:" +
                "\n First number : " + num1 +
                "\n Second number : " + num2);

    }
}
