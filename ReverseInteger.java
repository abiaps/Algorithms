
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=123;
	        String s=Integer.toString(x);
	        StringBuilder sb=new StringBuilder(s);
	        String rev=sb.reverse().toString();
	        int rev1=Integer.parseInt(rev);
	        System.out.println(rev1);
	    
	}

}
