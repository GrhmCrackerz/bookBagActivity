package things;

import living.Person;
import java.util.ArrayList;

public class BookBag {
    private Person owner;
    private final ArrayList items = new ArrayList<>();

    public BookBag(Person owner){
        this.owner = owner;
    }

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    public ArrayList getItems(){
        return items;
    }

    public void listItems(){
    }

    public void displayItems() {
        for (Object item : items) { //for loop to find the displayInfo of all Items
            if (item instanceof Phone) { // if item is an instanceof Phone then, get displayInfo
                ((Phone) item).displayInfo(); // (Phone) is cast on item, then displayInfo is used
            } else if (item instanceof Book) { // if the instance is book instead, repeat process
                ((Book) item).displayInfo(); //(Book) is cast on item, then displayInfo is used
            }else if(item instanceof PencilBag){
                ((PencilBag) item).displayContains();
            }
        }
    }

}
