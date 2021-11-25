package Bit_manipulation;

public class CountTotalSetBits {
    //You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

    int countBitsInOneInt(int N){
        int count=0;
        while(N>0){
            count += N&1;
            N >>= 1;
        }
        return count;
    }

    int countSetBits(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            count += countBitsInOneInt(i);
        }
        return count;
    }

    public static void main(String args[]){
        CountTotalSetBits c = new CountTotalSetBits();
        System.out.println(c.countSetBits(17));
    }
}
