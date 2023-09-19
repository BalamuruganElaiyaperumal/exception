package oop3_Data_abstract;

public class UseKanaraBank {
	public static void main (String[]args) {
	
		KanaraBank c1= new KanaraBank();
		System.out.println(c1.getRateOfInterest(50));
		System.out.println(c1.getLoan(100));
		System.out.println(c1.getHousingLoan(200));
		
		
	}

}
