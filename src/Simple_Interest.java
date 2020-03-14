/*
Simple Interest = (P × R × T)/100
        P is Principal amount.
        R is rate per annum.
        T is time in years.
*/
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String args[])
    {
        float p, r, t, si;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = in.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = in.nextFloat();
        System.out.print("Enter the Time period : ");
        t = in.nextFloat();
        in.close();
        si = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
    }
}

/*
Enter the Principal : 2000
Enter the Rate of interest : 3
Enter the Time period : 2
Simple Interest is: 120.0
 */
