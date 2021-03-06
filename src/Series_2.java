/*
This code prints the first N fibonacci numbers
1
1
1 + 1 = 2
1 + 2 = 3
2 + 3 = 5
3 + 5 = 8...
 */
import java.util.Scanner;
public class Series_2 {
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.print("Fibonacci series:\t");
        int f0 = 0, f1 = 1, i;
        if (n < 1)
            return;
        for (i = 1; i <= n; i++)
        {
            System.out.print(f1 + "\t");
            int f3 = f0 + f1;
            f0 = f1;
            f1 = f3;
        }
    }
}

/*
Enter the value of n:
10
Fibonacci series:	1	1	2	3	5	8	13	21	34	55
 */
