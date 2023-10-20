package MethodReference;

public class Oneclass {

	public static void main(String[] args) {

		int a[]= {10,24,55,66};
		Mathematics mm=new Mathematics();
		
		OneInterface oi=mm::findMax;
		System.out.println(oi.maths(a));
		
		
	}

}
