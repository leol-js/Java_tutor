public class Bank{
    private int cash;

    Bank() {
        cash = 0;
    }

    Bank(int c) {
        cash = c;
    }


    public int getCash() {
        cash -= 100;
        return 100;
    }

    public int getCash(int c) {
        if (cash < c) return -1;
        cash -= c;
        return c;
    }


    public int cash() {
        return cash;
    }
}