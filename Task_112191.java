import java.util.Scanner;

public class Task_112191 {
    public static void kol(int b) {
        int a = 0;
        if (b == 0) {
            System.out.println(1);
        } else {
            while (b > 0) {
                b = b / 10;
                a++;
            }
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        kol(b);
    }
}
