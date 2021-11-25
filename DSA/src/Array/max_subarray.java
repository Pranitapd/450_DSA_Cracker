package Array;

public class max_subarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0]; int max_sum=sum;

        for(int i=0; i< nums.length; i++){
            sum = nums[i];
            for(int j=i+1; j< nums.length; j++){
                System.out.println(sum);
                sum += nums[j];
                if(max_sum < sum)
                    max_sum = sum;
            }
        }
        if(max_sum < sum)
            max_sum = sum;
        return max_sum;
    }

    public static void main(String args[]){
        max_subarray m = new max_subarray();
        System.out.println(m.maxSubArray(new int[] {-1,0,-2}));
    }
}
