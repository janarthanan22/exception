package javass8Latest;

public class MyElectronics implements Electronicss {
	
	public String status(boolean a) {
		if(a==true) {
			return "Working";
		}
		else {
			return "Not Working";
		}
	}
	
	
	public void price(int ab) {
		System.out.println(ab+100);
	}

}
