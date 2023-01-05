import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        float a = sc.nextFloat();
        System.out.println("Enter Second Number : ");
        float b = sc.nextFloat();
        System.out.println("1 : Addition , " +
                           "2 : Subtraction, " +
                           "3 : Multiplication," +
                           " 4 : Division");
        System.out.println("Enter the operation which you want to perform : ");
        int opration = sc.nextInt();
        if(opration == 1 ){
            float addition = calculator.addition(a, b);
            System.out.printf("Addition of two number %f and %f is : %f\n " ,a ,b , addition);
        }else if (opration == 2){
            float subsitution = calculator.subsitution(a, b);
            System.out.printf("Subtraction of two number %f and %f is : %f\n " ,a ,b , subsitution);
        }else if(opration == 3){
            float multiply = calculator.multiply(a, b);
            System.out.printf("Multiplication of two number %f and %f is : %f\n " ,a ,b , multiply);
        }else if (opration == 4){
            float devide = calculator.devide(a, b);
            System.out.printf("Division of two number %f and %f is : %f\n " ,a ,b , devide);
        }else{
            System.out.println("Please enter valid operation");
        }
    }
}