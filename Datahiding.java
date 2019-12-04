package oops;
class A
{
	public static void m1()
	{
		System.out.println("Hi.......");
	}
}
class C extends A
{
   public static void m2()
   {
	   System.out.println("Bye......");
   }
}
public class Datahiding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		a1.m1();
		C b1 = new C();
		b1.m2();
		A b11 = new C(); // data hiding
		b11.m1();

	}

}
