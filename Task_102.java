import java.util.Scanner;

public class Task_102 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (isDigit(s.next().charAt(0))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isDigit(char c) {
        return (c <= '9' && c >= '0');
    }
}

