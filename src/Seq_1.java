import java.util.Scanner;

public class Seq_1 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Sequence 1: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i * i + "\t");
        }

    }
}

/*
Enter the value of n:
10
Sequence 1:
4	16	36	64	100
 */