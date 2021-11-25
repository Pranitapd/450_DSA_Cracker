package Array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k%nums.length; //This is for the time when we k > nums.length

        //Solution1 exceeding time limit
//        for(int i=0; i< k; i++)
//            rotateRightByOne(nums);
//    }
//
//    public void rotateRightByOne(int[] nums){
//        int n=nums.length, temp = nums[n-1];
//        for(int i=n-1; i>0; i--){
//            nums[i] = nums[i-1];
//        }
//        nums[0]=temp;

        //solution2
        reverse(nums, 0 ,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);

    }
    public void reverse(int[] nums, int start, int end)
    {
//        For example
//        [1,2,3,4,5,6,7] k=3
//        reverse
//        5,6,7,1,2,3,4
//                [7,6,5],[4,3,2,1]
//        reverse
//        5,6,7,1,2,3,4
        while(start <= end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[])
    {
        RotateArray r = new RotateArray();
        int[] nums = {1,2,3,4,5};
        r.rotate(nums, 2);
        for (int num:nums)
             System.out.println(num);
    }
}
