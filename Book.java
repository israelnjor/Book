public class Book {
  private String title;
  private String author;
  private String isbn;
  private int pageCount;
  private double price;

//Constructors
  public Book() {}   //Default Constructor
  public Book(String title, String author, String isbn,int pageCount, double price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.pageCount = pageCount;
    this.price = price;
  }
    
//Setters
  public void setTitle(String title) {
    this.title = title;
  }
  public void setAuthor(String author) {this.author = author;}
  public void setIsbn(String isbn) {this.isbn = isbn;}
  public void setPageCount(int pageCount)  {this.pageCount = pageCount;}
  public void setPrice(double price) {this.price = price}

//GETTERS
  public String getTitle() {return title;}
  public String getAuthor() {return author;}
  public String getIsbn() {return isbn;}
  public int getPageCount() {return pageCount;}
  public double getPrice() {return price;}

//FULL GETTER
  public String getFullDetails() {
    return "Title: " + title + "\n" +
      "Author: " + author + "\n" +
      "ISBN: " + isbn + "\n" +
      "No. of Pages: " + pageCount + "\n" +
      "Price (GhC): " + price + "$"; 
