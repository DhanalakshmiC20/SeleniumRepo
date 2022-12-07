package week2day3;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsApp()
	{
		System.out.println("connecting to whatsapp");

	}

	public void takeVideo()
	{
		System.out.println("take video");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone child=new SmartPhone();
		child.sendMsg();
		child.makeCall();
		child.saveContact();
		child.takeVideo();
		child.connectWhatsApp();
		
		

	}

}
