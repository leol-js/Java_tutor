import java.util.Scanner;

public class Task_3075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();

        int a1 = 1;
        int a2 = 1;
        int count = 2;

        while (a2 < A) {
            a2 = a1 + a2;
            a1 = a2 - a1;

            count++;
        }

        System.out.println((a2 == A)? count : -1);
    }
}
