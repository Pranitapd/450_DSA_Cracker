package Bit_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    static void printSubset(String str){
        char[] set = str.toCharArray();
        int len = str.length();

        List<String> l = new ArrayList<>();
        //shifting an integer “x” with an integer “y” denoted as ‘(x<<y)’
        // is equivalent to multiplying x with 2^y (2 raised to power y).
        for(int i=0; i< (1 << len); i++){

            String fin = "";
            for(int j=0; j< len; j++){      //here j is to set each bit one by one
                if( (i & (1 << j)) >0) {
                    fin += set[j];
                }
            }
            l.add(fin);
        }
        l.remove(0);
        System.out.println("List: " + l);
    }

    public static void main(String args[]){
        PowerSet p = new PowerSet();
        printSubset("abc");
    }
}
