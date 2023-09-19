package oop3_Data_abstract;

public class Course implements OnlineCourse {
	public  String courseName(String coursename) {
		return coursename;
	}	
		
	public int courseDuration(int duration) {
		return duration;
		
	}
	
	public int coursFees(String coursFees) {
		if(coursFees.equalsIgnoreCase("java")) {
			return 20000;
		}
		else if(coursFees.equalsIgnoreCase("c++")) {
			
			return  15000;
			
		}
		else if(coursFees.equalsIgnoreCase("html")) {
			return 10000;
			
		}
		else if(coursFees.equalsIgnoreCase("full stack web")) {
			return 300000 ;
		}
		else {
			return 0;
		}
	}


	

}
