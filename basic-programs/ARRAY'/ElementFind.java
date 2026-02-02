import java.util.Scanner;

public class ElementFind{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
    int num = sc.nextInt();
    
    int[] arr = new int[num];
    for(int i =0; i<num; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the number you want to find in the array :");
    
    int x = sc.nextInt();
    for(int i =0; i<num; i++){
        if(arr[i]==x){
            System.out.println("The number is found at index "+ i);
        }
        else{
            System.out.println("No element exists");
        }
        }
     }
     catch(Exception e){
        System.out.println("Invalid Input");
     }
       
        


    }}
    
    

