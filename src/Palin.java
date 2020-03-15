/*
Palindrome is a word, phrase, or sequence that reads the same
backwards as forwards, e.g. madam
 */
import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        String str, s, rev = "";
        int len, j = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string:\t");
        s = in.nextLine();
        str = s.toLowerCase();
        len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
/*
Enter any string:	madam
Palindrome
Enter any string:	hello
Not a Palindrome
 */
