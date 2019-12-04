package oops;

class A1
{
  void m1()
  {
	  System.out.println("Super class");
  }
}
class B1 extends A1
{
	void m2()
	{
		System.out.println("Sub class");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.m1();
		@SuppressWarnings("unused")
		A1 a2 = (A1) new B1();
		a1.m1();
		A1 b1 = new B1();
		b1.m1();
		
				
	}

}
