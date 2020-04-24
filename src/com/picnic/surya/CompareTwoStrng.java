package com.picnic.surya;

import java.util.Scanner;

public class CompareTwoStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=null,str2 = null;
		String temp=null;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the string :");
		str1= s.nextLine();
		System.out.println("Please enter the character to remove :");
		str2=s.nextLine();
		temp=str1;
		if(str1.contains(str2)) {
			str1=str1.replaceAll(str2, "");
			System.out.println("String after the modification :" +str1);
		}
		else {
			System.out.println("The character you have entered is invalid:");
			
		}
			if(str1.contentEquals(temp))
			{
				System.out.println("The string is the same and has not been modified");

			}
			else {
				System.out.println("The string has been modified");
			}

	}

}
