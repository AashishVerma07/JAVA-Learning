public class BubbleSort {
    public void sortArray(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
//    1, 2, 5, 8, 9, 7
//    public void returnArray(int arr[]){
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
}