package app;

import com.sun.security.jgss.GSSUtil;
import living.Person;
import things.*;

import java.util.Random;

public class Controller {

    public static void main(String[] args){

        yourInfoHeader();

        Random rndGen = new Random();
        Person person = new Person("Mike", "Johnson");
        BookBag bookbag = new BookBag(person);

        person.setBookBag(bookbag); //end of step 6, person's bookbag is set with method setBookBag()

        for(int i = 1; i < 6; i++){
            int areaCode = rndGen.nextInt(300, 900);
            int threeDigit = rndGen.nextInt(100,  999);
            int fourDigit = rndGen.nextInt(1000, 9999);

            String phoneNumber = "(" + areaCode + ")-" + threeDigit + "-" + fourDigit;
            double phonePrice = rndGen.nextDouble(1450 - 150 +1)+150;
            Phone phone = new Phone(phoneNumber, phonePrice);

            person.getBookBag().getItems().add(phone); //phone is added to getItems -> getBookBag -> person

        }//end for loop for phones

        String[] subjects = {"Math", "Chemistry", "Economics", "CS", "Physics", "History"};

        for(int i = 1; i <5; i++){
            int randomNumber = rndGen.nextInt(1,6); // origin 1 and bound 6 because there's 6 different subjects
            double bookPrice = rndGen.nextDouble(200-50+1)+50; // price generator for books
            Book book = new Book(subjects[randomNumber], bookPrice); //new book is created by picking a random subject from the subjects array

            person.getBookBag().getItems().add(book); // book is added to person via getBooks() -> getItems -> add(book)

        }// end for loop for book

        PencilBag pencilBag = new PencilBag(); //new pencilBag
        person.getBookBag().getItems().add(pencilBag);

        String[] colors = {"Red", "Black", "Green", "Blue"}; //new string array for colors

        for(int i = 1; i <6 ; i++){
            int randomNumber = rndGen.nextInt(1,4);
            double penPrice = rndGen.nextDouble(4-1+1)+1;

            Pen pen = new Pen(colors[randomNumber], penPrice ); //pen is created with random color

            pencilBag.getPens().add(pen);
        }//end for loop pen




        person.getBookBag().displayItems();

        System.out.println();
        System.out.println("-----------------------------");
        System.out.printf("Total Price of Possessions: $%5.2f \n" , person.totalPriceOfPossessions());
        System.out.println("-----------------------------");

    }//end main

    public static void yourInfoHeader(){

        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Rodney Graham");
        System.out.println("PANTHER ID:  " + "6196375");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210");
        System.out.println("SECTION: \t " + "U01");
        System.out.println("SEMESTER: \t" + "Spring2022");
        System.out.println("CLASSTIME: \t" + "6:15-9:05PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 9");
        System.out.println();
        System.out.println("CERTIFICATION: \n I understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("================================");
        System.out.println();
    }
}
