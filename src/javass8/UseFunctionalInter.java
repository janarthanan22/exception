package javass8;

public class UseFunctionalInter {

	

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		

	FunctionalInter c=(a,b)->(a+b);
	System.out.println(c.Calculation(10, 20));
		
		
		
		
		
		
		
		
		FunctionalInter c1=(x,y)-> {
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
			
		};
		
		System.out.println(c1.Calculation(10, 5));
		
		
		
	
		
		
		
		
	}

}
