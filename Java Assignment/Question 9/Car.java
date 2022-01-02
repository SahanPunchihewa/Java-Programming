public class Car{  // Car Class

	// Attribute of Car Class
    private int speed;
    protected double reqularPrice;
    private String color;
    protected double SalePrice;


    public Car() { // Default Constructor

        speed =0;
        reqularPrice = 0;
        color = "null";
        SalePrice = 0;
    }

    public Car(int speed,double reqularPrice,String color, double SalePrice)  { // Overload Constructor
 
            this.speed = speed;
            this.reqularPrice = reqularPrice;
            this.color = color;
            this.SalePrice = SalePrice;
    }

    public void setSpeed(int speed) { // set Method of Speed

        this.speed = speed;
    }

    public int getSpeed() { // get Method for Speed

        return speed; // return speed
    }

    public void setRequestularPrice(double reqularPrice) { // Set Method for Reqular Price 

            this.reqularPrice = reqularPrice;
    }

    public double getRequestularPrice() { // get Method for Reqular Price 

        return reqularPrice; // Return reqular price
    }

    public void setColor(String color) { // Set Method for color

        this.color = color;
    }

    public String getColor() { // get Method for color

        return color; // return color
    }

 
    public double getSalePrice() { // get Method for Sale price

        return SalePrice; // Return Sale price 
    }

    public void setSalePrice(double SalePrice) { // Set Method for Sale Price 

        this.salePrice = SalePrice;
    }

    public double getSalePrice() { // get method Sale price

        return SalePrice; // Return Sale Price
    }

}



