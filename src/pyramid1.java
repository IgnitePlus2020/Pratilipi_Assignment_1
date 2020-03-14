import java.util.Scanner;

public class pyramid1 {
    public static void main(String[] args) {
        int n, i, j;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) //Loop through the rows
        {
            for (j = 1; j <= i; j++) //Loop through the columns
                System.out.print("* ");
            System.out.println();
        }

    }
}

/*
Enter the value of n:
5
*
* *
* * *
* * * *
* * * * *
 */
