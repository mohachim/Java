public class BubbleSort {
    public static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Échange
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimisation
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};
        sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}