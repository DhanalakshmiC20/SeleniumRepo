package week2day3;

public class Student {
	public void getStudentInfo(int id)
	{
			System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Reg no: "+id);
		System.out.println("Name: "+name);
	}
	public void getStudentInfo(String email, String mobileno)
	{
		System.out.println("email address: "+email);
		System.out.println("contact no: "+mobileno);		
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudentInfo(1771);
		obj.getStudentInfo(1771,"Dhanalakshmi");
		obj.getStudentInfo("abc@gmail.com","0123456789");
		
	}
}
