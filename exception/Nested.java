package exception;

public class Nested {
	public static void main (String[]args) {
	try {
		
		String[] value= {"raja","mani","kumar","malai"};
		
		System.out.println(value[0].charAt(8));
		System.out.println(value[7]);
	}
	catch (StringIndexOutOfBoundsException x) {
	
		           System.out.println("no index position");
		
	}catch (ArithmeticException m) {
		
		
		System.out.println("no array postion");
		
	}

	
	}
		
	}


