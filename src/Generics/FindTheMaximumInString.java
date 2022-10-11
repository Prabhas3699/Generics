package Generics;

import java.util.Scanner;

public class FindTheMaximumInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Finding the Maximum string from given Strings:");
		System.out.println("Enter 3 Words : ");
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		
		GenericsString max = new GenericsString();
		System.out.println("Maximum String: " + max.maximum(x, y, z));


	}

}
