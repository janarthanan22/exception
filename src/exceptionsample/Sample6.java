package exceptionsample;

public class Sample6 {

	public static void main(String[] args) {
		System.out.println("hi");
		
		try {
			System.out.println("start");
		int[] num= {4,4,5,6};
		System.out.println(num[6]);
		}
		//catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
		//}
		finally {
			System.out.println("end");
		}
		System.out.println("hi2");
	}

}
