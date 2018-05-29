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
public class Exbank {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mybank=new Scanner(System.in);
		
		//create initial accounts
	
                System.out.print("How Many Customer you Want to Input : ");
		int n=mybank.nextInt();
		Bank  C[]=new Bank[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Bank();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
                        System.out.println("Welcome to Rashmi's Bank");
			System.out.println("Main Menu\n1.Display everything\n2.Search By Account\n3.Deposit\n4.Withdrawal\n5.Exit");
			System.out.println("Enter your Choice :");
			ch=mybank.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account Number you Want to Search : ");
					String acn=mybank.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=mybank.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=mybank.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account does Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye..");
					break;
			}
		}
		while(ch!=5);
	}
        
    }
    


