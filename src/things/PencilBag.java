package things;

import java.util.ArrayList;

public class PencilBag {

    public ArrayList<Pen> pens; //Array<Pen> is created with name pens

    public PencilBag(){
        pens = new ArrayList<>(); //new pens array is created
    }

    public ArrayList getPens(){
        return pens;
    }

    public void displayContains(){
        for(Pen pen: pens){  //enhanced for loop, : operator is used to find all instances of pens within Pen
            pen.displayInfo();
        }

    }
}
