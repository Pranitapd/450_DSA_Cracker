package Bit_manipulation;

import java.util.Scanner;

public class Number_of_1_bits {
    //Given a positive integer N, print count of set bits in it.

    public int countSetBits(int n){
        int count =0;
        while(n>0){
            count += n & 1;
            n >>= 1;
        }
        return count;

    }

    public int recursiveCountSetBits(int N){
        if(N==0)
            return 0;
        else
            return (N & 1) + recursiveCountSetBits(N >> 1);
    }

    //Brian Kerninghan Algo
    //Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the
    // rightmost set bit.
    /*So if we subtract a number by 1 and do it bitwise & with itself (n & (n-1)), we unset the rightmost set bit.
    If we do n & (n-1) in a loop and count the number of times the loop executes, we get the set bit count.
    The beauty of this solution is the number of times it loops is equal to the number of set bits in a given integer.
    */

    public int BrianAlgo(int N){
        int count =0;
        while(N > 0){
            N &= (N-1);
            count++;
        }
        return count;
    }


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        Number_of_1_bits n = new Number_of_1_bits();
        System.out.println(n.NotWorkingSetBits(i));

        System.out.println(n.countSetBits(i));
    }
    public int NotWorkingSetBits(int N){      //DOESNT WORK ON BIG NUMBERS
        String str = Integer.toBinaryString(N);
        System.out.println(str);
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
