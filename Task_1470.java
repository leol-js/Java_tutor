import java.util.Scanner;

public class Task_1470 {
    private static int[][] res;
    private static int N;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        res = new int[N][N];
        f1(0, 0, 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void f1(int i, int j, int k) {
        for (int l = j; l < N - j - 1; l++) {
            res[i][l] = k;
            k += 1;
        }
        if (k < N * N) f2(i, N - j - 1, k);
    }

    private static void f2(int i, int j, int k) {
        for (int l = i; l < N - i - 1; l++) {
            res[l][j] = k;
            k += 1;
        }
        if (k < N * N) f3(N - i - 1, j, k);
    }

    private static void f3(int i, int j, int k) {
        for (int l = j; l > N - j - 1; l--) {
            res[i][l] = k;
            k += 1;
        }
        if (k < N * N) f2(i, N - j - 1, k);
    }

    private static void f4(int i, int j, int k) {
        for (int l = i; l > N - i - 1; l--) {
            res[l][j] = k;
            k += 1;
        }
        if (k < N * N) f3(N - i - 1, j, k);
    }
}
