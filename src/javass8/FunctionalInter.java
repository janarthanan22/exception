package javass8;
@FunctionalInterface
public interface FunctionalInter {

	public int Calculation(int a,int b);
	
	
	public static String   getname() {
		return "jana";
	}
	
	public default int getSalary(int a) {
		return a;
	}
	
	
}
