//CSE 110: Class 76370 / Tuesday 12-12:50
//Assignment: Assignment01.java
//Author: Stephen Austria 1220159551
//Description: Scanner variables, pizza party 

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int pizzas = 0;
		int slices;
		int adults;
		int children;
		
		//declare and instantiate  Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for and collect inputs
		System.out.print("Number of pizzas purchased: ");
		pizzas = keyboard.nextInt();
		
		System.out.print("Number of slices per pizza: ");
		slices = keyboard.nextInt();
		
		System.out.print("Number of adults: ");
		adults = keyboard.nextInt();
		
		System.out.print("Number of children: ");
		children = keyboard.nextInt();
		
		//computed value 
		int totalSlices = pizzas * slices;
		
		//required outputs with computed values
		System.out.println("Total number of slices of pizza: " + totalSlices);
	
		System.out.println("Total number of slices given to adults: " + adults * 2);
		int remainingChildrenSlices = totalSlices - (adults * 2);
		
		System.out.println("Total number of slices available for children: " + remainingChildrenSlices);
		int childrenSlices = remainingChildrenSlices / children;
		
		System.out.println("Number of slices each child will get: " + childrenSlices);
		int remainingSlices = remainingChildrenSlices % children;
		
		System.out.println("Number of slices left over: " + remainingSlices);
		
		
		
		

		
		

	}

}
