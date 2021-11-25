package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequesncesOfString {

    public void Subsequences(String str){
        String sub = "";
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++) {
                sub = str.substring(i, j);
                System.out.println(sub);
                if (ar.contains(sub))
                    continue;
                else
                    ar.add(sub);
            }
        }
        System.out.println(ar);
    }

    static List<String> al = new ArrayList<>();

    private static void findSubsequences(String str, String ans){

    }

    public static void main(String args[]){
        SubsequesncesOfString s = new SubsequesncesOfString();
        s.Subsequences("aaa");
    }
}
