package oops;

abstract class A2
{
	abstract  void m1(); //semicolon must
	//non static block
	{
		System.out.println("Abstract method");
	}
	
 void m3()
	
	{
		System.out.println("hello");
		
	}
}

class B2 extends A2
{
	 void m1()
	{
		System.out.println("Hello...........");
	}
	void m2()
	{
		System.out.println("Hi.........");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		B2 a1 = new B2();
		a1.m1();
		a1.m2();
		a1.m3();
		
		
		

	}

}
