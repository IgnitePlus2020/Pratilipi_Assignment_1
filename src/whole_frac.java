import java.util.Scanner;

public class whole_frac {
    public static void main(String[] args) {
        double n, temp = 0.0, whole = 0, frac = 0;
        int i = 1;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        do {
            i = i * 10; //Counting number of digits after decimal
            temp = n * i;   //Shifting decimal point to the right
        } while ((temp % 10) != 0);

        i = i / 10;
        temp = (int) n;
        frac = (n * i) - (temp * i);

        System.out.println("Actual value: " + n);
        System.out.println("Whole part: " + (int) n + "\nFraction part: " + (int) frac);
    }
}

/*
Enter the value of n:
102.345
Actual value: 102.345
Whole part: 102
Fraction part: 345
 */
