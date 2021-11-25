package Array;

import java.util.Hashtable;

public class True_if_duplicates {
    public boolean containsDuplicate(int[] nums) {

        Hashtable<Integer, Integer> h1 = new Hashtable<>();

        for(int i=0; i< nums.length; i++){
            if(h1.containsKey(nums[i])){
                return true;
            }
            else
                h1.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String args[]){
        True_if_duplicates t1 = new True_if_duplicates();
        int[] a1 = new int[] {1,1,1,3,3,4,3,2,4,2};
        int[] a2 = new int[] {1,2,3,4};
        int[] a3 = new int[] {1,2,3,1};

        System.out.println("a1" +t1.containsDuplicate(a1));
        System.out.println("a2" +t1.containsDuplicate(a2));
        System.out.println("a3" +t1.containsDuplicate(a3));
    }
}

