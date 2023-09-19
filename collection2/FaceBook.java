package collection2;

public class FaceBook {
private	long mobileNo;
private	String password;
private	String idName;
private	String emailId;
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	}
	public long getMobileNo () {
		return mobileNo;
	}
  public void setPassword(String password) {
	  this.password=password;
  }
  public String getPassword() {
	  return password;
  }
public void setIdName(String idName) {
	this.idName=idName;
}
public String getIdName() {
	
	return idName;
}
public void setEmailId(String emailId) {
this.emailId=emailId;	
	
}
public String getEmailId() {
	return emailId;
	
}
public FaceBook (long mobileNo,String password,String idName,String emailId ) {
	this.mobileNo=mobileNo;
	  this.password=password;
		this.idName=idName;
		this.emailId=emailId;	

}
public String toString() {
	
return mobileNo+","+password+","+idName+","+emailId;	
}
}

