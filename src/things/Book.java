package things;

public class Book {
    private String subject;
    private double price;


    public Book(String subject, double price){
        this.subject = subject;
        this.price = price;
    }

    public String getSubject() {
        return subject;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.printf("Type-> Book->\t\t\t Subject: %-7s\t\t\t\t Price: %-4.2f \n", getSubject(), getPrice()); //Step 5 displays info for book
    }
}
