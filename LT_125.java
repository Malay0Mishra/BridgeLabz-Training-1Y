public class LT_125 {
    public static void main(String[] args) {
        String s = "Hello";
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n = n + s.charAt(i);
        }
        if (n.equals(s)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }
    }
}