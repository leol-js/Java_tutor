import java.util.Scanner;

public class Task_313 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(C(s.nextInt(), s.nextInt()));
    }

    private static int C(int n, int k) {
        if (k == n || k == 0) return 1;
        return C(n - 1, k - 1) + C(n - 1, k);
    }
}
