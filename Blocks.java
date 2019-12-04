package oops;

public class Blocks {
	// static block
	static 
	{
		System.out.println("static block running");
	}
	//non static blocks or instance initalization block  
	//its runs only when object is created.
	{
		System.out.println("non static blocks");
	}
   Blocks(){
	   System.out.println("constactor created");
   }
	public static void main(String [] args) {
		//Blocks a1 =
				new Blocks();
		
				
	}
}
