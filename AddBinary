import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int sum=0;
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    String b=s.nextLine();
	    StringBuilder sb=new StringBuilder();
	    int i=a.length()-1;
	    int j=b.length()-1;
	    int carry=0;
	    if(a==null&&b==null)
	       System.out.println("no strings");
	       while(i>=0||j>=0)
	       {
	    	 if(i>=0)
	    	 {
	    		 sum+=a.charAt(i)-'0';
	    		 i--;
	    	 }
	    	 if(j>=0)
	    	 {
	    		 sum+=b.charAt(j);
	    		 j--;
	    	 }
	    	 carry=sum>>1;
	    	 if(sum==0)
	    		 sb.append('0');
	    	 else if(sum==1)
	    		 sb.append('1');
	       }
	       sb.reverse();
	       System.out.println(sb.toString());
	      
	    }
	}


