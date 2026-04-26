public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};
        bubbleSort(arr, 3); // Trace first 3 passes
    }

    public static void bubbleSort(int[] arr, int maxPasses) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < maxPasses; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Early Exit: If no two elements were swapped by inner loop, then break
            if (!swapped) {
                System.out.println("Early exit triggered at pass " + (i + 1));
                break;
            }
        }
    }
}