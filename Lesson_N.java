public class Lesson_N {
    public static void pr(int a) {
        System.out.println(a);
    }

    public static void pr(String s) {
        System.out.println(s);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sum(String a, int b, int c) {
        return a + " " + b + " " + c;
    }

    public static int sum(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i];
        }
        return res;
    }

    public static int factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);
    }

    int f() {
        return g();
    }

    int g() {
        return f();
    }

    public static void main(String[] args) {
//        pr(sum(new int[]{1, 1, 1, 1, 1}));

//        int[] a = new int[]{23, 34, 444, 566, 6775, 75};
//        int b = sum(a);
//        pr(b);

//        int a;
//        Integer a1;
//
//        double b;
//        Double b1 = 1.1;
//
//        long c;
//        Long c1 = f(1l, 1l);
//        if (c1 != null) {
//            System.out.println(c1.toString());
//        } else {
//            System.out.println("b = 0");
//        }
    }

    static Long f(Long a, Long b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }
}
