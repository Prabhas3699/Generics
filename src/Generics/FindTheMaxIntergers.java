package Generics;

import java.util.Random;
import java.util.Scanner;

public class FindTheMaxIntergers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Finding the Maximum number from given numbers:");
		System.out.println("Enter 3 numbers : ");
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer z = sc.nextInt();
		
		Generics max = new Generics();
		System.out.println("Maximum number: " + max.maximum(x, y, z));

	}

}
