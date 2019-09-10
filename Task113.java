import java.util.Scanner;

public class Task113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 1; i <= Math.sqrt(N); i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }
}

