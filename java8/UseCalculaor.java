package java8;

public class UseCalculaor {
	public static void main(String[]args) {
		
		 Calculator z =(a,b,c)-> {
			 
			int value1 =a;
			int value2 = b;
			int value3 = c;
			return a+b+c;
		 };
		System.out.println(z.findAddition(10,30,40));
	}

}
