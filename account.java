package oops;

import java.util.Scanner;

public class account {

	 static double balance;
	 

	public static void main(String[] args) {
		
		account a1=new account();
		account.balance=8000;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int n=1;
		do {
			System.out.println("1-View Balance, 2-Withdraw Balance");
			int option=scn.nextInt();
			if(option==1)
			{
				a1.displayBalance();
			}
			else if(option==2)
			{
				System.out.println("Enter the amount:");
				int amount=scn.nextInt();
				 a1.withDrawAmount(amount);	 
					 }
			else
			{
				System.out.println("Invaild");
			}
			System.out.println("1-Countinue,0-Exit");
			n=scn.nextInt();
		}while(n==1);
	}
	 private void withDrawAmount(int amount) {
		
		// TODO Auto-generated method stub
		 if(balance<amount) {
			 System.out.println("Insufficent balance");
			 return;
		 }
		balance-=amount;
		System.out.println(amount+"RS withdraw");
		displayBalance();
	}
	void displayBalance() {
		// TODO Auto-generated method stub
		 System.out.println(balance);
		
	}

}
