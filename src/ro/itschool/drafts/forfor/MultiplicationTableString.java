package ro.itschool.drafts.forfor;

public class MultiplicationTableString {

    public static void main(String[] args) {
        System.out.println(sayHello(5));
    }

    public static String sayHello(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int total = n * i;
            sb.append(i).append(" * ").append(n).append(" = ").append(total).append("\n");
        }
        return sb.toString();
    }
}