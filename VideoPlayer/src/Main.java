import java.util.Arrays;
import java.util.Scanner;

// viahal sir code
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(args));
            if (args.length == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.println("VideoPlaySpeed: 1x, 1.5x, 1.75x, 2x");

                System.out.println("Enter the speed you want: ");
                Float speed = Float.valueOf(args[0]);

                System.out.println("Please enter the video length: ");
                Float videoLength = Float.valueOf(args[1]);

                float minutesRemaining = videoLength / speed;

                System.out.println("If video speed is " + speed + "x" + " then " + minutesRemaining + " minutes will be required");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


// my code

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("VideoPlaySpeed: 1x, 1.5x, 1.75x, 2x");
        System.out.println("Enter the speed you want: ");
        float speed = sc.nextFloat();
        System.out.println("Please enter the video length: ");
        float videoLength = sc.nextFloat();
        float minutesRemaining = videoLength / speed ;
        System.out.println("If video speed is " + speed + "x" + " then " + minutesRemaining + " minutes will be required");
    }
}