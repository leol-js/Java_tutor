import java.util.Scanner;

public class Task_153 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }

    private static long fibo(int n) {
        if (n < 3) return 1;
        return fibo(n - 2, 1, 1);
    }

    private static long fibo(int count, long a, long b) {
        if (count == 1) return a + b;
        return fibo(count - 1, b, a + b);
    }
}
