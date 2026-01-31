import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        while (true){
            System.out.println("Press Q To exit : Or Enter your Marks : ");
            String c = sc.nextLine();
            if(c.equalsIgnoreCase("Q")){
                System.out.println("leaving the site ......");
                break;
            }
            else{
                try {
                    int num = Integer.parseInt(c/);
                    if(num>90){
                        System.out.println("Grade A");
                    }
                    else if(num>80){
                        System.out.println("Grade  B");
                    }
                    else if(num>70){
                        System.out.println("Grade C");
                    }
                    else if(num>60){
                        System.out.println("Grade D");
                    }
                    else{
                        System.out.println("FAIL : Meet the principal office");
                    }
                    
                    
                } catch (Exception e) {
                    System.out.println("This Input is invalid");
                }
            }

        } sc.close();
    }
}
    