/*
1 + 4*1 = 5
5 + 4*2 = 13
13 + 4*4 = 29
29 + 4*5 = 49
49 + 4*7 = 77

a + 4*i = b
If i is not divisible by 3, then increment i by 1.
Otherwise increment i by 2.
 */

import java.util.Scanner;

public class Seq_6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Sequence 5:");
        int i = 1, j = 1;
        if (n > 0) {
            while (i <= n) {
                if (j % 3 != 0) {
                    System.out.print(i + " ");
                    i = i + 4 * j;
                }
                j++;
            }
        }
    }
}

/*
Enter the value of n:
120
Sequence 5:
1 5 13 29 49 77 109 
 */