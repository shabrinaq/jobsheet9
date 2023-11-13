import java.util.Scanner;

/**
 * modifyarrayValue24
 */
public class modifyarrayValue24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int[] finalScore = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = input24.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + i + "Passed!");
            } 
            else {
                System.out.println("Student " + i + "Failed!");
            }
        }
    }
}