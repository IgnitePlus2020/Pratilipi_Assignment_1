import java.util.Scanner;
public class Odd_Sum {
    public static void main(String[] args)
    {
        int n, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        for(int i = 1; i <= n; i += 2)
            sum += i;
        System.out.println("Sum of odd numbers: " + sum);

    }
}

/*
Enter the value of n:
7
Sum of odd numbers: 16
 */

