package Algorithm.Dynamic_Programming;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Climbing_stairs {
    //https://leetcode.com/problems/climbing-stairs/

    Map<Integer,Integer> m = new HashMap<>();

    public int climbStairs(int n){
        if(m.containsKey(n))
            return m.get(n);

        if(n<0)
            return 0;
        if(n==0)
            return 1;

        int s = climbStairs(n-1) + climbStairs(n-2);
        m.put(n,s);
        return s;
    }
}
