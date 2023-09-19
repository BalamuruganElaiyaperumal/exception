package java8;

public class UseBoss {
	public static void main(String[]args) {
		String a ="java";
		Boss s = a::equals;
		System.out.println(s.manuplate("java"));
	
		Boss b =a::contains;
		System.out.println(b.manuplate("a"));
		
	}

}
