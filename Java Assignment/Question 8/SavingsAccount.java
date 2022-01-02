public class SavingsAccount{ // Saving Account class

    private static int annualInterestRate; // static variable
    private int savingBalance; // private variable


    public SavingsAccount() {

        savingBalance = 0;
    }

    pubic SavingsAccount(int savingBalance) {

        this.savingBalance = savingBalance;

    }

    public void setAnnualInterestRate(int AnnualInterestRate){

            annualInterestRate = AnnualInterestRate;
    }

    

    
    
    public void calculateMonthlyInterest(){

        savingBalance * 5/100 


    }






}