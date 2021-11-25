package Array;

public class max_subarray2 {
    public int maxSubArray(int[] nums){
        int sum=nums[0], cur=nums[0];
        for(int i= 1; i<nums.length;i++){
            sum+=nums[i];
            sum = Math.max(nums[i],sum);
            cur=Math.max(cur,sum);
        }
        return cur;
    }
}
