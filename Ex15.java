import java.util.*;
class Book{
   private int price;
   private String title;
    Book(String title,int price)
    {
        this.title="Mahabaratham";
        this.price=100;
    }
    Book()
    {
        this("unknown",0);
        System.out.print("in default constructor  -> ");

    }
    void display()
    {
        System.out.println("parameterized constructor");
        System.out.println("the book name is "+title);
        System.out.println("the price of the book is "+price );
    }
}
public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.display();

    }
}