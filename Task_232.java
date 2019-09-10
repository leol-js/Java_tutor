import java.util.Scanner;

public class Task_232 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int position = i;

            for (int j = i; j < n; j++) {
                if (a[j] < a[position]) {
                    position = j;
                }
            }

            int x = a[position];
            a[position]= a[i];
            a[i] = x;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
