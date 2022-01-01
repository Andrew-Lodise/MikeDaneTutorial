// modeling a book with a class

public class Book{
    private String title;
    private String author;
    private int pages;
    boolean isHardCover;
    private static int bookCount = 0; // static attribute

    /* constructor (gets called when
    a new object is made)*/
    public Book(String title, String author, int pages, boolean isHardCover){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isHardCover = isHardCover;
        bookCount++;
    }
    // class method
    public boolean isLong(){
        if (this.pages >= 200){
            return true;
        }
        return false;
    }
    // static method
    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

    // getters and setters
    public void setPages(int pages){
        if (pages >= 1 && pages <= 7312){
            this.pages = pages;
        }
        else {
            this.pages = 100;
        }
    }

    public int getPages(){
        return this.pages;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public int getBookCount(){
        return this.bookCount;
    }
}
