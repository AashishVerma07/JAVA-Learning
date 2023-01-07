import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {1, 8, 6, 9, 3, 4};
        System.out.println(Arrays.toString(arr));
        insertionSort.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
