import java.util.Scanner;

public class Seq_1 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        num = in.nextInt();
        System.out.println("Sequence 1: ");
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i * i + "\t");
        }

    }
}

/*
Enter the value of num:
10
Sequence 1:
4	16	36	64	100
 */
