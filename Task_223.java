import java.util.Scanner;

public class Task_223 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

            if (arr[i] > arr[max]) max = i;
        }

        int res = 0;

        for(int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;

                    res++;
                }
            }

        }

        System.out.print(res);
    }
}
