package javass8Latest;

public class UseElectronicss {

	public static void main(String[] args) {

		System.out.println(Electronicss.name());
		
		MyElectronics ee=new MyElectronics();
		ee.price(200);
		
		System.out.println(ee.status(true));
		
	}

}
