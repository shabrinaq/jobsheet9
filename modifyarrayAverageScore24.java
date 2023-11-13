import java.util.Scanner;

/**
 * modifyarrayAverageScore24
 */
public class modifyarrayAverageScore24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        double average;
        int totalPassed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = input24.nextInt();
            if (score[i] > 70) {
                System.out.println("Student " + (i + 1) + "Passed!");  
                totalPassed++;      
            }
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);
    }
}