package week2day3;

public class Calc {

	public int add(int a,int b) {
		return a+b;
	}	
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	public double sub(double a,double b) {
		return a-b;
	}	
	public int sub(int a,int b) {
		return a-b;
	}
	public void mul(double a,int b) {
		System.out.println(a*b);
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public static void main(String[] args) {
		Calc obj=new Calc();
		int add1 = obj.add(5,2);
		System.out.println(add1);
		int add = obj.add(1,2,3);
		System.out.println(add);
		int sub = obj.sub(4,2);
		System.out.println(sub);
		double sub2 = obj.sub(2.1,1.1);
		System.out.println(sub2);
		obj.mul(7.11,2);
		double mul = obj.mul(2.2,3.3);
		System.out.println(mul);
		
		
		 
		
		
		
	}
}
