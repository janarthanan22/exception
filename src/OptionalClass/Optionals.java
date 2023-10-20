package OptionalClass;

import java.util.Optional;

public class Optionals {

	public static void main(String[] args) {

		String a=null;
		
		Optional<String> check=Optional.ofNullable(a);
		if(check.isPresent()) {
			//System.out.println(a.toUpperCase());
		}
		else {
			//System.out.println("the value is empty");
		}
		
		//System.out.println(check.isEmpty());
		
		//System.out.println(check.get());
		
		//System.out.println(check.orElse(a));
		
		System.out.println(check.orElseThrow(()-> new ArithmeticException()));
		
		
		
	}

}
