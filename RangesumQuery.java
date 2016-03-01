/*Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3 */

public class NumArray {
 int[] sum;
    public NumArray(int[] nums) {
       sum=nums;
      if(nums.length==0)
      return;
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum[i]+=sum[i-1];
        }
    }

    public int sumRange(int i, int j) {
        
       if(i==0)
       return sum[j];
       else
       return sum[j]-sum[i-1];
    }
}
