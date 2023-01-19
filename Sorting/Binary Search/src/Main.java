public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};

        int target = 28;
        int startPoint = 0;
        int endPoint = arr.length -1;
        int mid = (startPoint + endPoint)/2;

        while(startPoint <= endPoint){
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }else if (arr[mid] < target) {
                startPoint = startPoint+1;
            }else {
                endPoint = endPoint - 1;
            }
            mid = (startPoint + endPoint)/2;
        }
        if(startPoint > endPoint){
            System.out.println("Target Not Found");
        }
    }
}