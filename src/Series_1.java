import java.util.Scanner;

public class Series_1 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr the value of n:");
        n = in.nextInt();
        int a = 1, b = 0, i = 0;
        while (b < n) {
            b = a + (i * i);
            if (i % 2 != 0)
                System.out.print(b * (-1) + "\t");
            else
                System.out.print(b + "\t");
            a = b;
            i += 1;
        }
    }
}

/*
Enetr the value of n:
100
1	-2	6	-15	31	-56	92	-141
 */