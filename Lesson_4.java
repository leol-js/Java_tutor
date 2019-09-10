public class Lesson_4 {
    public static final int a = 100;

    public static void main(String[] args) {
        fun_3074(6);
    }

    private void fun_3() {

    }

    private static void fun_3074(int n) {
        int a = 1;
        int b = 1;

        if (n < 3) {
            System.out.println(1);
        } else {
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }

    private static void fun_1(int A) {
        int a = 1;
        int b = 2;
        int count = 3;

        while (b < A) {
            int c = a + b;
            a = b;
            b = c;

            count++;
        }

        if (b == A) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
