package Array;

import java.util.*;

public class Intersection_of_two_arrays {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                list.add(nums1[i]);
                i++; j++;
            }
        }
        int[] res = new int[list.size()];
        for(int w=0; w<res.length; w++){
            res[w] = list.get(w);
        }
        return res;
    }
}
