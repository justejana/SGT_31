package oop;

public class CallingBook {
    public static void main(String[] args) {

        //Creating Book class object
        Book book1 = new Book();
        book1.printBookInfo();

        book1.setTitle("basics.Test title");
        book1.setAuthor("Author");
        book1.setNumberOfPages(10);

        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Book2");
        book2.setAuthor("Unknown");
        book2.setNumberOfPages(200);
        book2.printBookInfo();
    }
}
