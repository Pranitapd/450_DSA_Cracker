package Array;

public class Binary_search {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int m = l +(r-l)/2;
            if(nums[m] == target)
                return m;

            if(target < nums[m]){
                r = m-1;
            }
            else if(target > nums[m])
                l = m +1;
        }
        return -1;
    }

    public static void main(String args[]){
        Binary_search b = new Binary_search();
        System.out.println(b.search(new int[]
                {-1,0,5}, -1));
    }
}
