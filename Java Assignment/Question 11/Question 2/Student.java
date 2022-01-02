public class Student extends Person { // Student Class

	private String StudentID; // attributes
	
	public Student(String name, String Address, String StudentID) { // Overload Constructor
		
			super(name,Address);
			this.StudentID = StudentID;
	}
	
	public void showDetails() { // Show Details Method
		
		super.showDetails();
		System.out.println("Student ID :" +this.StudentID);
		
	}
	
}
