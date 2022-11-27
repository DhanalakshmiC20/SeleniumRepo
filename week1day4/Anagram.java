package week1day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length())
		{
			char[] charArray1=text1.toCharArray();
			char[] charArray2=text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if(charArray1.equals(charArray2))
				{
					System.out.println("The given word is Anagram");
				}else
				{
					System.out.println("The given word is not Anagram");
				}
		}
	}
}

	
