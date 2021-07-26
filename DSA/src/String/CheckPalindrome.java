package String;

import java.util.Scanner;

public class CheckPalindrome {
    void checkPalindrome(String s){
        int len = s.length();
        for(int i=0;i<(len/2); i++){
            if(s.charAt(i) == s.charAt(len-i-1))
                continue;
            else {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println(s + " String is palindrome");
    }

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        CheckPalindrome c = new CheckPalindrome();
        c.checkPalindrome(str);
    }
}
