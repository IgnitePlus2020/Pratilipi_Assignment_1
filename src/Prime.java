import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int start = 0, stop = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        start = in.nextInt();
        stop = in.nextInt();
        for (int i = start; i <= stop; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + "\t");
        }
    }
}

/*
Enter the range:
3 15
3	5	7	11	13
 */
