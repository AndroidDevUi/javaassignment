package Assignment_4.Question_15;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 15
 * Write a java program to Create a java program that simulates and simple
 * banking system with two type of transaction :
 * deposit and withdrawals
 */
public class Main {
    static BankAccount bankAccount = new BankAccount();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to ABC Bank");
        Boolean isBankOpen = true;
        int option;


        System.out.println(
                "For new Account Creation -> 1" +
                        "\n Login Account -> 2 " +
                        "\n Exit -> 3");

        while (isBankOpen) {
            option = sc.nextInt();
            if (option == 1) {
                newAccountOpen();
            }
            if (option == 2) {

            }
            if (option == 3) {
                isBankOpen = false;
            }

        }


    }

    private static void newAccountOpen() {
        System.out.println("Enter your name - ");
        var name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter deposit ");
        var money = sc.nextInt();
        bankAccount.createNewAccount(
                new User(
                        generateAccountNumber(),
                        name,
                        money

                )
        );
        System.out.println("Account Creation Successfully ");
    }

    public static String generateAccountNumber() {
        SecureRandom secureRandom = new SecureRandom();
        // Generate a random 10-digit number as a String
        String accountNumber = String.format("%010d", Math.abs(secureRandom.nextLong() % 10000000000L));
        return accountNumber;
    }


}
