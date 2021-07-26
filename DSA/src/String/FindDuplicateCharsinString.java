package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharsinString {
    static final int NO_OF_CHARS = 256;

    public void printcharDuplicateCount(String s, int[] count) {
        //we
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        System.out.println(s);
        for(int i=0;i<s.length(); i++){
            if(count[i] > 1)
                System.out.println("Character "+ s.charAt(i) + " has count "+ count[i]);
        }
    }

    public void printDuplicateCharWithHashmap(String s){
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i), 1);
            }
        }

        //print duplicates
        for(Map.Entry mapelem: h.entrySet()){
            char key = (char)mapelem.getKey();
            int value = (int)mapelem.getValue();
            System.out.println("Char "+ key +" is repeated " + value + " times");
        }
    }


    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        FindDuplicateCharsinString f = new FindDuplicateCharsinString();
        int[] count = new int[NO_OF_CHARS];     //created array of size of all the number of characters
        f.printcharDuplicateCount(str,count);

        f.printDuplicateCharWithHashmap(str);
    }
}
