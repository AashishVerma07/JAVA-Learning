public class Main {
    public static void main(String[] args) {
        Month[] months = {Month.JAN, Month.MAR, Month.JUN, Month.DEC};

        for (Month month : months) {
            System.out.printf("Input: %d | Output: %s\n", month.ordinal(), Calendar.monthToString(month));
        }
    }
}

