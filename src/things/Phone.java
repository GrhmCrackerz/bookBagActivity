package things;

import java.util.Random;

public class Phone {

    Random rndGen = new Random();

    private String number;
    private double price;

    public Phone(String number, double price){
        this.number = number;
        this.price = price; // step 3 random price generator for phone
    }

    public String getNumber(){
        return number;
    }

    public double getPrice(){
        return price;
    }

    public void displayInfo(){
        System.out.printf("Type-> Phone->\t\t\t %s \t\t\t\t Price: %-4.2f \n", getNumber(), getPrice());
    }//end of displayInfo  STEP 4
}
