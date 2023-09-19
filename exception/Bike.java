package exception;

public class Bike {
	public static void main(String[]args) throws Exception {
		String color ="iWhite";
		
		if(color.equals("White")) {
			
			throw new Exception("not Available");
		}
		else {
			System.out.println("Available");
		}
	}

}
