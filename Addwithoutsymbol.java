import java.util.*;

public class Addwithoutsymbol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(solve(a, b));
    }

    public static int solve(int a, int b) {
        while (b != 0) {
            int carr = a & b;
            a = a ^ b;
            b = carr << 1;
        }
        return a;
    }
}