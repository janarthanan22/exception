package javass8;

public class ClassB implements ClassA {
	
	String color="red";
	public String color(String color) {
		// TODO Auto-generated method stub
		return color;
	}
	
	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		ClassA c=b::color;
		
		System.out.println(c.color("green"));
	}
	

	

}
