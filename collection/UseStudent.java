package collection;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[]args) {
		
		Student s1=new Student("raja",10,15,480);
		Student s2=new Student("mani",11,20,470);
		Student s3=new Student("mano",12,22,450);
		Student s4=new Student("mali",13,34,420);
		Student s5=new Student("velu",14,32,400);

		ArrayList<Student> Students= new ArrayList<>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		Students.add(s5);
for(int i=0; i<Students.size(); i++) {
	
	
	System.out.println(Students.get(i).name+","+Students.get(i).id+","+Students.get(i).age+","+Students.get(i).mark);
	
}
	
		}
		

}
