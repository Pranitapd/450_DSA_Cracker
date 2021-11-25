package String;

import java.util.Arrays;
import java.util.HashMap;

public class CountNSayFOrRepeatNum {

    public String countAndStayForRepeatNum(int n){

        //base class
        if(n == 1)
            return "1";

        //create array of having same value
        int[] ar = new int[2];
        // fill array with same value
        Arrays.fill(ar,1);

        //convert that array to string
        String str = Arrays.toString(ar);

        for(int i=2; i<=n; i++){
            HashMap<Integer,Integer> h = new HashMap<>();
            for(int j=0; j<str.length(); j++){
                if(h.containsKey(ar[j])){
                    h.put(ar[j], h.get(ar[j]+1));
                }
                else
                    h.put(ar[j], 1);
            }

            int[] res = new int[2*n]; int k=0;
            for(int j=0; j<str.length(); j++){
                char key = str.charAt(j);
                int value = h.get(key);

                res[k++] = key - '0';
                res[k++] = value;
            }
            str = Arrays.toString(res);

        }
        return str;
    }

    public static void main(String args[]){
        countAndSay c = new countAndSay();
        System.out.println(c.countNumersinNumber(1));
    }
}
