package Bit_manipulation;

public class BitDifference {
    //You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

    int countBitsFlip(int a, int b){
        int c = a^b;
        int count =0;
        while(c > 0){
            count+= c&1;
            c >>= 1;
        }
        return count;
    }

    public static void main(String args[]){
        BitDifference b = new BitDifference();
        System.out.println(b.countBitsFlip(20,25));
    }
}
