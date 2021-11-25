package Array;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int k=0, countOfZero=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                countOfZero++;
            else{
                nums[k] = nums[i];
                k++;
            }
        }

        for(int i=nums.length-countOfZero; i<nums.length; i++)
        {
            nums[i] = 0;
        }
        return;
    }
}
