package java8;

public class UseVehicle1 {
	public static void main(String[]args) {
		
		Vehicle1 z=(b,c)-> {
			int pirce=b;
			int tax=c;
			return b+c;
		};
		System.out.println(z.finalprice(500,200));
	}

}
