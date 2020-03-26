import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int num1, num2, num3, max1 = 0, max2 = 0;
        System.out.println("Enter 3 values:");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        if (num1 > num2 && num1 > num3) {
            max1 = num1;
            if (num2 > num3)
                max2 = num2;
            else
                max2 = num3;
        } else if (num2 > num1 && num2 > num3) {
            max1 = num2;
            if (num1 > num3)
                max2 = num1;
            else
                max2 = num3;
        } else if (num3 > num1 && num3 > num2) {
            max1 = num3;
            if (num1 > num2)
                max2 = num1;
            else
                max2 = num2;
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