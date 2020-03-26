import java.util.Scanner;

public class Seq_2 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Sequence 2:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(-1 * i + "\t");
            else
                System.out.print(i + "\t");
        }
    }
}

/*
Enter the value of n:
6
Sequence 2:
1	-2	3	-4	5	-6
 */