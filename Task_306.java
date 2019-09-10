import java.util.Scanner;

public class Task_306 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(min(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()));
    }

    static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }

    static int min(int a, int b) {
        return a < b? a : b;
    }
}
