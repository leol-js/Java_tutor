import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bank b = new Bank(1_000_000);

        b.getCash();
        System.out.println(b.cash());

        System.out.println(b.getCash(1000));
        System.out.println(b.cash());
    }
}
