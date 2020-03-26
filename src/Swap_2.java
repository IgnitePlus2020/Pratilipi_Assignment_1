import java.util.Scanner;
public class Swap_2 {
    public static void main(String[] args)
    {
        int num1, num2, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the value of a:  ");
        num1= in.nextInt();
        System.out.print("\nEnter the value of b:  ");
        num2 = in.nextInt();
        System.out.println("\nBefore swap:\na = " + num1 + "\nb = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter swap:\na = " + num1 + "\nb = " + num2);
    }
}

/*
Enter the value of a:  2

Enter the value of b:  5

Before swap:
a = 2
b = 5

After swap:
a = 5
b = 2

 */