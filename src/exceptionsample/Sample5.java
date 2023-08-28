package exceptionsample;

public class Sample5 {

	public static void main(String[] args) {
		

		try {
			System.out.println("Start");
		
		String name="jana";
		
		System.out.println(name.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("End program");
		}
	}

}
