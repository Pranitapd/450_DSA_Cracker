package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int min = Arrays.stream(prices).min().getAsInt();
        int index = IntStream.range(0, prices.length).filter(i -> min == prices[i]).findFirst().orElse(-1);
        int s_size = prices.length-index-1;
        if(s_size ==0)
            return 0;
        int[] subarray = new int[s_size];
        System.arraycopy(prices, index+1, subarray,0, s_size);
        int max = Arrays.stream(subarray).max().getAsInt();
        return max-min;
    }

    public static void main(String args[]){
        BestTimeToBuyAndSell b = new BestTimeToBuyAndSell();
        System.out.println(b.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(b.maxProfit(new int[] {7,6,4,3,1}));
    }
}
