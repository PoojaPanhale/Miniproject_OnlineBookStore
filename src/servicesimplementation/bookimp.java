package servicesimplementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import Book.BookInfo;
import Services.bookservices;
import book.bookinfo;

public class bookimp implements bookservices{
	public bookimp() {
	      
		 bookinfo e1=new bookinfo("life amazing secrete","Gurugopaldas",5,"Classics",350);
		 bookinfo e2=new bookinfo("The Little Prince ","Antoine de Saint-Exupéry",8," Adventure stories",750);
		 bookinfo e3=new bookinfo("A Tale Of Two Cities ","Charles Dickens",6,"Classics",950);
		 bookinfo e4=new bookinfo("Harry Potter and the Philosopher's Stone ","JK Rowling",3,"Fantasy",680);
		 bookinfo e5=new bookinfo("The Hobbit ","JRR Tolkien",10,"Fantasy ",380);
	
		 inventory.add(e1);
		 inventory.add(e2);
		 inventory.add(e3);
		 inventory.add(e4);
		 inventory.add(e5);
		 
		 
	}
	  ArrayList<bookinfo> inventory = new ArrayList<bookinfo>();
	
	@Override
	public void addbook() {
	
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Book's title:");
	        String title = scanner.nextLine();
	        System.out.println("Enter the author's name:");
	        String author = scanner.nextLine();
	        System.out.println("Enter the Quantity of the book:");
	        int quantity = scanner.nextInt();
	        System.out.println("Enter the Book's price:");
	        double price = scanner.nextDouble();
	        System.out.println("Enter the BookType:");
	        String booktype = scanner.next();
	        bookinfo newBook = new bookinfo(title, author, quantity,booktype, price);
	        inventory.add(newBook);
	        System.out.println("The book has been added to the inventory.");
	    }
		
	

	@Override
	public void displayInventory() {
	
		  System.out.println("Book Inventory:");
	        for (bookinfo book : inventory) {
	            System.out.println("Title: " + book.getTitle());
	            System.out.println("Author: " + book.getAuthor());
	            System.out.println("Quantity: " + book.getQuantity());
	            System.out.println("booktype: " + book.getBooktype());
	            System.out.println("Price: $" + book.getPrice());
	            System.out.println();
	        }
	  
		
	}

	@Override
	public void buybook() throws NumberFormatException, IOException {
		
		   Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the title of the book you want to buy:");
	        String title = scanner.nextLine();
	        for (bookinfo book : inventory) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                System.out.println("The price of the book is: $" + book.getPrice());
	                System.out.println("Enter the quantity you want to buy:");
	                int quantity = scanner.nextInt();
	                if (quantity > book.getQuantity()) {
	                    System.out.println("Sorry, there are not enough copies of the book in stock.");
	                    return;
	                }
	                double totalPrice = quantity * book.getPrice();
	                System.out.println("The total cost of your purchase is: $" + totalPrice);
	                book.setQuantity(book.getQuantity() - quantity);
	                System.out.println("____________________________Thank you for your purchase__________________________");
	                return;
	            }
	        }
	        System.out.println("Sorry, the book you are looking for is not in our inventory.");
	    }
	

	

}

