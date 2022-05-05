package Week2day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="stops";
		String s2="potss";
	    
		int k;
		
		if(s1.length()!=s2.length())
			k=0;
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			Arrays.equals(ch1, ch2);
			k=1;
			
			
		}
		if(k==1)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	}
	

}
