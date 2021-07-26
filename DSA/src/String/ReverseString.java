package String;

import java.util.Scanner;

public class ReverseString {

    void reverseString(String s1){
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.reverse());
    }

    void reverseInPlace(char[] c1){
        int l1 = c1.length;
        char[] c2 = new char[] {};      //need to be initialized
        for(int i=0; i<(l1/2); i++) {
            char c = c1[i];
            c1[i] = c1[l1-i-1];
            c1[l1-i-1] = c;
        }
        System.out.println(c1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        ReverseString r1 = new ReverseString();
        r1.reverseString(s1);

        char[] c1 = new char[] {'h', 'i'};
        r1.reverseInPlace(c1);
    }
}
