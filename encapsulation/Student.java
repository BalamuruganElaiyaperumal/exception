package encapsulation;

public class Student {
	private String name;
	private int rollNo;
	private String emailId;
	private int marks;
	private long mobileNo;
	
	public void setName(String name) {
	this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
		}
		
		public int getRollNo() {
			return  rollNo;
		}

	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}
		public String getEamilId() {
			return emailId;
		}
 public void setMarks(int marks) {
	 this.marks=marks;
 }
		public int getMarks() {
			return marks;
		}
	public void setMobileNo(long mobileNo)	{
		this.mobileNo=mobileNo;
		
	}
		public long getMobileNo() {
			
			return mobileNo;
		}
		
		
		
		
		
		
		
}
