package javass8;

public class UseExcerSize {

	public static void main(String[] args) {

		Excersize u=(a)->{
		if(a>18) {
			return "eligible";
			
		}
		else {
			return "not eligible";
		}
		};
		
		
//		Excersize u1=(a)-> {
//			for(int i=0;i<a;i++) {
//				return ""+a;
//				
//			}
//			
//		};
		
		
		Excersize u2=(a)-> {
			
			if(a%2==0) {
				return "even";
			}
			else {
				return "odd";
			}
			
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(u2.exe(5));
		
		
		
		
		
		
		
		
		System.out.println(u.exe(59));
		
	}

}
