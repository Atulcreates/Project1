package model;
import java.util.*;
public class Student extends User {
	int maxBooksAllowed;
	List<Book> books;
   public Student(String userId, String name,int maxBooksAllowed) {
	   super(userId,name);
	   this.maxBooksAllowed = maxBooksAllowed;
	   books = new ArrayList<>();
   }
   public  void getBorrowedBookIds() {
	   for(Book b: books)
		   System.out.print(b.getBookId());
	   System.out.println();
   }
   public int getMaxBooksAllowed() {
	   return maxBooksAllowed;
   }
   public boolean canBorrowMore() {
	   if(books.size()<maxBooksAllowed)
		   return true;
	   return false;
   }
   public boolean addBorrowedBook(Book book) {
	   if(canBorrowMore()&&book.isAvailable()) {//checking if the student can borrow more books and if the required book is available
	   for(Book b : books)
		   if(b.getBookId().equals(book.getBookId()))//checking for duplicates
			   return false;
	   books.add(book);
	   return book.borrowCopy();
	   }
	   return false;
   }
   public boolean removeBorrowedBook(Book book) {
	   for(int i=0;i<books.size();i++) {
		   if(books.get(i).getBookId().equals(book.getBookId())) {
			   books.remove(i);
			   return book.returnCopy();
		   }
}
	   return false;
   }
}
