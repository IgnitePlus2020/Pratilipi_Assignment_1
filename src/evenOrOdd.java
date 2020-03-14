import java.util.InputMismatchException;
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        try {
            n = in.nextInt();
            if (n % 2 == 0)
                System.out.println(n + " is EVEN");
            else
                System.out.println(n + " is ODD");
        } catch (InputMismatchException e) {
            System.out.println("ERROR!\n" + e);
        }
    }

}

/*
Enter the value of n:
4
4 is EVEN

Enter the value of n:
3
3 is ODD

Enter the value of n:
a
ERROR!
java.util.InputMismatchException
 */
