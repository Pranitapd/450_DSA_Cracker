package String;

import java.util.HashMap;

public class countAndSay {
    //for example "3322251" print "23321511
    public String countNumersinNumber(int n){
        HashMap<Character, Integer> h = new HashMap<>();
        String numStr = Integer.toString(n);
        System.out.println(numStr);

        for(int i=0; i<numStr.length(); i++){
            char ch = numStr.charAt((i));
            if (h.containsKey(ch)){
                h.put(ch, h.get(ch)+ 1);
            }
            else{
                h.put(ch , 1);
            }
        }
        System.out.println(h);

        int j = 0; char[] newChar = new char[2 * h.size()];
        for(int i=0; i<numStr.length(); i++){

            //first get unique char thats not in final newChar array
            if(h.containsKey(numStr.charAt(i))) {
                int count = h.get(numStr.charAt(i));
                newChar[j] = (char) (count + '0');
                j++;
                newChar[j] = numStr.charAt(i);
                j++;
                h.remove(numStr.charAt(i));
            }
            else    continue;
        }

        String fstr = new String(newChar);
    return fstr;
    }
    public static void main(String args[]){
        countAndSay c = new countAndSay();
        System.out.println(c.countNumersinNumber(1));
    }
}
