public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // trouvé
        }
        return -1; // non trouvé
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7};
        int index = search(arr, 5);
        System.out.println("Index de 5: " + index);
    }
}