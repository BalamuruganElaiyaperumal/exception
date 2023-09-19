package collection2;
import java.util.HashMap;

public class Task {
public static void main (String[]args) {
	
	HashMap<Integer,String>students=new HashMap<>();
	students.put(1,"raja");
	students.put(2,"bala");
	students.put(3,"mani");
	students.put(4,"mlai");
	students.put(5,"kamal");
	students.put(6,"raja");
	
	System.out.println(students);
	students.remove(5);
	System.out.println(students);
	System.out.println(students.get(2));
	System.out.println(students.get(5));
	System.out.println("=================================================================");

	for(Integer i:students.keySet()) {
		
		System.out.println(i);
		System.out.println(students.get(i));


	}
	for(String s:students.values()) {
		
		System.out.println(s);
	}
	
}
}
