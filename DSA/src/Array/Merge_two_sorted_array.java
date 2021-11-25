package Array;

import java.util.Arrays;

public class Merge_two_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] res = Arrays.copyOfRange(nums1, 0, m);
//        int len = nums1.length;
//        int i = 0, j = 0, k = 0;
//
//        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.toString(nums2));
//        System.out.println("nums1 length" + len);
//        while (k < len) {
//            if (res[i] < nums2[j] && i<m && j<n) {
//                nums1[k] = res[i];
//                System.out.println("In first if" + nums1[k]);
//                i++;
//            } else if (res[i] > nums2[j] && j<n && i<m) {
//                nums1[k] = res[j];
//                j++;
//                System.out.println("In second if" + nums1[k]);
//            } else if (res[i] == nums2[j]) {
//                nums1[k] = res[i];
//                i++;
//                j++;
//                System.out.println("In third if" + nums1[k]);
//            }
//            k++;
//        }
//        System.out.println(Arrays.toString(nums1));

        //Solution 2
//        int i=m,j=0;
//        while(i<nums1.length){
//            int temp=nums2[j];
//            nums2[j]=nums1[i];
//            nums1[i]=temp;
//            i++;
//            j++;
//
//        }

        //solution3
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
    public static void main(String args[]){
        Merge_two_sorted_array m =new Merge_two_sorted_array();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        m.merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }

}
