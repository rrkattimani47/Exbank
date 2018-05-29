/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbank;

import java.util.Scanner;

/**
 *
 * @author rashmikattimani47
 */
public class Bank {
    private String accno;
	private String name;
	private long balance;

	Scanner mybank=new Scanner(System.in);
	
	//method to open an account
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=mybank.next();
		System.out.print("Enter Name: ");
		name=mybank.next();
		System.out.print("Enter Balance: ");
		balance=mybank.nextLong();
	}

	//method to display account details
	void showAccount()
	{ 
		System.out.println(accno+","+name+","+balance);
	}

	//method to deposit money
	void deposit()
	{
		long amt;
		System.out.println("Enter Amount you Want to Deposit : ");
		amt=mybank.nextLong();
		balance=balance+amt;
	}

	//method to withdraw money
	void withdrawal()
	{
		long amt;
		System.out.println("Enter Amount you Want to withdraw : ");
		amt=mybank.nextLong();
		if(balance>=amt)
		{ 
			balance=balance-amt;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}

	//method to search an account number
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}



    



