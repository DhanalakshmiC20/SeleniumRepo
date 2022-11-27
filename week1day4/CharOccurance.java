package week1day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome to chennai";
		int count=0;
		char[] Array=str.toCharArray();
		int ArrLen=Array.length;
		for(int i=0;i<=ArrLen-1;i++)
		{
			//if(Array[i].contains(e))
			//boolean search=Array.contains('e');
			if(Array[i]=='e')
			{
				count++;
			}
		}
		System.out.println("The letter 'e' has occurred "+count+"times");

	}

}
