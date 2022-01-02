public class PartTimeStudent extends Student{ // Class Part Time student

	private int workHours; // Attribute
	
	public PartTimeStudent(String name, String Address, String StudentID, int workHours) { // Overload Constructor
		
		super(name, Address, StudentID); // get from super class
		this.workHours = workHours;
	}
	
	public void showDetails() { // Show Detilas method
		
		super.showDetails();
		System.out.println("Working Hours :" +this.workHours);
		
	}
	
	
	
}
