/*
First term = 1+0 = 1
2nd term = 1+1² = 2
3rd term = 2+2² = 6
4th term = 6+3² = 15
5th term = 15+4² = 31
6th term = 31+5² = 56

Starting with index = 0, every odd indexed value is negated.
 */

import java.util.Scanner;

public class Series_1 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr the value of n:");
        n = in.nextInt();
        int base = 1, rep = 0, i = 0;
        while (rep < n) {
            rep = base + (i * i);
            if (i % 2 != 0)
                System.out.print(rep * (-1) + "\t");
            else
                System.out.print(rep + "\t");
            base = rep;
            i += 1;
        }
    }
}

/*
Enetr the value of n:
100
1	-2	6	-15	31	-56	92	-141
 */