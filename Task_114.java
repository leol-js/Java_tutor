import java.util.Scanner;

public class Task_114 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String b = sumOfDigit(a);

        System.out.println(b);
    }

    public static String sumOfDigit(int a) {
        String s = Integer.toBinaryString(a);
        StringBuilder b = new StringBuilder();

        while (s.length() > 0) {
            char c = s.charAt(s.length() - 1);
            s = s.substring(0, s.length() - 1);

            b.append(c);
        }
        return b.toString();
    }
}
