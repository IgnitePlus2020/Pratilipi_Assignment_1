import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        try {
            num = in.nextInt();
            if (num % 2 == 0)
                System.out.println(num + " is EVEN");
            else
                System.out.println(num + " is ODD");
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
