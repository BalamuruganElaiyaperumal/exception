package exception;

public class Vote {
	public static void main(String[]args) throws Exception {
		int age=17;
		
		if(age<18) {
			
			throw new Exception("invalid age so enter adult age");
				
			}
			else {
				
				System.out.println("Eligible for vote");
				
			}
		}
		
	}


 