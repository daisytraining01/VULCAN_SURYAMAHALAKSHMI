package com.picnic.surya;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverseString="";
	  
		Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter a string :");
	      String inputString = scanner.nextLine();

	      int length = inputString.length();
	     
	      for ( int i = length - 1 ; i >= 0 ; i-- ) 
	      {
	    	  reverseString = reverseString + inputString.charAt(i);
	    	  
	      }
	          

	       if (inputString.equals(reverseString))
	       {
	          System.out.println("This is a palindrome.");
	       }
	       else
	       {    System.out.println("This is not a palindrome.");
	      }

	}

}
