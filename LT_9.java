public class LT_9 {
    public static void main(String[] args) {
        int x = 1234;
        int m = 0;
        while(x > 0){
            int digit = x %10;
            m = m *10 + digit;
            x = x/10;
        }
        if(x==m){
            return true;
        }
    }
    
}
