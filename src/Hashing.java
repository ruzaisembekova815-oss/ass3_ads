public class Hashing {
    public static void main(String[] args) {
        int[] arr = {51, 61, 67, 33, 25, 58, 84, 41, 53, 63};
        int M = 7;
        int[] table = new int[M];


        for (int i = 0; i < M; i++) {
            table[i] = -1;
        }


        for (int val : arr) {
            int index = val % M;
            int startIndex = index;
            boolean inserted = false;


            while (!inserted) {
                if (table[index] == -1) {
                    table[index] = val;
                    inserted = true;
                } else {
                    index = (index + 1) % M;

                    if (index == startIndex) {
                        System.out.println("Table is full! Cannot insert: " + val);
                        break;
                    }
                }
            }
        }


        System.out.print("Result: ");
        for (int i = 0; i < M; i++) {
            if (table[i] == -1) {
                System.out.print("null ");
            } else {
                System.out.print(table[i] + " ");
            }
        }
    }
}