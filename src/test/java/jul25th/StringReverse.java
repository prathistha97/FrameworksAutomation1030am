package jul25th;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="abcd";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		

	}

}