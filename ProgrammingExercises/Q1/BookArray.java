package Q1;

public class BookArray
{
    public static void main(String[] args)
    {
        Book[] bookRef = new Book[10];
        bookRef[0] = new Dog();
        bookRef[1] = new Cow();
        bookRef[2] = new Snake();
        for(int x = 0; x < bookRef.length; ++x)
            bookRef[x].speak();
    }

}
