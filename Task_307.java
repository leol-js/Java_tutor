import java.util.Scanner;
public class Task_307 {
    public static double f (double a, int n) {
        double b = 1;
        for (int i = 1; i <= n; i++) {
            b = b * a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        int n = s.nextInt();
        System.out.println(f(a, n));
    }
}