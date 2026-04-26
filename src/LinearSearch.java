public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};
        int target = 51;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                System.out.println("Comparisons: " + (i + 1));
                System.out.println("Time complexity: O(n)");
                break;
            }
        }
    }
}