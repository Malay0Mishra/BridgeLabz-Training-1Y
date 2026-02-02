import java.util.Scanner;

public class ArrInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int row = sc.nextInt();

        int[] arr = new int[row];

        System.out.println("Enter array elements:");
        for (int i = 0; i < row; i++) {
            arr[i] = sc.nextInt();
        }

        // for-each loop to display elements
        System.out.println("Array elements are:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

