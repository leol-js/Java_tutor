import java.util.Scanner;

public class Lesson_3 {

    public static void main(String[] args) {
        fun_6(100, 10, 200);
    }

    private static void fun_6(int x, int p, int y) {
        int res = 0;
        while (x < y) {
            x = x + x * p / 100;
            res++;
            System.out.println("Годов прошло - " + res + " Денег в банке - " + x + "руб");
        }

        System.out.println(res);
    }


    private static void fun_5(double x, int y) {
        int res = 1;
        while (x < y) {
            x *= 1.1;
            res++;
//            System.out.println("Номер дня - " + res + " Пробежал - " + x + "км");
        }

        System.out.println(res);
    }

    private static void fun_4(int N) {
        int a = 1;

        while (a <= N) {
            System.out.println(a);
            a *= 2;
        }
    }


    private static void fun_3(int N) {
        for (int i = 2; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    private static void fun_2(int N) {
        while (N % 2 == 0) {
            N = N / 2;
        }
        if (N == 1) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }

    private static void fun_1(int N) {
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }
}
