package exceptionsample;

public class Election {

	public static void main(String[] args) throws AgeException {
		
		
		
		
		
		try {
			int age=12;
		
		if(age<18) {
			throw new AgeException("age is not Eligible");
		}
		else {
			System.out.println("eligible");
		}
		
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Election end");

	}

}
