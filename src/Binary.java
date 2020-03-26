import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, n, res;
        int[] arr = new int[30];
        System.out.println("Enter the size of array:");
        n = in.nextInt();
        System.out.println("Enter the array of numbers:");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Enter the element to be searched:");
        num = in.nextInt();
        int low = 0, high = n - 1;
        res = binSearch(low, high, arr, num);
        if (res == -1)
            System.out.println("Not Found!");
        else
            System.out.println("Found at " + (int) (res + 1) + " position.");
    }

    public static int binSearch(int low, int high, int arr[], int num) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
/*
Enter the size of array:
5
Enter the array of numbers:
1 2 3 4 5
Enter the element to be searched:
3
Found at 3 position.
 */