public class Sedan extends Car{ // Class Sedan

    private int length; // Attribute

    public Sedan() {}; // Default Constructor

    public Sedan(int speed,double reqularPrice,String color, double SalePrice,int length) { // Overload Constructor

        super(speed,reqularPrice,color,SalePrice);
        this.length = length;
    }

    public void setLength(int length) { // Set method for length


        this.length = length;
    }

    public int getLength() { // Get method for length

        return length; // Return length
    }

    public double getSalePrice() { // Get method for sale price 

        if (length > 20) {  // Condition

            SalePrice = reqularPrice * 5/100; 

            return SalePrice;    // Return SalePrice
        }
        else { 

            SalePrice = reqularPrice * 5/100; // calculation

            return SalePrice; // Return SalePrice
        }
    }

}