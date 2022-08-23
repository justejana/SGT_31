package oop;

public class Book {

    //Fields
    private String title;
    private String author;
    private int numberOfPages;

    //Setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {

        if(inNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else {
            System.out.println("The provided number of pages in inncorect: " + numberOfPages);
        }

    }
    //basics.Methods

    private boolean inNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages >10;
    }

    public void printBookInfo(){
        System.out.println("title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }
}
