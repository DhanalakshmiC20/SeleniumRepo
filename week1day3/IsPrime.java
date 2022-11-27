package week1day3;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=27;
		boolean flag=false;
		for(int i=0;i<num;i++) {
			if(num%2==0) {
				flag=true;
				break;
			}
		}
		if (flag!=true) {
			System.out.println("The given number is Prime"+num);			
		}else
		{
			System.out.println("The given number is not prime");
		}
	}
}


