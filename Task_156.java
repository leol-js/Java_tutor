import java.util.Scanner;

public class Task_156 {
    static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);
        rec(s.nextInt(), s.nextInt());
    }

    public static void rec(int count, int val) {
        if (count > 1) {
            rec(--count, s.nextInt());
        }
        System.out.print(val + " ");
    }
}
