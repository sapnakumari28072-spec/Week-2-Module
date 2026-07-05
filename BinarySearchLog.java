import java.util.Scanner;

public class BinarySearchLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                found = true;
                break;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(found)
            System.out.println("Log Found");
        else
            System.out.println("Log Not Found");

        sc.close();
    }
}