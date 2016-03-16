/*Given an array of integers and an integer k, find out whether there are two distinct indices 
i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.*/

import java.util.HashMap;

public class ContainsDuplicatesII {
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		 int flag=0;
		 for(int i=0;i<nums.length;i++)
		 {
				if(!h.containsKey(nums[i]))
					h.put(nums[i], i);
				else
				{
				     int j=h.get(nums[i]);
				     if(i-j<=k)
				     {
					      flag=1;
					      break;
				     }
				     else
					      h.put(nums[i], i);
				  
				 }
				
			}
			if(flag==1)
				return true;
			return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1,0,1,1 };
		boolean check=containsNearbyDuplicate(x,1);
		if(check==true)
			System.out.println("yes, it contains duplicate at a distance of k");
		else
			System.out.println("nope it does not contain");
	}

}
