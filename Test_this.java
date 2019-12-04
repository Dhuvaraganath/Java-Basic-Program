package oops;

public class Test_this {

	
		// TODO Auto-generated method stub
		int phno=22233;
		String name="their";
		
		public Test_this(int phno,String name) {
		
			this.phno=phno;
			this.name=name;
			
		}
		
		public static void main(String[] args) {
			Test_this obj = new Test_this(222,"hello");
			obj.display();
			Test_this obj1 = new Test_this(333,"hi");
			obj1.display();
			
			
			
	}

		private void display() {
			// TODO Auto-generated method stub
			System.out.println("Name="+ name + "  phno="+phno);
			
		}

}
