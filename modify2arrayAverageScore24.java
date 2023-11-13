import java.util.Scanner;

/**
 * modify2arrayAverageScore24
 */
public class modify2arrayAverageScore24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int[] score = new int[5];
        double total = 0;
        double averagePassed;
        double averageFailed;
        double totalgradePassed = 0;
        double totalgradeFailed = 0;
        int totalStudent = 5;
        int totalPassed = 0;
        int totalFailed = 0;

        System.out.println("Enter the number of students " + totalStudent);

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + (i) + ": ");
            score[i] = input24.nextInt();
            if (score[i] < 70) {
                totalgradeFailed += score[i];
                totalFailed++;
            } else if (score[i] > 70) {
                totalgradePassed += score[i];
                totalPassed++;
                }
        }

        averagePassed = totalgradePassed / totalPassed;
        System.out.println("The average score of student who passed is " + averagePassed);
        averageFailed = totalgradeFailed / totalFailed;
        System.out.println("The average score of student who failed is " + averageFailed);
    }
}