package exceptionsample;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name="janarthanan929@gmail.com";
		
		if(name.contains(name)&&name.endsWith("@gmail.com")) {
			throw new gmailException("suceess email");
		}
		else {
			System.out.println("not success");
		}
		
		}
		catch(gmailException e) {
			e.printStackTrace();
	      System.out.println(e.getMessage());
		}
		
		
		
		System.err.println("Election end");


	}

}
