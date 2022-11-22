package week1day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator objCal=new Calculator();
		int add=objCal.add(10,5,20);
		System.out.println(add);
		int sub=objCal.sub(10, 5);
		System.out.println(sub);
		double mul=objCal.mul(10,5);
		System.out.println(mul);
		float div=objCal.div(10,5);
		System.out.println(div);
				

	}

}
