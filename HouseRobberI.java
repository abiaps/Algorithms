/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will
automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you
can rob tonight without alerting the police. */

public class Solution {
    public int rob(int[] nums) {
      if(nums.length==0)
      return 0;
      if(nums.length==1)
      return nums[0];
      if(nums.length==2)
      return nums[0]>nums[1] ? nums[0]:nums[1];
      int oddindexsum=0,evenindexsum=0;
      for(int i=0;i<nums.length;i++)
      {
          if(i%2==0)
          {
             evenindexsum+=nums[i];
             evenindexsum=evenindexsum>oddindexsum ? evenindexsum : oddindexsum;
          }
          else
          {
             oddindexsum+=nums[i];
             oddindexsum=oddindexsum>evenindexsum ? oddindexsum : evenindexsum;
          }
      }
      return evenindexsum>oddindexsum ? evenindexsum : oddindexsum;
    }
}
