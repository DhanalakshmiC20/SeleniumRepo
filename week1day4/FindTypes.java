package week1day4;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="$$ welcome to 2nd class of automation $$";
		int letter=0, space=0,num=0,specialchar=0;
		char[] Array=test.toCharArray();
		for(int i=0;i<Array.length;i++)
		{
			if(Character.isLetter(Array[i]))
			{
				letter++;
			}
			if(Character.isDigit(Array[i]))
			{
				num++;
			}
			if(Character.isSpaceChar(Array[i]))
			{
				space++;
			}else
			{
				specialchar++;
			}
		}

			System.out.println("Letters: "+letter);
			System.out.println("Numbers: "+num);
			System.out.println("White spaces: "+space);
			System.out.println("Special characters: "+specialchar);

	}
}


