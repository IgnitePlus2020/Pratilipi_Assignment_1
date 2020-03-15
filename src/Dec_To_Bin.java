/*
2 | 10 = 0
2 | 5 = 1
2 | 2 = 0
2 | 1 = 1
binar(10) = 1010
 */

import java.util.Scanner;

public class Dec_To_Bin {
    public static void Dec_to_Bin(int n) {
        int[] bin = new int[1000];
        int i = 0;
        while (n > 0) {
            bin[i] = n % 2; //Calculate reminder when divided by 2
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)    //Display in reverse order
            System.out.print(bin[j]);
    }

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value:");
        num = in.nextInt();
        Dec_to_Bin(num);
    }
}

/*
Enter any value:
100
1100100
 */