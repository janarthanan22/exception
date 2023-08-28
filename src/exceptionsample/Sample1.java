package exceptionsample;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("program end");
		}
	}

}
