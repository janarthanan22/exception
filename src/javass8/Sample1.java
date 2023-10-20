package javass8;

public class Sample1 {

	public static void main(String[] args) {

		
		Sample s=(a,b)->(a+b);
		
		Sample s2=(a,b)->{
			
			if(a>b) {
				return a;
			}
			else {
				return b;
			}
			
		};
		
		System.out.println(s2.add(5, 50)+s.add(44, 05));
		

		
		
	}

}
