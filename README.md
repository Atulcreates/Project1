#Library Management System
This project implements a Library management System using java. In this project i have tried to incorporate all the essential features which a library System should have like
1. Storing all the books in the library as an ArrayList of the objects of the Book type
2. The Book class contains the member variables like bookId, title, author and it has member functions to access these variables apart from this it also stores the total copies and the available copies of a particular book. There are member functions to borrow a book and return it.
3. Next, is the class User which basically has the member variables  userId, name and role(Student or Librarian), it has two subclasses Student and Librarian.
4. Student has its own set of borrowed books as an ArrayList, it also has the variables like the maximum borrowing limit.
5. Librarian class just extends user and sotres the userId and name.
6. Library class is the main class which stores an ArrayList of the books and an ArrayList of users.
