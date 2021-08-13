public class InheritanceDemo { // Begining of the class 

	public static void main(String[] args) { // Begining of the method
		
		Person p1 = new Person(); // Default Constructor 
		p1.showDetails(); // Display Default constructor Values
		System.out.println("");
		
		Person p2 = new Person("Sahan", "Colombo");
		p2.showDetails(); // Display details
		

	} // End of the method

} // End of the Class
