package streem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[]args) {
		
	Employee emp1=new Employee("raja",24,6775000,"devaloper",2,"male");
	Employee emp2=new Employee("reka",26,17000,"junior devaloper",5,"female");
	Employee emp3=new Employee("rajeshkummar",28,200000,"Qc",6,"male");
	Employee emp4=new Employee("rani",23,25000,"Tl",10,"female");
	Employee emp5=new Employee("mani",30,30000,"Manager",15,"male");
	Employee emp6=new Employee("vimala",24,35000,"devaloper",2,"female");
	Employee emp7=new Employee("vimal",20,15000,"Db",7,"male");
	Employee emp8=new Employee("raman",40,19000,"devaloper",10,"male");
	Employee emp9=new Employee("ramaraj",40,189000,"devaloper",10,"male");
	
	ArrayList<Employee>emp=new ArrayList<>();
	emp.add(emp1);
	emp.add(emp2);
	emp.add(emp3);
	emp.add(emp4);
	emp.add(emp5);
	emp.add(emp6);
	emp.add(emp7);
	emp.add(emp8);
	emp.add(emp9);


/*List<Employee>a= emp.stream().filter(x->x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
	a.forEach(x->System.out.println(x));	*/
 List<Employee>b= emp.stream().filter(y->y.getexperience()>5).collect(Collectors.toList());
 b.forEach(x->System.out.println(x));	
 
// List<String >c= emp.stream().filter(z->z.getSalary()>30000 && z.getSalary()<=500000).map(x->x.getName()).collect(Collectors.toList());
 //c.forEach(m->System.out.println(m));	

	
/*Employee x =emp.stream().min(Comparator.comparingInt(Employee ::getSalary)).get();
	
		System.out.println(x);
	
	Employee g =emp.stream().max(Comparator.comparingInt(Employee ::getAge)).get();
		   System.out.println(g);
  Long a =emp.stream().count();
 System.out.println(a);
	
	Long z= emp.stream().filter(x->x.getGender().equalsIgnoreCase("male")).count();
List<String> s	= emp.stream().filter(x->x.getGender().equalsIgnoreCase("male")).map(y->y.getName()).collect(Collectors.toList());

	 System.out.println(s);
	Employee n =emp.stream().max(Comparator.comparingInt(Employee::getAge)).get();

    	 System.out.println(n);*/
     

	}
	}

