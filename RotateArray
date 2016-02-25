import java.util.Scanner;

public class RotateArray {
	 public static void rotate(int[] nums, int k) 
	 {
		 int result[] =new int[nums.length];
	     for(int i=0;i<k;i++)
	        result[i]=nums[nums.length-k+i];
	        int l=0;
		  for(int j=k;j<nums.length;j++)
		  {
		      result[j]=nums[l];
		      l++;
		  }
		   System.arraycopy( result, 0, nums, 0, nums.length );
		   for( int r=0;r<nums.length;r++)
				System.out.println(nums[r]);
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Enter how many positions to be shifted: ");
		int pos=s.nextInt();
		rotate(arr,pos);
	}

}
