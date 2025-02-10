/*Book.java
 *Author: Howard Chen - 100382934
 *Date: February 09, 2025
 *Book class for INFO 4290
*/

// Purpose: Design and implement a Java class named Book with two data members: title and price.
// The class should have suitable constructors, get/set methods, and the toString method. 

public class Book {
	//key attributes
	private String title = "";
	private int price = 9;
	
	//default constructor
	public Book () { }
	
	//constructor with parameters
	public Book (String name, int price){
		this.title = name;
		this.price = price;
	}	
    
	//declare and define accessor and mutator for "key" attribute(s)
	public String getTitle() {       //accessor
		return title;
	}
	
	public void setTitle(String name) { //mutator
		this.title = name;
	}
	
	public int getPrice () {	//accessor
		return price;
	}
	
	public void setPrice(int price) { //mutator
		this.price = price;
	}
	
	//toString method() is called automatically when a book object is printed
	public String toString() {
		return "The book's title is "+this.title+ ". Its price is "+this.price+ ".\n";  
	}
}