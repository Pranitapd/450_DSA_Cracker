package Algorithm.Dynamic_Programming;

import java.util.HashMap;

public class fibonacche_recursive {
    private HashMap<Integer,Integer> cache = new HashMap<>();
    public int fib(int n) {
        if(cache.containsKey(n)){
            return cache.get(n);
        }else{
            if(n<2){
                return n;
            }else{
                cache.put(n,fib(n-1) + fib(n-2));
                return cache.get(n);
            }
        }
    }
}
