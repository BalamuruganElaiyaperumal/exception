package oop3_Data_abstract;

public class SportsShoe implements Shoe {
	
	
	public String brandName(String name) {
		return "Rebook";
		}
    public int price(String price) {
    	if(price.equalsIgnoreCase("vkc")) {
    		return 800;
    	}
    	else {
    		return 500;
    	}
    	
    	
    }
    
    public String color(String color) {
     return  "black";
    }


}
