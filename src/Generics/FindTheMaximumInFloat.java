package Generics;

import java.util.Scanner;

public class FindTheMaximumInFloat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Finding the Maximum number from given numbers:");
		System.out.println("Enter 3 numbers : ");
		Float x = sc.nextFloat();
		Float y = sc.nextFloat();
		Float z = sc.nextFloat();
		
		GenericsFloat max = new GenericsFloat();
		System.out.println("Maximum number: " + max.maximum(x, y, z));


	}

}
