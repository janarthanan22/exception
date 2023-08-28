package exceptionsample;

public class Sample2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		try {
			String c=null;
		
		System.out.println(c.toLowerCase());
		}
		catch(NullPointerException e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("program end");
		}
	}

	}


