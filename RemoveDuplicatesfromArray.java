//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length

import java.util.Scanner;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] A) {
		 int length=A.length; 
	      if(length==0 || length==1) return length;
	      int i=1; 
	      for(int j=1; j<length; j++) 
	      {
	        if(A[j]!=A[j-1])
	        {
	          A[i]=A[j]; 
	          i++; 
	        }
	      }
	      return i; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n;
		n=s.nextInt();
		int[] x=new int[n] ;
		System.out.println("Enter the sorted no.s");
		if(n!=0)
		for(int i=0;i<n;i++)
		
			x[i]=s.nextInt();
		
		int result=removeDuplicates(x);
		System.out.println(result);

	}

}
