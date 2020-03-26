/*
If the binary number is 110.
dec = 1*(2^2) + 1*(2^1) + 0*(2^0) = 6
 */

import java.util.Scanner;

public class Bin_To_Dec {
    public static int Bin_to_Dec(int bin_num) {
        int num = bin_num;
        int dec = 0;

        // Initializing base value to 1, (2^0)
        int base = 1;
        
        int temp = num;
        while (temp > 0) {
            int dig = temp % 10;
            temp = temp / 10;

            dec += dig * base;

            base = base * 2;
        }

        return dec;
    }
    public static void main(String[] args) {
        int bin_num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any binary value:");
        bin_num = in.nextInt();
        System.out.print("Decimal value of " + bin_num + " is: " + Bin_to_Dec(bin_num));

    }
}

/*
Enter any binary value:
1100100
Decimal value of 1100100 is: 100
 */