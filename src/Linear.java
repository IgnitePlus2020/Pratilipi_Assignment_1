import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int n, key;
        int[] arr = new int[30];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n = in.nextInt();
        System.out.println("Enter the array of numbers:");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Enter the lement to be searched:");
        key = in.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            flag = 0;
            if (arr[i] == key) {
                System.out.println("Found!");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Not Found!");
    }
}

/*
Enter the size of array:
4
Enter the array of numbers:
1 2 3 4
Enter the lement to be searched:
2
Found!

Enter the size of array:
4
Enter the array of numbers:
1 2 3 4
Enter the lement to be searched:
6
Not Found!
 */