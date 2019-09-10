import java.util.Scanner;

public class Task_156_2 {
    static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        int n = s.nextInt();
        f(n);
    }

    private static void f(int n) {
        if (n == 1) {
            System.out.print(s.nextInt() + " ");
            return;
        }
        int t = s.nextInt();
        f(n - 1);
        System.out.print(t + " ");
    }
}
