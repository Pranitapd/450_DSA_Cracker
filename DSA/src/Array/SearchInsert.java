package Array;

//https://leetcode.com/problems/search-insert-position/discuss/1561513/Java-0-ms-38.9-MB
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid]== target)
                return mid;
            else if (nums[mid] < target)
                l = mid+1;
            else if(nums[mid] > target)
                l = mid-1;
        }
        return l;
    }
}
