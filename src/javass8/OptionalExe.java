package javass8;

import java.util.Optional;

public class OptionalExe {

	public static void main(String[] args) throws Exception {

		
		Optional<String> value=Optional.of("jana");
		
		System.out.println(value);
		System.out.println(value.get());
		
		Optional<String> value2=Optional.ofNullable(null);
		System.out.println(value2);
		
		System.out.println(value.isPresent());
		
		System.out.println(value.isEmpty());
		
		String s7=value2.orElseThrow(()->new NumberFormatException());
		System.out.println(s7);
		
		System.out.println(value2.orElse("j"));
		
		
		
		
		
		
		
	}

}
