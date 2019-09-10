import java.util.Scanner;

public class lesson30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        while (a > b) {
            if (a % 2 == 0 && a >= 2 * b) {
                a /= 2;
                System.out.println(":2");
            } else {
                a -= 1;
                System.out.println("-1");
            }
        }
    }
}