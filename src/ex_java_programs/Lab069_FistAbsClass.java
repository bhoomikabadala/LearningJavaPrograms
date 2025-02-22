package ex_java_programs;
/*
Book class which has an abstract method getDetails(),name, author, price.
PrintMyBook class that inherits from the Book class. abstract
Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
Output: "Harry Potter, J.k. Rowling, 120"
 */
public class Lab069_FistAbsClass {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);
        myBook.getDetails();
    }
}
abstract class Book{
    abstract void getDetails();
    String name;
    String author;
    int price;
}
class PrintMyBook extends Book{

    PrintMyBook(String name, String author, int price){
        this.name=name;
        this .author=author;
        this.price=price;
    }
    @Override
    void getDetails() {
        System.out.println("Book: "+name+"\nAuthor: "+author+"\nPrice "+price);
    }
}