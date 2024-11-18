package Assignment_2.Question_10;


import java.util.Scanner;

/** 10
 * Write a java program that accomplish the following task :
 *
 *  #Create an array of integers to store student score in a class
 *  #Find and print highest and lowest
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the student: ");
        int n = sc.nextInt();

        Student[] student = new Student[n];

        System.out.println("------ Enter Student Details: ----- ");


        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();


            System.out.print("Enter student Score: ");
            int score = sc.nextInt();

            student[i] = new Student(name, score);
        }


        int highestScore = student[0].score;
        int lowestScore = student[0].score;
        String highestScorerName = student[0].name;
        String lowestScorerName = student[0].name;


        for (int i = 1; i < n; i++) {
            if (student[i].score > highestScore) {
                highestScore = student[i].score;
                highestScorerName = student[i].name;
            }
            if (student[i].score < lowestScore) {
                lowestScore = student[i].score;
                lowestScorerName = student[i].name;
            }
        }

        System.out.println("Highest Score: " + highestScore + " by " + highestScorerName);
        System.out.println("Lowest Score: " + lowestScore + " by " + lowestScorerName);

    }
}