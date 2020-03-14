import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n, temp=0, rev = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        temp = n;
        while (temp != 0) {
            rev += temp % 10;
            rev *= 10;
            temp /= 10;
        }
        rev /= 10;
        System.out.println("Original number: " + n);
        System.out.println("Reverse number: " + rev);
    }

}

/*
Enter the value of n:
12345
Original number: 12345
Reverse number: 54321
 */
