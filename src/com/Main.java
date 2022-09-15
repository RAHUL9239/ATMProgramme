package com;

import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
		int balance;
		First f=new Second();
		int atmNumber=12345;
		int atmPin=143;
		Scanner scan=new Scanner(System.in);
		System.out.println("WelCome HDFC Bank ATM");
		System.out.println("=================");
		System.out.print("ENTER YOUR ATM NUMBER:-");
		int atmnumber=scan.nextInt();
		System.out.print("ENTER YOUR ATM PIN:- ");
		int atmpin=scan.nextInt();

		if((atmNumber==atmnumber)&&(atmPin==atmpin))
		{

			while(true){

				System.out.println("1: To Deposite Amount");
				System.out.println("2: To Withdraw Amount");
				System.out.println("3: To Check Available Balance");
				System.out.println("4: Exit");
				System.out.println("==========================================");
				System.out.println("Enter option");
				int choice=scan.nextInt();
				switch(choice)
				{


				case 1: System.out.print("Enter Deposited Amount:-  ");
				int depositeamount=scan.nextInt();
				f.deposite(depositeamount);
				f.availablebalnce();
				break;

				case 2: System.out.print("Enter Amount to Withdraw:- ");
				int withdrawamount=scan.nextInt();
				f.withdraw(withdrawamount);
				f.availablebalnce();
				break;

				case 3: System.out.print("IN Your Account");
				f.availablebalnce();
				break;
				
				case 4: System.out.println("Exit");
				int exit=scan.nextInt();
				break;
				
				default: System.out.println("Invalid Option");
				System.out.println("Thank You Visite Again");
				break;

				}

			}
		}
		else
		{
			System.out.println("Incorrect ATM number or Pin\nPlease Enter Correct ATM Number And Pin\n ThankYou");
		}

	}

}
