package FunctionInterfaceMethodReference;

public class UseMaxMin {

	public static void main(String[] args) {

		MaxAndMinimum mm=new MaxAndMinimum();
		
		int num[]= {10,5,6,7,8};
		
		MaxMin mm1=mm::max;
		
		System.out.println(mm1.find(num));
		
		MaxMin mm2=MaxAndMinimum::min;
		System.out.println(mm2.find(num));
		
		
		
		
		
	}

}
