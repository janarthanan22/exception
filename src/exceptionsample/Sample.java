package exceptionsample;

public class Sample {

	public void method1() {
		method2();
	}

	public void method2() {
		method1();
	}

	public static void main(String args[]) {
		Sample s = new Sample();
		s.method1();
	}
}
