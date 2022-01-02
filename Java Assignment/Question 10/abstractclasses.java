abstract class A{  // Abstract Class A
  
    abstract void callme(); // Abstract Method
    // conccrete methods are still allowed in abstract classes

    void callmetoo(){
        System.out.println("This is a concrerete method");

    }
}

class B extends A { // Class B

    void callme() { // Method
        System.out.println("B's implementation of call me");

    }

}


public class abstractclasses { // Main Class

    public static void main(String args[]) {

        B b = new B(); // Create Class B Object
        b.callme(); // Method Call
        b.callmetoo(); // Method


    }
}
