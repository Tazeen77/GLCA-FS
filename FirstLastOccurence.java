package W3S5_Search;

import java.util.*;

public class FirstLastOccurence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(binarySearchFirst(arr, n, target));
        System.out.println(binarySearchEnd(arr, n, target));

    }

    static int binarySearchFirst(int[] arr, int size, int target) {
        int beg = 0, end = size - 1;
        int first=-1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == target) {
                first=mid;
                end=mid-1;
            }
            else if (arr[mid] < target)
                beg = mid + 1;
            else
                end = mid - 1;
        }
        return first;
    }

    static int binarySearchEnd(int[] arr, int size, int target) {
        int beg = 0, end = size - 1;
        int second=-1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == target) {
                second=mid;
                beg=mid+1;
            } else if (arr[mid] < target)
                beg = mid + 1;
            else
                end = mid - 1;
        }
        return second;
    }
}

