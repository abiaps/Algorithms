/*Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge,
please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather
all the input requirements up front.*/

public class Solution {
    public int myAtoi(String str) {
       if(str==null||str.length()==0)
            return 0;
        char sign='+';
        int i=0;
        double result=0;
        str = str.trim();
        if(str.charAt(0)=='-')
        {
            sign='-';
            i++;
        }
        else if (str.charAt(0) == '+') 
		    i++;
        while (i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9')
        {
            result=result*10+(str.charAt(i)-'0');
            i++;
            
        }
        if(sign=='-')
            result=-result;
        return (int)result;
    }
}
