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

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println("");
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.err.println("");
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            // j<=5,4,3,2,1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            // j<=5,4,3,2,1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.err.println("");
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // space n=4 j <= 3,2,1,0
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star j <= 1,3,5,7
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("");
            }
            System.err.println(" ");
        }
    }

    static void pattern8(int n) {
        int p = n;
        for (int i = 1; i <= n; i++) {
            // space n=4 j <= 0,1,2
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // star j <=
            // for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
            // System.out.print("*");
            // }

            for (int j = p * 2 - 1; j >= 1; j--) {
                System.out.print("*");
            }
            p--;
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.err.println(" ");
        }
    }

    static void pattern9(int n) {
        // 1st pattern
        for (int i = 1; i <= n; i++) {
            // space n=4 j <= 3,2,1,0
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star j <= 1,3,5,7
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("");
            }
            System.err.println(" ");
        }
        // 2nd pattern
        int p = n;
        for (int i = 1; i <= n; i++) {
            // space n=4 j <= 0,1,2
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = p * 2 - 1; j >= 1; j--) {
                System.out.print("*");
            }
            p--;
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.err.println(" ");
        }
    }

    static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern10(n);
    }
}
