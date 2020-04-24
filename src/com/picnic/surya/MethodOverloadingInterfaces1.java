package com.picnic.surya;

import java.util.Scanner;

public class MethodOverloadingInterfaces1 implements NewInt
{
	String name;
	   int age;
	   public void display() {
	      System.out.println("This is the implementation of the display method");
	   }
	   public void display(String name, int age) {
	      System.out.println("Name: "+name);
	      System.out.println("Age: "+age);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      MethodOverloadingInterfaces1 obj = new MethodOverloadingInterfaces1();
	      obj.display(); 
	      obj.display(name, age);
	      

	}

}
