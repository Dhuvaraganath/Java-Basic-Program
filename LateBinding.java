package oops;

import java.util.Scanner;

class Animal
{
	
	void makeSound() {
		System.out.println("Sound of the Animals");
		
	}
}
class Dog extends Animal
{
	void makeSound() {
		System.out.println("bow bow");
        }
}
class Cat extends Animal
{
	void makeSound() {
		System.out.println("meow");
     }
}

public class LateBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {

		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		System.out.println("1=Dog");
		System.out.println("2=Cat");
		n =scn.nextInt();
		switch(n) {
		case 1: System.out.println("1=Dog");
		         zoo(new Dog());
		         break;
		case 2: System.out.println("2=Cat");
        			zoo(new Cat());   
		}	
		System.out.println("3=continue");
		n=scn.nextInt();
		
		}while( n>=3);
		
			
	}

	private static void zoo(Animal a) {
			a.makeSound();
	}

}
