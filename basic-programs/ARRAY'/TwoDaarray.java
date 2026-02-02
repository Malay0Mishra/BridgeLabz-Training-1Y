import java.util.Scanner;


public class TwoDaarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[row][cols];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                arr [i][j] = sc.nextInt();
            }

        }System.out.println("Your matrix is : ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                
                System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
        }

    }
}