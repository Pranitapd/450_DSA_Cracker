package Bit_manipulation;

public class isPowerofTwo {
    boolean isPowerofTwo(long N){
        String str = Long.toBinaryString(N);
        long count = str.chars().filter(ch -> ch == '1').count();
        if(count == 1)
            return true;
        return false;
    }

    public static void main(String args[]){
        isPowerofTwo i = new isPowerofTwo();
        System.out.println(i.isPowerofTwo(5));
    }
}
