package java8;

import java.util.Optional;

public class Task {
	public static void main(String[]args) {
		
		String a ="oneSoft";
	Optional<String>b=Optional.ofNullable(a);
		System.out.println(b.isPresent());
		System.out.println(b.get());
		
		if(b.isEmpty()==true) {
			System.out.println("value is not Present");

		}
		else {
			
			System.out.println(a.toUpperCase());

		}
	}

}
