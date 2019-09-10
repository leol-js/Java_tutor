import java.util.Scanner;

public class Task_3063 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        int p = s.nextInt();
        int y = s.nextInt();
        int res = 0;

        while(x < y){
            x = x + x * (p / 100.0);
            x = ((int)(x * 100))/100.0;
            res++;
        }
        System.out.println(res);
    }
}
