package exceptionsample;

public class Strings {
	public static void main(String[] args)  throws StringException {
		
		
		
		try {
		String a="janarthanan929gmail.com";
		if(a.endsWith("@gmail.com")) {
			System.out.println(" success");
			
		}
		else {
			throw new StringException("check mail");
			
		}
		
		}
		catch(StringException e) {
			e.printStackTrace();
			
		}
		
		finally{
			System.out.println("end");
		}
		
	}

}
