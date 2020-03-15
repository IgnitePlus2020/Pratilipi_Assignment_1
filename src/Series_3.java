/*
The series contains two series with alternate numbers forming different series.
1. 1,4,7,10.. forms one series
2. -2,-6,-10,-14.. forms another series.

Pattern for first series is:
4=1+3
7=4+3
10=7+3

Similarly for other series:
-6=-2–4
-10=-6–4
-14=-10–4
 */

import java.util.Scanner;

public class Series_3 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int a = 1, b = -2;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(a + "\t");
                a = a + 3;
            } else {
                System.out.print(b + "\t");
                b = b - 4;
            }
        }
    }
}

/*
Enter the value of n:
10
1	-2	4	-6	7	-10	10	-14	13	-18
 */
