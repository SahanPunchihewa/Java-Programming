
public class Person { // Person class
	 
	private String name; // Attributes
	private String address;
	
	
	public Person() { // Default constructor
		
		name = null;
		address = null;
	}
	
	public Person(String name, String address) { // Overload constructor
		
		this.name = name;
		this.address = address;
	}
	
	/*// Setters
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAddress(String address) {
		
		this.address = address;
	}*/
	
	public void showDetails() { // Dispaly Details
		
		System.out.println("The Person Name :" +this.name);
		System.out.println("The Person Address :" +this.address);
		
	}

}
