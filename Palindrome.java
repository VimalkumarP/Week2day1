package Week2day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
