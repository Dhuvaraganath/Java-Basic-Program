package Oops;

public class Singleton {

	 
		public static Singleton obj=null;
		private Singleton()
		{
			
		}
		public static Singleton getInstance()
		{
			if(obj== null) obj= new Singleton();
			return obj;
		}


	public static void main(String[] args)
	{
		Singleton a1 = Singleton.getInstance();
		
	}

	
}