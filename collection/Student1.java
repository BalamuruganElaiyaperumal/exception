package collection;

public class Student1 {
	private String name;
	private	int id;
	private String gender;
	private char section;
	private	int marks;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
public void setGender(String gender) {
	this.gender=gender;
}
public String getGender() {
	return gender;
}
public void setSection(char section) {
	this.section=section;
}
public char getSection() {
	return section;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public int getMarks() {
	return marks;
}
public Student1 (String name,int id,String gender,char section,int marks) {
	this.name=name;
	this.id=id;
	this.gender=gender;
	this.section=section;
	this.marks=marks;
}
}
