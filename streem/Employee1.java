package streem;

public class Employee1 {

	private  String name;
	private  int age;
	private int salary;
	private String desitination;
	private int experience;
	private String gender;
	private int id;
	  public void setName(String name) {
		  this.name=name;
	  }
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge(){
	return age;	
	}
	public void setSalary(int salary){
		
		this.salary=salary;
	}
	public int getSalary() {
		
		return salary;
	}

	public void setdesitination(String desitination) {
		this.desitination=desitination;
	}
	public String getdesitination() {
		return desitination;
	}
	public void setexperience(int experience) {
		this.experience=experience;
	}
	public int getexperience() {
		return experience;
	}
	public void setGender(String gender) {
		this.gender=gender;
		
	}
	public String getGender() {
		return gender;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
		
	}
	public Employee1(String name,int age,int salary,String desitination,int experience,String gender,int id) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.desitination=desitination;
		this.experience=experience;
		this.gender=gender;
		this.id=id;
	}
	public String toString() {
		
		return name;
	}
}
