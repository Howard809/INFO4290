/*Bookshelf.java
 *Author: Howard Chen - 100382934
 *Date: February 09, 2025
 *Main Code portion for the Git Exercise - Group - Part 2
*/

// Purpose: Design and implement another Java class named BookShelf which has an ArrayList data
// member named bookList to store books. The class should have suitable constructors, get/set
// methods, and the toString method, as well as methods for people to add a book (prototype:
// addBook(Book book)), remove a book (prototype: removeBook(Book book)), and
// search for a book (prototype: findBook(Book book)).
// Test the two classes by creating a Bookshelf object and five Book objects. Add the books to
// the bookshelf. Display the contents of the bookshelf. Test the removeBook and findBook methods as well.

import java.util.*;

public class Bookshelf {	
	//key attribute
	ArrayList<Book> bookList = new ArrayList<>();
	
	//default constructor
	public Bookshelf () { }
	
	//constructor with parameters
	public Bookshelf (ArrayList<Book> list){
		this.bookList = list;
	}	
    
	//declare and define accessor and mutator for "key" attribute(s)
	public ArrayList<Book> getList() {       //accessor
		return bookList;
	}
	
	public void setList(ArrayList<Book> list) { //mutator
		this.bookList = list;
	}
	
	//toString method() is called automatically when a book object is printed
	public String toString() {
		return this.bookList.toString();
	}
	
	//methods for adding, removing, and searching the bookList
	public void addBook (Book book) {
		bookList.add(book);
	}
	
	public void removeBook (Book book) {
		bookList.remove(book);
	}
	
	public boolean findBook (Book book) {
		return bookList.contains(book);
	}
	
	
}
