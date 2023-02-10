
public class namePattern {
public static void main(String[] args) {
	int n = 9;
    for (int i = 0; i < n; i++) {
        // print R
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 || i == 0 && j > 0 && j < (n - 1) / 2
                    || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2
                    || i == (n - 1) / 2 && j < (n - 1) / 2 || i - j == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print O
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 && i < n - 1 || i == 0 && j > 0 && j < (n - 1) / 2
                    || j == (n - 1) / 2 && i > 0 && i < n - 1
                    || i == n - 1 && j > 0 && j < (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print H
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print I
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print T
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print R
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 || i == 0 && j > 0 && j < (n - 1) / 2
                    || j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2
                    || i == (n - 1) / 2 && j < (n - 1) / 2 || i - j == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print A
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 || i == 0 && j > 0 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0
                    || i == (n - 1) / 2 && j <= (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print U
        for (int j = 0; j < n; j++) {
            if (j == 0 && i < n - 1 || j == n - 1 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print(" ");
        // print S
        for (int j = 0; j < n; j++) {
            if (i == 0 && j > 0 && j < n / 2 || j == n / 2 && i == 1 || j == 0 && i > 0 && i < n / 2
                    || i == n / 2 && j > 0 && j < n / 2 || j == n / 2 && i > n / 2 && i < n - 1
                    || i == n - 1 && j > 0 && j < n / 2 || i == n - 2 && j == 0)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print H
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print A
        for (int j = 0; j < n; j++) {
            if (j == 0 && i > 0 || i == 0 && j > 0 && j < (n - 1) / 2 || j == (n - 1) / 2 && i > 0
                    || i == (n - 1) / 2 && j <= (n - 1) / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("  ");
        // print N
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || j == i)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
