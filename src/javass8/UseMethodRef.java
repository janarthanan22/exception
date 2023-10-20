package javass8;

public class UseMethodRef {

	public static void main(String[] args) {
		
		MethodRefc m2=new MethodRefc();
		
		MethodRef m=m2::method;
		
		System.out.println(m.method1());
		

		
	}

}
