import java.util.Arrays;

public class Solution {

    public int[] removeDuplicateElement(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        int m = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[i - 1]) {
                result[m] = arr[i];
                ++m;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int swap = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = swap;
//                }
//                if(arr[i] == arr[i + 1]){
//
//                }
//            }
//        }
//    }
}
