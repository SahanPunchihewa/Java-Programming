
public class Person { // Person class

	// Attribute 
	private String name;
	private String Address;
	
	public Person() { // Default Constructor
		
		name = null;
		Address = null;
	}
	
	public Person(String name, String Address) { // Over load Constructor
		
		this.name = name;
		this.Address = Address;
	}
	
	public void showDetails() { // Show Details Method
		
		System.out.println("Name :" +this.name);
		System.out.println("Address :" +this.Address);
		
	}
	
}
