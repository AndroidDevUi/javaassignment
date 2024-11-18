package Assigment1.constractor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name - ");
        var name = sc.nextLine();

        System.out.print("Enter Roll Number - ");
        var rollNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Department - ");
        var dep = sc.nextLine();


        Student student1 = new Student();
        System.out.println("\nUsing Default Constructor:");
        student1.displayInformation();


        Student student2 = new Student(name, rollNumber, dep);
        System.out.println("\nUsing Parameterized Constructor:");
        student2.displayInformation();
    }
}
