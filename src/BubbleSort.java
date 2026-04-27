public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};


        bubbleSortThreePasses(arr);
    }

    public static void bubbleSortThreePasses(int[] arr) {
        int n = arr.length;

        for (int pass = 1; pass <= 3; pass++) {
            boolean swapped = false; 

            for (int j = 0; j < n - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; 
                }
            }

            System.out.println("Pass " + pass + ":");
            printArray(arr);

            // EARLY EXIT
            if (!swapped) {
                System.out.println("→ Early exit! Array is sorted " + pass);
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
