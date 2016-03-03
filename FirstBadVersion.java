/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n)
    {
       int result=findMiddle(1,n);
       return result;
    }
   public int findMiddle(int start, int end)
   {
        if(isBadVersion(start))                                     
        return start;
        while(end!=start+1)
        {
            int mid = ((end-start)>> 1) + start;
            if(isBadVersion(mid))
            end=mid;
            else
            start=mid;
        }
        if(isBadVersion(start))                                     
            return start;
        return end;
     
    }
}
