package Bit_manipulation;

import java.util.*;

public class NonRepeatingElemInArr {

    public int[] singleNumber(int[] Nums){
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<Nums.length; i++){
            if(h.containsKey(Nums[i]))
                h.put(Nums[i], h.get(Nums[i])+1);
            else
                h.put(Nums[i],1);
        }

        int[] res = new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : h.entrySet())
            if(entry.getValue() == 1)
                res[i++] = entry.getKey();

        Arrays.sort(res);
        return res;

    }

    public static void main(String args[]){
        NonRepeatingElemInArr n = new NonRepeatingElemInArr();
        int[] arr = {2,1,3,2};
        System.out.println(Arrays.toString(n.singleNumber(arr)));
    }
}
