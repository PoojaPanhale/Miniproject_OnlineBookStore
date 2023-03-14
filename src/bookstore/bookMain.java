package bookstore;

import java.io.IOException;
import java.util.Scanner;

import servicesimplementation.bookimp;

public class bookMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("OnlineBookStore");
	      System.out.println("1.ADD book in Books list");
	      System.out.println("2.buy book");
	      System.out.println("3.DisplayInventory");



	      System.out.println("Book Store");
	       bookimp e=new bookimp();

	      do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  e.addbook();
	    		  break;
	    	  case 2:
	    		  e.buybook();
	    		  break;
	    	 
	    	  case 3:
	    		  e.displayInventory();
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));

	}



}
