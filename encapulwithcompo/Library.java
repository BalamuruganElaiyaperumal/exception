package encapulwithcompo;

public class Library {
	private String loc;
	private int noOfBooks;
	private int noOfrack;
	private Books books;
	
	
	public void setLoc(String loc) {
		this.loc=loc;
	}
public String getLoc() {
	return loc;
}
   public void setNoOfBooks(int noOfBooks) {
	   this.noOfBooks=noOfBooks;
   }
public int getNoOfBooks() {
	return noOfBooks;
}
   public void setNoOfRacks(int noOfrack) {
	this.noOfrack=noOfrack;
}
public int getNoOfRacks() {
	return noOfrack;
}
  public void setBooks(Books books) {
	  this.books=books;
  }
public Books getBooks() {
	
	return books;
}
}