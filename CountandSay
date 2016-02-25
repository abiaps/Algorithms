import java.util.Scanner;

public class CountandSay {
	 
	public static String countAndSay(int n)
	{
		int i=3;
		String current="11";
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		if(n>=3)
		
		while(i<=n)
		{
			current=countEquilantCurrent(current);
			i++;
		}
		
		return current;
	}
	
	private static String countEquilantCurrent(String current)
	{
		// TODO Auto-generated method stub
		int count=1;
		char ccurr=current.charAt(0);
		String result="";
		
		for(int i=1;i<current.length();i++)
		{
			char cnext=current.charAt(i);
			if(ccurr==cnext)
			{
				count++;
			
				
			}
			else
			{
				result+=count;
				result+=ccurr;
				ccurr=cnext;
				count=1;
			}
		}
		result+=count;
		result+=ccurr;
		return result;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. i will count and say");
		int n=s.nextInt();
		String result=countAndSay(n);
		System.out.println("The nth sequence is "+result);
	}
	}


