package exceptionsample;

public class Sample4 {

	public static void main(String[] args) {
		
System.out.println("Welcome");
		
		try {
			
		int num=Integer.parseInt("b");
		System.out.println(num);
		
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("End program");
		}
		
	
		
		
		
	}

}
