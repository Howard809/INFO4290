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
	
	public static void main (String[] args) {
		/* Main Method */
		Bookshelf shelf = new Bookshelf();
		Book book1 = new Book("Jojo's Bizarre Adventure", 9);
		Book book2 = new Book("The Empire Strikes Back", 15);
		Book book3 = new Book("The Art of War", 15);
		Book book4 = new Book("Guiness Book of Records", 19);
		Book book5 = new Book("Diary of a Wimpy Kid", 6);
		shelf.addBook(book1);
		shelf.addBook(book2);
		shelf.addBook(book3);
		shelf.addBook(book4);
		shelf.addBook(book5);
		System.out.println(shelf); //prints the whole shelf
		Sorting.main(); // sorts the shelf and prints it in reverse order
		System.out.println("Book 3 has been checked out.");
		shelf.removeBook(book3); //removes the third book from the shelf
		System.out.println(shelf); //prints the updated shelf
		System.out.println("Is book 3, 'The Art of War' available? "+shelf.findBook(book3)); //searches for the third book, should give "false" as the result
	}
}