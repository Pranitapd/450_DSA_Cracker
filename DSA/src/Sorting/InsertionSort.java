package Sorting;

public class InsertionSort {
    public void sort(int[] nums)
    {
        int n = nums.length;int j;
        for(int i=0; i<n; i++)
        {
            int key = nums[i];
            j = nums[i-1];
            while(j>=0 && nums[j]<key)
            {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
    }
}
