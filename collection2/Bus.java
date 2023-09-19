package collection2;

public class Bus {
	private String no;
	private String color;
	private int noOfseats;
	private	boolean isDiesel;
	
	public void setNo(String no) {
		this.no=no;
	}
	public String getNo() {
		return no;
	}
public void setColor(String color) {
	this.color=color;
}
public String getColor() {
	return color;
}
public void setNoOfsetas(int noOfseats) {
	this.noOfseats=noOfseats;

}
public int getNoOfseats() {
	return noOfseats;
}
public void setIsDiesel(boolean isDiesel) {
	this.isDiesel=isDiesel;
	
}
public boolean getIsDiesel() {
	return isDiesel;
}

public Bus (String no,String color,int noOfseats,boolean isDiesel) {
	this.no=no;
	this.color=color;
	this.noOfseats=noOfseats;
	this.isDiesel=isDiesel;

}
public String toString() {
	
	return no+" "+color+" "+noOfseats+" "+isDiesel;
	
}
}
