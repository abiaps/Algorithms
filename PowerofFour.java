/* Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false. */

public class Solution {
    public boolean isPowerOfFour(int num) {
        int flag=0;
        while(num>1)
        {
            if(num%4==0)
              num=num/4;
            else
              break;
        }
        if(num==1)
          return true;
        else
          return false;
        
    }
}
