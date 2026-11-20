package model;

public class Book {
	private String bookId, title, author;
	private int totalCopies, availableCopies;
   public Book(String bookId, String title, String author, int totalCopies) {
	   if(totalCopies<0)
		   throw new IllegalArgumentException("Total copies cannot be negative.");
	   this.bookId = bookId;
	   this.title = title;
	   this.author = author;
	   this.totalCopies = totalCopies; 
	   availableCopies = totalCopies;
   }
   public String getBookId() {
	   return bookId;
   }
   public String getTitle() {
	   return title;
   }
   public String getAuthor() {
	   return author;
   }
   public int totalCopies() {
	   return totalCopies();
   }
   public int availableCopies() {
	   return availableCopies();
   }
   public void setTitle(String title) {
	   this.title = title;
   }
   public void setAuthor(String author) {
	   this.author = author;
   }
   public boolean isAvailable() {
	   return availableCopies>0;
   }
   public boolean borrowCopy() {
	   if(isAvailable()) {
		   availableCopies--;
		   return true;
	   }
	   else
		   return false;
   }
   public boolean returnCopy() {
	   if(availableCopies==totalCopies)
		   return false;
	   else
		   availableCopies++;
	   return true;
	   
   }
   public String toString() {
	   return "Book [ID="+bookId+",Title="+title+",Author="+author+"Available="+availableCopies+"/"+totalCopies+"]";
   }
}
