import java.util.Scanner;

/*Given a non-negative integer num, repeatedly add all its digits until the result
has only one digit.

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one
digit, return it.*/
public class AddDigits {
	 public static int addDigits(int num) 
	 {
		 String s=Integer.toString(num);
		 if(num<10)
			 return num;
		 int result=num;
		 while(result>9)
		 {
			 int sum=0;
			 while(num>0)
			 {
				 int rem=num%10;
				 sum+=rem;
				 num=num/10;
			 }
			 result=sum;
		 }
		 return result;
	 }		
	       
	      
	  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=s.nextInt();
		System.out.println(addDigits(n));
	}

}
