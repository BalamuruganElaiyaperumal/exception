package streem;

public class Student {
	
private	String name;
private	int id;
private int marks;
private String blood;
private String gender;
    
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
public void setMarks(int marks) {
	this.marks=marks;
}
public int getMarks() {
	return marks;
}
public void setBlood(String blood) {
	this.blood=blood;
}
public String getBlood() {
	return blood;
}
public void setGender(String gender) {
	this.gender=gender;
}
public String getGender() {
	return gender;
}
public Student(String name,int id,int marks,String blood,String gender) {
	this.name=name;
	this.id=id;
	this.marks=marks;
	this.blood=blood;
	this.gender=gender;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", blood=" + blood + ", gender=" + gender
			+ "]";
}


}

