import java.util.Scanner;

/**
 * arrayValue24
 */
public class arrayValue24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
           if (finalScore[i] > 70) {
                System.out.println("Student " + i + "Passed!");
           }   
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Final score " + i + " is " + finalScore[i]);
        }
    }
}