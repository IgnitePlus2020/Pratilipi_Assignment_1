import java.util.Scanner;

public class Str_Rev {
    public static void main(String[] args) {
        String str, rev = "";
        int len, j = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string:\t");
        str = in.nextLine();
        len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Original string:\t" + str);
        System.out.println("Reverse string:\t" + rev);
    }
}
/*
Enter any string:	hello world
Original string:	hello world
Reverse string:	dlrow olleh
 */
