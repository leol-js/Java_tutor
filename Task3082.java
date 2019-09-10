import java.util.Scanner;

public class Task3082 {
    public static final int LIMIT = 100_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        char min = 'A';
        char max = 'B';

        boolean real = false;

        if (b < a) {
            int tmp = a;
            a = b;
            b = tmp;

            min = 'B';
            max = 'A';
        }

        int bV = 0;
        int count = 0;

        do {
            if (b - bV >= a) {
                bV += a;
            } else {
                bV = a - (b - bV);
                count++;
            }
            count++;

            if (n == bV) {
                real = true;
                break;
            }
        } while (count < LIMIT);

        if (real) {
            bV = 0;
            do {
                System.out.printf(">%c\n", min);
                System.out.printf("%c>%c\n", min, max);
                if (b - bV >= a)
                    bV += a;
                else {
                    bV = a - (b - bV);
                    System.out.printf("%c>\n", max);
                    System.out.printf("%c>%c\n", min, max);
                }
            } while (n != bV);
        } else {
            System.out.println("Impossible");
        }
    }
}