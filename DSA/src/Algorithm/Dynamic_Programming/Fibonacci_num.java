package Algorithm.Dynamic_Programming;

public class Fibonacci_num {
    public int fib(int n){
        int zeroth=0,first=1;
        if(n == 0)
            return 0;
        if( n == 1)
            return 1;

        int fib_num=first; //first num
        for(int i=2; i<= n; i++){
            fib_num = first+zeroth;
            zeroth= first;
            first = fib_num;

        }
        return fib_num;
    }

    public static void main(String args[]){
        Fibonacci_num n = new Fibonacci_num();
        System.out.println(n.fib(5));
    }
}
