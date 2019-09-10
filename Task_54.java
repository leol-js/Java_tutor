import java.util.ArrayList;
import java.util.Scanner;

public class Task_54 {
    public static class Steck {
        private ArrayList<Integer> steck = new ArrayList<>();

        public void push(int n) {
            steck.add(n);
            System.out.println("ok");
        }

        public void pop() {
            System.out.println(steck.remove(steck.size() - 1));
        }

        public void back() {
            System.out.println(steck.get(steck.size() - 1));
        }

        public void size() {
            System.out.println(steck.size());
        }

        public void clear() {
            steck = new ArrayList<>();
            System.out.println("ok");
        }

        public void exit() {
            System.out.println("bye");
        }
    }

    public static void main(String[] args) {
        Steck st = new Steck();
        Scanner s = new Scanner(System.in);

        String e = s.next();

        while (!e.equals("exit")) {
            switch (e) {
                case "push" :
                    st.push(s.nextInt());
                    break;
                case "pop" :
                    st.pop();
                    break;
                case "back" :
                    st.back();
                    break;
                case "size" :
                    st.size();
                    break;
                case "clear" :
                    st.clear();
                    break;
            }
            e = s.next();
        }
        st.exit();
    }
}
