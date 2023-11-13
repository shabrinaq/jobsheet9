import java.util.Scanner;

/**
 * modify2linearSearch24
 */
public class modify2linearSearch24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int totalarray = 6;
        int[] arrayInt = {19,23,29,31,37,43};
        int key = 11;
        int result = 0;

        System.out.println("Enter the number of array elements" + ": " + totalarray);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + (i) + ": ");
            arrayInt[i] = input24.nextInt();
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
            System.out.println("Enter the key you want to search for" + ": " + key);
            System.out.println("Key not found");

    }      
}
