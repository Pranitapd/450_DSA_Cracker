package Array;
/*Easy

25848

839

Add to List

Share
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
           int[] res = new int[2];
//            int flag = 0;
//            for (int i = 0; i < nums.length && flag != 1; i++)
//                for (int j = i + 1; j < nums.length && flag != 1; j++) {
//                    //System.out.println("printing i"+i +"printing j" + j);
//                    if (nums[i] + nums[j] == target) {
//                        //System.out.println("printing i"+i +"printing j" + j);
//                        res[0] = i;
//                        res[1] = j;
//                        flag = 1;
//                    }
//                }
//            return res;

            //Better solution
            for(int i=0; i<nums.length; i++)
            {
                int lowIndex = 0, highIndex = nums.length -1;

                    int sum = nums[lowIndex] + nums[highIndex];
                    if(sum == target)
                    {
                        res[0] = lowIndex+1;
                        res[1] = highIndex+1;
                        break;
                        //return new int[]{lowIndex+1, highIndex+1};
                    }
                    if(sum < target)
                        lowIndex++;
                    else
                        highIndex--;

            }
            return res;
        }


    public static void main(String[] args){
        TwoSum s = new TwoSum();
//        int[] ar = s.twoSum(new int[] {2,7,11,5}, 9);
//        for(int i:ar)
//            System.out.println(i);

        int[] ar1 = s.twoSum(new int[] {3,3}, 6);
        for(int i:ar1)
            System.out.println(i);
    }
}
