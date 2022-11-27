package week1day4;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		char[] chars=str.toCharArray();
			
		for(int i=chars.length-1;i>=0;i--) {
			rev=rev+chars[i];
			//System.out.println(rev);
		}
					
			if(rev.equalsIgnoreCase(str))
			{
			System.out.println(rev+" is a Palindrome");
	}
			else
			{
				System.out.println(rev+" is not a palindrome");
			}
	}
}

