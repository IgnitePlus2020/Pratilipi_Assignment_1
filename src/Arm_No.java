/*
A positive number is called armstrong number
if it is equal to the sum of cubes of its digits
for example 0, 1, 153, 370, 371, 407...
where 153 = (1*1*1)+(5*5*5)+(3*3*3)
 */

import java.util.Scanner;

public class Arm_No {
    public static void main(String[] args) {
        int n, arm_no = 0, temp, dig;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any value:\t");
        n = in.nextInt();
        temp = n;
        while (temp > 0) {
            dig = temp % 10;
            temp = temp / 10;
            arm_no = arm_no + (dig * dig * dig);
        }
        if (n == arm_no)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is NOT an Armstrong number");
    }
}
/*
Enter any value:	153
153 is an Armstrong number

Enter any value:	100
100 is NOT an Armstrong number
 */
