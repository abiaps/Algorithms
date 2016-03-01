import java.util.Scanner;

public class PalindromeInteger 
{
	public static boolean isPalindrome(int x)
	{
        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        if(s.equals(s1))
         return true;
        else
         return false;
        
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  boolean status=isPalindrome(n);
  if(status==true)
	  System.out.println("palindrome");
  else
	  System.out.println("not a palindrome");
	}

}
