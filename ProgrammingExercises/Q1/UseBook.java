package Q1;

public class UseBook {


    public static void main(String[] args){
        Book books;
        books=new Fiction("Harry Potter");
        System.out.println(books.gettitle());
        System.out.println(books.getPrice());
        books=new NonFiction("In Cold Blood");
        System.out.println(books.gettitle());
        System.out.println(books.getPrice());
    }
}