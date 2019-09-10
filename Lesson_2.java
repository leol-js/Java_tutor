import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
//        fun(5, 20, '+', '-');
//        fun_1(5, '-');
//        fun_2(10000);
        fun_5();
    }

    private static void fun_5() {
        int a = 0;
        int b = 0;
        int c = 200;

        while (a + b + c >= 109) {
            c -= 10;
            b += 1;
        }

        while (a + b + c >= 101) {
            if (b > 1) {
                b -= 2;
                a += 1;
            } else {
                c -= 20;
                a += 1;
            }
        }

        if (a + b + c == 100) {
            System.out.println(a + " " + b + " " + c);
        }
    }

    private static void fun_4() {
//        for (int i = 1000; i < 10000; i++) {
//            int d = i % 10;
//            int c = (i / 10) % 10;
//            int b = (i / 100) % 10;
//            int a = i / 1000;
//
//            int ab = a * 10 + b;
//            int cd = c * 10 + d;
//
//            if (ab - cd == a + b + c + d) {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if ((i * 10 + j) - (k * 10 + l) == (i + j + k + l)) {
                            System.out.println(i * 1000 + j * 100 + k * 10 + l);
                        }
                    }
                }
            }
        }

    }

    private static void fun_3() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();

            if (n != 1) {
                if (simple_int(n)) {
                    System.out.println(n);
                }
            }

//            boolean res = true;
//            for (int j = 2; j < n && res; j++) {
//                if (n % j == 0) {
//                    res = false;
//                }
//            }
//
//            if (res) {
//                System.out.println(n);
//            }
        }
    }

    private static boolean simple_int(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    private static void fun_2(int   n) {
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }

    private static void fun_1(int n, char s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(s);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    private static void fun(int n, int m, char c, char s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}
