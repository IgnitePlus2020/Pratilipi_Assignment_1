import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base = 0, expo = 0, res = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base value:\t");
        base = in.nextInt();
        System.out.print("Enter the exponent value:\t");
        expo = in.nextInt();
        int temp = expo;
        while (temp > 0) {
            res *= base;
            temp--;
        }
        System.out.println(base + " ^ " + expo + " is:\t" + res);
    }
}
/*
Enter the base value:	4
Enter the exponent value:	3
4 ^ 3 is:	64
 */
