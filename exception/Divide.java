package exception;

public class Divide {
	public static void main(String[]args) {
		
		int a =10;
		int b=0;
       try {
    	   int c=a/b;
    	   System.out.println(c);
       
		
		}
		
		catch(ArithmeticException h) {
			
			System.out.println("we can't divide a number using ");
				//System.out.println(h);
				h.printStackTrace();
			
				
		}
       System.out.println("thank you");
	}
}
