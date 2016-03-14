/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

public class Solution {
    public int climbStairs(int n) {
        if(n==1)
          return 1;
        if(n==2)
          return 2;
        int previous=1;
        int current=2;
        int next=0;
        int count=2;
        int result=0;
        while(count<n)
        {
          next=previous+current;
          result=next;
          count++;
          previous=current;
          current=next;
        }
          return result;
    }
}
