package javass8;

public interface Calculation {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public int multiply(int a,int b);
	
	
	public default int divide(int a,int b) {
		return a/b;
	}

}
