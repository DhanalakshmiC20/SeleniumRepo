package org.system;

public class Desktop extends Computer{

	public void DesktopSize()
	{
		System.out.println("Desktop size is 15.6 inches");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.DesktopSize();
			
		}

}
