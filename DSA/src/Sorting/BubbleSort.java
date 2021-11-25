package Sorting;

public class BubbleSort {
    public void bubbleSort(int[] nums)
    {
        boolean swapped = true;
        int n = nums.length;
        for(int i=0; i< n ;i++)
        {
            swapped=false;
            for (int j=0; j<n-i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
