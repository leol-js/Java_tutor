import java.util.Scanner;

public class Task342 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 100; i += 1) {
            sum += s.nextInt();
        }
        System.out.print(sum);

    }
}
