package Week2day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to Chennai";
		int k=0;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='e')
				k++;
				
		}
		System.out.println(k);

	}

}
