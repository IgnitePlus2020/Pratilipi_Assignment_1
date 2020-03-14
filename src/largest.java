import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a, b, c, max1 = 0, max2 = 0;
        System.out.println("Enter 3 values:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a > b && a > c) {
            max1 = a;
            if (b > c)
                max2 = b;
            else
                max2 = c;
        } else if (b > a && b > c) {
            max1 = b;
            if (a > c)
                max2 = a;
            else
                max2 = c;
        } else if (c > a && c > b) {
            max1 = c;
            if (a > b)
                max2 = a;
            else
                max2 = b;
        }
        System.out.println(max1 + " is largest");
        System.out.println(max2 + " is second largest");

    }

}

/*
Enter 3 values:
10 20 30
30 is largest
20 is second largest
 */