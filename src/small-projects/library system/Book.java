import java.io.Serializable;
//Serialization is a mechanism of converting the state of an object into a byte stream.
public class Book implements Serializable{
    private int isbn;
    private String title, author;
    private double price;
    // lets move on to creating the constructor for our class

    //default constructor 
    public Book() {
        isbn = 0;
        title = null;
        author = null;
        price = 0;
    }

    //cunstructor with parameters 
    public Book(int isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString(){
        return "\nTitle" + title + "\nAuthor" + author + "\nPrice" + price + "\n";
    }
}
