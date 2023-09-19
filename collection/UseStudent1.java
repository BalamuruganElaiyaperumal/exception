package collection;
import java.util.ArrayList;
public class UseStudent1 {
	public static void main (String[]args) {
		
		
	Student1 s1 = new Student1("Raja",10,"male",'A',400);
	Student1 s2 = new Student1("Rani",11,"female",'B',450);
	Student1 s3 = new Student1("mano",12,"male",'C',300);
	Student1 s4 = new Student1("mala",13,"female",'A',400);
	Student1 s5 = new Student1("malai",14,"male",'D',400);
	Student1 s6 = new Student1("kumar",10,"male",'B',400);
	 
	ArrayList<Student1>students=new ArrayList<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	students.add(s6);
	
	ArrayList<Student1>boys=new ArrayList<>();

	for(int i=0; i<students.size();i++) {
		
		if(students.get(i).getGender().equalsIgnoreCase("male")) {
			
		   boys.add(students.get(i));
		}
	}
		
	for(int i=0; i<boys.size();i++) {
        System.out.println(students.get(i).getName());
   	}
	
	ArrayList<Student1>sec=new ArrayList<>();
	
	for(int i=0; i<students.size();i++) {
		if(students.get(i).getSection()=='A') {
			sec.add(students.get(i));
			
			
		}
			
		}
		
	}
	
	
	
	}

