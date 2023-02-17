import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {9, 2, 7, 3, 4, 6, 1, 5, 8, 1, 8};
        System.out.println("Input Array :" + Arrays.toString(arr));
        solution.removeDuplicateElement(arr);
//        System.out.println("Sorted Array : " + Arrays.toString(a));    }
    }
}