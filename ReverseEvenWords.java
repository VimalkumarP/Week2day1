package Week2day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am a software tester";
		String str[]=s.split(" ");
		
		String val = "";
		for (int i = 0; i < str.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(str[i]).reverse().toString() + " ";
		    else
		        val = val + str[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
	}

}
