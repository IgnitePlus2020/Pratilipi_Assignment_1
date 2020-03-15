import java.util.Scanner;

public class Fact {
    public static int fact(int num) {
        if (num == 0 || num == 1)
            return 1;
        return (num * fact(num - 1));
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value:");
        n = in.nextInt();
        System.out.print("Factorial of " + n + " is: " + fact(n));

    }
}
/*
Enter any value:
5
Factorial of 5 is: 120
 */
