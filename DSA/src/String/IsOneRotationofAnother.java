package String;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class IsOneRotationofAnother {

    public boolean usingConcatenatination(String s1,String s2){
        //checking length of two string first
        //method- conactenate s1 with s1.. if s2 is substring of this concatenated string then rotated
        if(s1.length() != s2.length() && (s1+s1).indexOf(s2) != -1)
            return false;
        return true;
    }

    public int usingQueue(String s1, String s2) throws InterruptedException {
        if(s1.length() != s2.length())
            ;
        char[] arr = s1.toCharArray();
        ArrayBlockingQueue<Character> q1 = new ArrayBlockingQueue<Character>(s1.length());

        for(int i=0; i<s1.length(); i++) {
            q1.add(arr[i]);
        }

        //Method 2- push string to array, pop head from the queue and push it at the end
        //then check if newly created string is same as the other string
        return 0;
    }

    public static void main(String args[]){
        IsOneRotationofAnother i = new IsOneRotationofAnother();
        if(i.usingConcatenatination("geeks", "eeksg")){
            System.out.println("Its a rotation");
        }
        else
            System.out.println("Its not a rotation");

    }
}
