package pattern;

public class Pattern {

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }
}
