package javass8;

public class UseCalculation1 implements Calculation {

	public static void main(String[] args) {
		Calculation cal=new UseCalculation1();
		
		
		System.out.println(cal.multiply(10, 2));
		
		
		System.out.println(cal.divide(10, 2));
		
		
		
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
