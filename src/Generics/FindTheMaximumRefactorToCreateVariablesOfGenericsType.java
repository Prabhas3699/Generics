package Generics;

import java.util.Scanner;

public class FindTheMaximumRefactorToCreateVariablesOfGenericsType<T extends Comparable> {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Maximum of Integers is "+GenericsRefactor.printMax(4,5,6));
		System.out.println("Maximum of Float is " +GenericsRefactor.printMax(4f,5f,6f));
		System.out.println("Maximum of Three Strings is " +GenericsRefactor.printMax("apple","peach","banana"));

	}
}