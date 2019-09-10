import java.util.Scanner;

public class TAsk_113652 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println( f(s.nextInt() - 1)? "YES" : "NO");
    }

    public static boolean f(int n) {
        if (n < 0) return false;
        if (n == 0 || n % 5 == 0) return true;
        return f(n - 3);
    }
}

