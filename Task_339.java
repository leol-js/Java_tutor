import java.util.Scanner;

public class Task_339 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i;
        for (i = 2; i <= x; i++) {
            if (x % i == 0) {
                break;
            }
        }
        System.out.println(i);

    }
}
