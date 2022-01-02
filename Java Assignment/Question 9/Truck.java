public class Truck extends Car{ // Class Truck

    private int weight; // Attribute

    public Truck() { //  Default constructorConstructor

        weight = 0;
    }

    public Truck(int speed,double reqularPrice,String color, double SalePrice, int weight) { // overload Constructor

        super(speed, reqularPrice, color, SalePrice);
        this.weight = weight;

    }

    public void setWeight(int weight) { // Set Method for Weight

        this.weight = weight;
    }

    public int getWeight() { // Get Method for Weight

        return weight; // Return Weight
    }


    public double getSalePrice() { // Get Method for Sale Price

        if(weight >2000) {

        SalePrice = reqularPrice * 10/100;

         return SalePrice; // Return Sale Price
     }

     else {

        SalePrice = reqularPrice * 20/100; 

        return SalePrice; // Return Sale Price
     }

    }
}