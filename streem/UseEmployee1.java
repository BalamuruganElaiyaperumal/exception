package streem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee1 {
	public static void main(String[]args) {
	
	Employee1 emp1=new Employee1("raja",24,15000,"devaloper",2,"male",1);
	Employee1 emp2=new Employee1("reka",26,17000,"junior devaloper",5,"female",2);
	Employee1 emp3=new Employee1("rajesh",28,200000,"Qc",6,"male",3);
	Employee1 emp4=new Employee1("rani",23,25000,"Tl",10,"female",4);
	Employee1 emp5=new Employee1("mani",30,30000,"Manager",15,"male",5);
	Employee1 emp6=new Employee1("vimala",41,35000,"devaloper",2,"female",6);
	Employee1 emp7=new Employee1("vimal",20,15000,"Db",7,"male",7);
	Employee1 emp8=new Employee1("raman",41,15000,"devaloper",10,"male",8);
		
	HashMap<Integer,Employee1>emp=new HashMap<>();
	emp.put(emp1.getId(),emp1);
	emp.put(emp2.getId(),emp2);
	emp.put(emp3.getId(),emp3);
	emp.put(emp4.getId(),emp4);
	emp.put(emp5.getId(),emp5);
	emp.put(emp6.getId(),emp6);
	emp.put(emp7.getId(),emp7);
	emp.put(emp8.getId(),emp8);
	
Map<Integer,Employee1>b=emp.values().stream().filter(x->x.getAge()>=35).collect(Collectors.toMap(x->x.getId(),y->y));
System.out.println(b);


/*Long a=emp.values().stream().count();

Employee1 s=emp.values().stream().max(Comparator.comparingInt(Employee1::getAge)).get();
System.out.println(s);*/


}
}