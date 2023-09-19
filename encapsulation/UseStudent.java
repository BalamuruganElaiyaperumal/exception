package encapsulation;

public class UseStudent {
	public static void main (String[]args) {
		
		Student s1=new Student();
		s1.setName("raj");
		s1.setRollNo(1234);
		s1.setEmailId("raj@Gamil.com");
		s1.setMarks(100);
		s1.setMobileNo(9943185092l);
		
		System.out.println(s1.getName()+" "+s1.getEamilId()+" "+s1.getMarks()+" "+s1.getMobileNo());
	}

	
}
