// Question 07

//  Create a new class called ‘Item’ with two protected instance variables (private variables), an
// integer variable called ‘location’, and a String variable called ‘description’.
// Add a constructor method for the Item class that takes an integer and a String as arguments (in
// that order). The constructor should assign the value of these parameters to the corresponding
// instance variables. Add getter and setter methods for the location and description variables. Add
// another class called Monster and make the Monster class a sub-class of the Item class. Add a
// constructor method to the Monster class that takes an integer and a String argument just like the
// Item class constructor.
// Use these arguments to call the Item super class constructor from within the Monster class
// constructor so that the instance variables in the superclass are instantiated correctly.Write a
// suitable main method in a different class and call all the methods.


public class Item{ // Item Class

    // Declare variables 
    private int location;
    private String description;

    public Item() { // Default Constructor

        location = 0;
        description = null;
    }

    public Item(int location, String description) { // Overload Constructor

        this.location = location;
        this.description = description;
    }

    public void setLocation(int location) { // Set method for location

        this.location = location;
    }

    public int getLocation() { // Get Method for Location

        return location; // Return location
    }

    public void setDescription(String description) { // Set method for Description  

        this.description = description;
    }

    public String getDescription() { // Get Method for Description

        return description; // Return description
    }

}