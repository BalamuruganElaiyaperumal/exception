package java8;

public class UseMethods {
	public static void main(String[]args) {
		
		int[] num= {10,30,40,50,60,70,100};
	Methods m1=new Methods();
	MethodRefer m2 = m1::findmax;
	 
	System.out.println(m2.findmax(num));
		
		
		
	}

}
