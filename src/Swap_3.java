import java.util.Scanner;

public class Swap_3 {
    public static void main(String[] args) {
        int a, b, c, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the value of a:  ");
        a = in.nextInt();
        System.out.print("\nEnter the value of b:  ");
        b = in.nextInt();
        System.out.print("\nEnter the value of c:  ");
        c = in.nextInt();
        System.out.println("\nBefore swap:\na = " + a + "\nb = " + b + "\nc = " + c);
        temp = b;   //Cyclic Swap
        b = a;
        a = c;
        c = temp;
        System.out.println("\nAfter swap:\na = " + a + "\nb = " + b + "\nc = " + c);
    }
}

/*
Enter the value of a:  2

Enter the value of b:  3

Enter the value of c:  4

Before swap:
a = 2
b = 3
c = 4

After swap:
a = 4
b = 2
c = 3

 */
