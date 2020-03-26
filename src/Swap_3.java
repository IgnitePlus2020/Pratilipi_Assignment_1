import java.util.Scanner;

public class Swap_3 {
    public static void main(String[] args) {
        int num1, num2, num3, temp;
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the value of a:  ");
        num1 = in.nextInt();
        System.out.print("\nEnter the value of b:  ");
        num2 = in.nextInt();
        System.out.print("\nEnter the value of c:  ");
        num3 = in.nextInt();
        System.out.println("\nBefore swap:\na = " + num1 + "\nb = " + num2 + "\nc = " + num3);
        temp = num2;   //Cyclic Swap
        num2 = num1;
        num1 = num3;
        num3 = temp;
        System.out.println("\nAfter swap:\na = " + num1 + "\nb = " + num2 + "\nc = " + num3);
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
