/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears
at least twice in the array, and it should return false if every element is distinct.*/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
       if(nums.length<=1)
       return false;
       for(int i=0;i<nums.length;i++)
       if(!h.containsKey(nums[i]))
       
           h.put(nums[i],1);
           
       else
       return false;
       return true;
    }
}
