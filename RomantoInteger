import java.util.Scanner;

public class RomantoInteger {
	 public static int romanToInt(String s) {
	       int sum=0;
	      
	       for(int i=0;i<s.length();i++)
	       {
	    	   switch(s.charAt(i))
	    	   {
	    	      case 'I': sum+=1;
	    	                break;
	    	      case 'V': sum+=5;
	    	                break;
	    	      case 'X': sum+=10;
	    	                break;
	    	      case 'L': sum+=50;
	    	                break;
	    	      case 'C': sum+=100;
	    	                break;
	    	      case 'D': sum+=500;
	    	                break;
	    	      case 'M': sum+=1000;
	    	                break;
	    	   }
	    	 
	       }
	       if(s.contains("XL"))
	    	   sum-=20;
	       if(s.contains("XC"))
	    	   sum-=20;
	       if(s.contains("IX"))
	    	   sum-=2;
	       if(s.contains("IV"))
	    	   sum-=2;
	       if(s.contains("CD"))
	    	   sum-=200;
	       if(s.contains("CM"))
	    	   sum-=200;
		return sum;
	       
	    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    int result=romanToInt(str);
    System.out.println(result);


	}

}
