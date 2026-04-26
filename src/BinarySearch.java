import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};
        int target = 33;

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("low=" + low + " high=" + high + " mid=" + mid + " value=" + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            }
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
    }
}