/*
F(1) = 1
F(2) = 4
F(3) = 7
F(4) = F(1) + F(2) + F(3) = 12
 */

import java.util.Scanner;

public class Seq_4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 7;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        System.out.println("Sequence:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "\t");
    }
}
/*
Enter the value of n:
7
Sequence:
1	4	7	12	23	42	77
 */
