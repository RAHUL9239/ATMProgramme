package com;

class Second implements First
{
	int balance;

	@Override
	public void availablebalnce() 
	{
		System.out.println(" available Balance Is "+balance);

	}


	@Override
	public void deposite(int depositeamount) 
	{
		System.out.println(depositeamount+ "== Amount Deposite Succesfully!!");
		balance=balance+depositeamount;

	}


	@Override
	public void withdraw(int withdrawamount) 
	{
		System.out.println(withdrawamount+ " Amount Withdrawamount Succesfully!!");
		balance=balance-withdrawamount;
		

	}

	

}
