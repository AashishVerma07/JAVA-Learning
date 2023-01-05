import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        float a = sc.nextFloat();
        System.out.println("Enter Second Number : ");
        float b = sc.nextFloat();
        System.out.println("Enter ");

        float addition = calculator.addition(a, b);
        System.out.printf("Addition of two number %f and %f is : %f\n " ,a ,b , addition);

        float devide = calculator.devide(a, b);
        System.out.printf("Addition of two number %f and %f is : %f\n " ,a ,b , devide);



    }
}