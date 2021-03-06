import java.util.InputMismatchException;
import java.util.Scanner;

public class Num_as_Word {
    public static void main(String[] args) {
        int num, dig;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        try {
            num = in.nextInt();
            System.out.println(num + " in words is:");
            int temp = num, rev = 0;
            temp = num;
            while (temp != 0) {
                rev += temp % 10;
                rev *= 10;
                temp /= 10;
            }
            rev /= 10;
            temp = rev;
            while (temp != 0) {
                dig = temp % 10;
                switch (dig) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                temp /= 10;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("ERROR!\n" + e);
        }
    }

}


/*
Enter the value of n:
12345
12345 in words is:
One Two Three Four Five
 */