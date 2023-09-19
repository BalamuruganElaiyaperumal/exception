package streem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
public static void main (String[]args) {
	
	Student s1 = new Student("bala",1,480,"O Positive","male");
	Student s2 = new Student("malai",2,300,"O negative","male");
	Student s3 = new Student("raja",3,400,"O Positive","male");
	Student s4 = new Student("kalai",4,278,"O negative","female");
	Student s5 = new Student("raj",5,258,"AB Positive","male");
	Student s6 = new Student("rani",6,480,"AB negative","female");
	
	ArrayList<Student>students=new ArrayList<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	students.add(s6);
	
	/*List<Student>a=students.stream().filter(x->x.getGender().equalsIgnoreCase("male") && x.getBlood().equalsIgnoreCase("ab positive")).collect(Collectors.toList())3;

	
	Map<Integer,Student> s =students.stream().filter(y->y.getGender().equalsIgnoreCase("male") && y.getMarks()>=400).collect(Collectors.toMap(y->y.getId(),z->z));

	s.forEach((m,n)->System.out.println(m+" "+n));
	long h = students.stream().filter(x->x.getName().startsWith("r")).count();
	
	
	  System.out.println(h);*/
	
	
	
	
	//students.stream().filter(x->x.getMarks()>=300).forEach(z->System.out.println(z));

	
	//Student s=students.stream().max(Comparator.comparingInt(Student::getMarks)).get();

	//students.stream().filter(x->x.getMarks()>=480).forEach(x->System.out.println(x));
   

	//Student s=students.stream().min(Comparator.comparingInt(Student::getMarks)).get();
   //for(Student s:students) {
    	//System.out.println(s);
    	//students.stream().sorted(Comparator.comparingInt(Student::getMarks)).forEach(x->System.out.println(x));
	    //students.stream().sorted(Comparator.comparingInt(Student::getMarks)).skip(1).forEach(x->System.out.println(x));
	students.stream().sorted(Comparator.comparingInt(Student::getMarks)).limit(1).forEach(x->System.out.println(x));
	//students.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(x->System.out.println(x));
	
	/*List<String >c= students.stream().filter(z->z.getMarks()>3).map(x->x.getName()).collect(Collectors.toList());
	 c.forEach(m->System.out.println(m));	*/			
	//Map<Integer,Student > c = students.stream().filter(z->z.getMarks()>300).collect(Collectors.toMap(x->x.getId(),z->z));
    }
	
}


