package week2day3;

public class AxisBank extends BankInfo {
	public void deposit1()
	{
		System.out.println("deposited in Axis");
	}
	public void deposit()
	{
		System.out.println("Amount deposited in fixedaccount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank Banking=new AxisBank();
		Banking.saving();
		Banking.fixed();
		Banking.deposit();
		Banking.deposit1();

	}

}
