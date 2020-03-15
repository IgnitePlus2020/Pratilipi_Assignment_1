import java.util.Scanner;

public class Seq_3 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = in.nextInt();
        System.out.println("Sequence 3: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(i, i) + "\t");
        }
    }
}

/*
Enter the value of n:
5
Sequence 2:
1	4	27	256	3125
 */
