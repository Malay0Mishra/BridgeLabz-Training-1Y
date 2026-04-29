public class STB {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" world");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        sb.delete(2, 6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}

