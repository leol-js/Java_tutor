import java.util.Scanner;

public class Task341 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int res = 1;

        if (n != 1) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    res++;
                }
            }
            if (n % (int) Math.sqrt(n) == 0) {
                res = res * 2 + 1;
            } else {
                res *= 2;
            }
        }

        System.out.println(res);
    }
}