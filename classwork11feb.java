public class classwork11feb {
    int add(int a , int b){
        return a+b; 
    }
    int add(int a , int b , int c ){
        return a+b+c;
    }
    double add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
          classwork11feb obj = new classwork11feb();
          System.out.println(obj.add(5,10));
          System.out.println(obj.add(5,10,15));
          System.out.println(obj.add(5,10,15,20));
    }
    
}
