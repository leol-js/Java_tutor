import java.util.Scanner;
public class Task350 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int res = 0;
        for (int x = 0; x < 1001; x++) {
            if ((a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * Math.pow(x, 1) + d) / (x - e) == 0) {
                res++;
            }
        }

        System.out.print(res);
    }
}
