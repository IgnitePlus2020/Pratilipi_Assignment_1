import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args)
    {
        int n, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        for(int i = 0; i <= n; i += 2)
            sum += i;
        System.out.println("Sum of even numbers: " + sum);

    }
}

/*
Enter the value of n:
10
Sum of even numbers: 30

 */

