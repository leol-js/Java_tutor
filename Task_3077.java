import java.util.Scanner;

public class Task_3077 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = 1;
        int sum = 1;
        int a = -1;
        int p;
        do {
            p = a;
            a = s.nextInt();

            if (p == a) {
                k++;
            } else {
                if (k > sum) {
                    sum = k;
                }
                k = 1;
            }
        } while (a != 0);

        System.out.println(sum);
    }
}
