public class QuickSortPartition {
    public static void main(String[] args) {
        int[] dataset = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};
        int pivotIndex = partition(dataset, 0, dataset.length - 1);

        System.out.println("Final position of pivot: " + pivotIndex);
    }

    public static int partition(int[] arr, int low, int high) {
        // Using the first element as Pivot
        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("Swapped: " + arr[j] + " and " + arr[i]);
            }
        }
        // Place pivot in its final position
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }
}