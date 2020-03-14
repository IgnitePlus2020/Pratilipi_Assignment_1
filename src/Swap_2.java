import java.util.Scanner;
public class Swap_2 {
    public static void main(String[] args)
    {
        int a, b, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the value of a:  ");
        a= in.nextInt();
        System.out.print("\nEnter the value of b:  ");
        b = in.nextInt();
        System.out.println("\nBefore swap:\na = " + a + "\nb = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter swap:\na = " + a + "\nb = " + b);
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