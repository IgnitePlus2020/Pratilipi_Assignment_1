import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int X = 0, n = 0, res = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base value:\t");
        X = in.nextInt();
        System.out.print("Enter the exponent value:\t");
        n = in.nextInt();
        int temp = n;
        while (temp > 0) {
            res *= X;
            temp--;
        }
        System.out.println(X + " ^ " + n + " is:\t" + res);
    }
}
/*
Enter the base value:	4
Enter the exponent value:	3
4 ^ 3 is:	64
 */
