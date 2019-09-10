import java.util.Scanner;

public class Task_3070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int prev = Integer.MAX_VALUE;
        int count = 0;
        int a = s.nextInt();
        while (a != 0) {
            if (prev < a) {
                count++;
            }
            prev = a;
            a = s.nextInt();
        }
        System.out.println(count);
    }
}
