package Sorting;

public class SelectionSort {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            int min = i;
            for(int j= i+1; j<nums.length; j++){
                if(Math.abs(nums[j]) < Math.abs(nums[min]))
                    min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
            System.out.println("nums[i]" + nums[i]);
            res[i] = nums[i] * nums[i];
        }
        return res;
    }

    public static void main(String args[]){
        SelectionSort s = new SelectionSort();
        int[] res = s.sortedSquares(new int[] {-7,-3,2,3,11});

        for(int i:res)
            System.out.println(i);
    }
}
