package living;

import things.Book;
import things.PencilBag;
import things.BookBag;
import things.Phone;
import things.Pen;

public class Person {

    public String firstName;
    public String lastName;
    private BookBag bookBag = null;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public things.BookBag getBookBag() {
        return bookBag;
    }

    public void setBookBag(things.BookBag bookBag) {
        this.bookBag = bookBag;  //import BookBag
    }

    public double totalPriceOfPossessions(){
        double sum = 0;

        for(Object item: bookBag.getItems()){//for loop to get the prices of the possessions
            if(item instanceof Phone){ //if the item is an instanceof Phone, then find the price
                sum +=((Phone)item).getPrice();// ((Phone is being casted) upon item).getPrice() used to get the price of any item that is a phone
            }else if(item instanceof Book){
                sum +=((Book)item).getPrice();
            }else if(item instanceof Pen){
                sum +=((Pen)item).getPrice();
            }
        }
        return sum;
    }
}
