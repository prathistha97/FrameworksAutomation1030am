package jul25th;

public class StringReverse2 {

	public static void main(String[] args) {
		
		String str="Macha shashi kuma";
		
		String[] strArr=str.split(" ");
		String totalRev="";
		for(int i=0;i<strArr.length;i++)
		{
			
			totalRev=totalRev+reverse(strArr[i])+" ";
			
		}
		
		
		System.out.println(totalRev);

	}

	private static String reverse(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		return rev;
		
	}

}
