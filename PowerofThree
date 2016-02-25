import java.util.Scanner;

public class PowerOfThree 
{
	 public static boolean isPowerOfThree(int n) 
	 {
	      while(n>1)
	      {
	    	  if(n%3==0)
	    		  n=n/3;
	    	  else
	    		  break;
	      }
	      if(n==1)
	    	  return true;
	      else
	    	  return false;
	    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		boolean check=isPowerOfThree(num);
		if(check==true)
			System.out.println("yes it is a power of 3");
		else
			System.out.println("no it is not a power of 3");
	}

}
