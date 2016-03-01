import java.util.Scanner;

public class LongestCommonPrefix 
{
	 public static String longestCommonPrefix(String[] strs) 
	 {
		 String str1 = null;
		 char c1;
		 StringBuilder sb=new StringBuilder();
		 if(strs==null)
			 return null;
		 if(strs.length==1)
			 return strs[0];
		 if(strs!=null && strs.length>1)
		 {
			 str1= strs[0];
			 for(int i=0;i<str1.length();i++)
	         {
				 c1=str1.charAt(i);
				 for(int j=1;j<strs.length;j++)
				 {
	    	      	  if(i>=strs[j].length())
	    	      		  return sb.toString();
	    	      	  if(c1!=strs[j].charAt(i))
	    	      		  return sb.toString();
				 }
				 sb.append(c1);
	         }
		 
		 }
	      return sb.toString();
	    }
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] strarr=new String[2] ;
		strarr[0]="hello";
		strarr[1]="hell";
		String result=longestCommonPrefix(strarr);
		System.out.println(result);

	}
	
}
