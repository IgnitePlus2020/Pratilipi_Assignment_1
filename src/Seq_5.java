import java.util.Scanner;

public class Seq_5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = in.nextInt();
        System.out.println("Sequence 5:");
        for (int i = 1; i <= n; i++)
            System.out.print(i * i + "\t");
    }
}

/*
Enter the value of n:
5
Sequence 5:
1	4	9	16	25
 */