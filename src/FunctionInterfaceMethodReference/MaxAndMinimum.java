package FunctionInterfaceMethodReference;

public class MaxAndMinimum {
	
	public int max(int[] ab) {
		int max=ab[0];
		
		for(int i=0;i<ab.length;i++) {
			if(max>ab[i]) {
				max=ab[i];
			}
		} return max;
	}
	
	
	
	public static int min(int[] ab) {
		
			int min=ab[0];
			for(int c:ab) {
				
				if(min<c) {
					min=c;
					
				}
			
		}return min;
	} 

}
