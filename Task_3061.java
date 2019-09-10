import java.util.Scanner;

public class Task_3061 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int n = s.nextInt();

        while (a < n) {
            a *= 2;
        }

        System.out.println((a == n)? "YES" : "NO");
    }
}
