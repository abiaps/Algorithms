import java.util.Scanner;

public class RemoveElement {
public static int removeElement(int[] nums, int val) 
{
	 int j=0;
     int i=0;
     while(i<nums.length)
     {
    	 if(nums[i]!=val)
    	 {
     		nums[j]=nums[i];
     		j++;
     	 }
     	i++;
     }	
    
     return j;
 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n;
		n=s.nextInt();
		int[] x=new int[n] ;
		System.out.println("Enter the  no.s");
		for(int i=0;i<n;i++)
		{
			x[i]=s.nextInt();
		}
		
		System.out.println("Enter the value to be deleted");
		int value=s.nextInt();
		int result=removeElement(x,value);
		System.out.println("The length of the array after deletion is "+result);
		
		
	}

}
