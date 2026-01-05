// Write a program to show this keywords call one constructor 
// from another constructor in the same class

class Book {
    String title;
    int pages;

    public Book(String title) { // Constructor 1
        this.title = title;
    }

    public Book(String title, int pages) { // Constructor 2
        this(title); // Calls Constructor 1 to set title
        this.pages = pages;
    }

    public String getBookNameAndPages() {
        return "Book name = " + this.title + " Number of pages = " + (this.pages > 0 ? this.pages : 0);
    }

}

public class ThisKeywordsRefConst {
    public static void main(String[] args) {
        Book b1 = new Book("Core java",250);
        System.out.println(b1.getBookNameAndPages());
    }
}
