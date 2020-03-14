import java.util.Scanner;

public class pyramid2 {
    public static void main(String[] args) {
        int n, i, j, k;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) //Loop throught the rows
        {
            for (j = n - i; j > 0; j--)    //Loop through the columns
            {
                System.out.print(" ");
            }
            for (k = i; k > 0; k--)  //Print the pattern
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