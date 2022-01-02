public class Ford extends Car{ // Ford Class

	// Attribute of ford class
    private int year;
    private int manufacturerDiscount;
    
    public Ford() { // Default Constructor

        
        year = 0;
        manufacturerDiscount = 0;

    }

    public Ford(int speed,double reqularPrice,String color, double SalePrice, int year, int manufacturerDiscount) { // Overload Constructor

        super(speed,reqularPrice,color,SalePrice,);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;

    }

    public void setYear(int year) { // Set Method for year

        this.year = year;
    }

    public int getYear() { // Get method for Year

        return year; // return year
    }
    public void setManufacturerDiscount(int manufacturerDiscount) { // Set Method for manufacturer Discount

        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getManufacturerDiscount() { // Get method for manufacturer Discount

        return manufacturerDiscount; // Return manufacturer Discount
    }

    public double getSalePrice() { // Get Method for Sale price

        return salePrice; // Return Sale price
    }
}