import java.util.Scanner;

public class Whole_Frac {
    public static void main(String[] args) {
        double value, temp = 0.0, whole = 0, frac = 0;
        int i = 1;
        System.out.println("Enter the any value:");
        Scanner in = new Scanner(System.in);
        value = in.nextDouble();
        do {
            i = i * 10; //Counting number of digits after decimal
            temp = value * i;   //Shifting decimal point to the right
        } while ((temp % 10) != 0);

        i = i / 10;
        temp = (int) value;
        frac = (value * i) - (temp * i);

        System.out.println("Actual value: " + value);
        System.out.println("Whole part: " + (int) value + "\nFraction part: " + (int) frac);
    }
}

/*
Enter the value of n:
102.345
Actual value: 102.345
Whole part: 102
Fraction part: 345
 */
