import java.util.Scanner;

public class Task_112195 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(fibo(s.nextInt()));
    }

    private static long fibo(int n) {
        if (n < 2) return 1;
        int a = 1;
        int b = 1;

        while (n > 1) {
            int tmp = a + b;
            a = b;
            b = tmp;

            n--;
        }

        return b;
//        return fibo(n - 2, 1, 1);
    }

    private static long fibo(int n, long a, long b) {
        if (n == 1) return a + b;
        return fibo(n - 1, b, a + b);
    }
}
