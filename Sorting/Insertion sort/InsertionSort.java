import java.util.Arrays;

public class InsertionSort {
    public void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

//    public void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr));
//        }
//    }
}
// 1 5 9 7 2
// 1 5 7 9 2
