import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10;
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i < count; i++){
            int sum = firstNum + secondNum;
            System.out.println("Fibonacci Series : "+ firstNum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}