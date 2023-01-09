import java.util.Arrays;

class Solution {
    public void maxProfit(int[] prices) {
        System.out.println("Days   : [1, 2, 3, 4, 5, 6, 7]" + "\n"
                +"prices : " + Arrays.toString(prices));

        //enter buying day
        int sellingDay = 1;
        sellingDay = sellingDay - 1;

        //enter selling day
        int buyDay = 5;
        buyDay = buyDay -1;

        if(sellingDay > buyDay){
            System.out.println("Profit : 0 || Because Selling day is not Smaller then Buying day");
        }else {
            int invest = prices[buyDay];
            int withdrawal = prices[sellingDay];
            int profit = invest - withdrawal;
            System.out.println("Profit : "+ profit);
        };
    }
}