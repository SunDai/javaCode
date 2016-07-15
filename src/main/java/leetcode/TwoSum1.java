package leetcode;

/**
 * Created by xh on 2016/4/25.
 */
public class TwoSum1 {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0;i<nums.length;i++){
                int first = nums[i];
                for (int j = i+1;j<nums.length;j++){
                    int two = nums[j];
                    if(first + two == target){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }
    }
}
