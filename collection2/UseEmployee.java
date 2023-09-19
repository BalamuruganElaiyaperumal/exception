package collection2;
import java.util.HashMap;
public class UseEmployee {
public static void main(String[]arsg) {
	
	Employee e1= new Employee("bala",5,40,"male");
	Employee e2= new Employee("malai",6,30,"male");
	Employee e3= new Employee("kalai",7,20,"female");
	Employee e4= new Employee("raja",8,34,"male");
	Employee e5= new Employee("kamal",9,55,"male");
	
	HashMap<Integer,Employee>emp=new HashMap<>();
	
	emp.put(e1.getId(), e1);
	emp.put(e2.getId(), e2);
	emp.put(e3.getId(), e3);
	emp.put(e4.getId(), e4);
	emp.put(e5.getId(), e5);
	
	/*for(Integer s:emp.keySet()) {
		
		System.out.println(s);
	}*/
	
	for(Employee e:emp.values()) {
		
		System.out.println(e.getName()+","+e.getId());
	}
	
	
}
}
