import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new InputStreamReader(new FileInputStream("test.in")));
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        sum(s1);
        sum(s2);
    }

    private static void sum(String s1) {
        int sum = 0;
        int i = 0;
        while (i < s1.length()) {
            char c = s1.charAt(i);

            if (Character.isDigit(c)) {
                sum += Integer.parseInt(Character.toString(c));
            }
            i++;
        }
        System.out.println(sum);
    }
}
