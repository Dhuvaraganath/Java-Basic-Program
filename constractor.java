package oops;

public class constractor {
	int length;
	int wight;
	int hight;
	
    constractor (int n){
    	length=n;
    	wight=n;
    	hight=n;
    	
    }
    constractor(int h,int w, int l){
    	length=l;
    	wight=w;
    	hight=h;
    }
    constractor(){
    	
    }
    
    void display()
    {
    	System.out.println("["+length+","+ wight +","+ hight+"]");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constractor a1= new constractor(5);
		constractor a2= new constractor(5,6,7);
		constractor a3= new constractor();
		  a1.display();
		  a2.display();
		  a3.display();
		  
		  
		  
	}
	

}
