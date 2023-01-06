import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {9, 2, 7, 3, 4, 6, 1, 5, 8};
        System.out.println("Input Array :" + Arrays.toString(arr) );
        bubbleSort.sortArray(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));


    }
}