package javass8Latest;

@FunctionalInterface
public interface Furniture {
	
	public static String getName() {
		
		return "jana";
		
	}
	
	
	public default int price(int a) {
		return a;
		
	}
	
	public int getage(int a,int b);
	

}
