package Generics;

import java.util.Scanner;

public class FindTheMaximumRefactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Maximum of Integers is "+GenericsRefactor.printMax(10,20,18));
		System.out.println("Maximum of Float is " +GenericsRefactor.printMax(10.7f,20.4f,17.7f));
		System.out.println("Maximum of Three Strings is " +GenericsRefactor.printMax("Apple","Peach","Banana"));


	}

}
