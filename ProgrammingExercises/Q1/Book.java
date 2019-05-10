package Q1;

public abstract class Book {
    String BookTitle; //title of the book
    double Price;      //price of the book

    public Book(String title ){
        BookTitle =title;
    }

    public String gettitle(){
        return BookTitle;
    }

    public double getPrice(){
        return Price;
    }

    public abstract void setPrice();
}