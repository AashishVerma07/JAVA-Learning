import java.util.Calendar;

//Perent class
class Claculator {
    public int add(int i, int j) {
        return i + j;
    }
}

// Here is child class which is extends percent class, single level inheritance.
class CalculatorADV extends Claculator {
    public int sub(int a, int b) {
        return a - b;
    }
}


// Here children class extends percent class, Second level inheritance.
class CalculatorADV1 extends CalculatorADV {
    public int multi(int x, int y) {
        return x * y;
    }
}




public class Main {
    public static void main(String[] args) {
        CalculatorADV1 c1 = new CalculatorADV1();
        int result1 = c1.add(4, 5);
        int result2 = c1.sub(15, 5);
        int result3 = c1.multi(4, 5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println((result3));
    }
}