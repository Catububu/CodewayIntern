package codeway_prgrms;

import java.util.Scanner;

class UsersBankAccount
{
	int bal=10000;
	public void balance()
	{
		System.out.println("your balance is: "+bal);
	}
}
class Atm_Machine extends UsersBankAccount
{
	Scanner s=new Scanner(System.in);
	public void apllicationID()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Please selection application id");
		System.out.println("DOMESTIC---> for choose domestic enter 1");
		System.out.println("INTERNATIONAL----> for choose international enter 2");
		int id=s.nextInt();
	}
	public void language() throws Exception
	{
		int p=2776;
		System.out.println("Please select language");
		System.out.println("EGLISH---> choose english enter 1");
		System.out.println("HINDI----> choose hindi enter 2");
		int lang=s.nextInt();
		System.out.println("Enter any number between 10 and 99 for eg.=25");
		int n=s.nextInt();
		if(n>=10 && n<=99)
		{
			System.out.println("please enter your pin");
			int pin=s.nextInt();
			if(pin==p)
			{
				System.out.println("Pleease choose BANKING option---> enter 1 to choose option ");
				int n1=s.nextInt();
				System.out.println("WITHDRAW");
				System.out.println("DEPOSIT");
				System.out.println("BALANCE");
				String opt=s.next();
				if(opt.equalsIgnoreCase("withdraw"))
				{
					if(bal>100) {
						System.out.println("sufficent balance for withdrawls");}
					withdraw();
				}
				else if(opt.equalsIgnoreCase("deposit"))
				{
					deposit();
				}
				else if(opt.equalsIgnoreCase("balance"))
				{
					balance();
				}
			}
			else
			{
				System.out.println("please enter valid pin");
				language();
			}
		}
		else
		{
			System.out.println("please enter correct number");
		}
	}
	
	public void withdraw() throws Exception
	{
		System.out.println("please enter amount");
		int amt=s.nextInt();
		if(amt<=bal)
		{
			System.out.println("your transaction is being processed.. please wait..");
			Thread.sleep(3000);
			System.out.println("please collect cash");
			System.out.println("AVAILABLE BALANCE :");
			System.out.println(bal-amt);
		}
		else
		{
			System.out.println("Insuffient balance");
		}
	}
	public void deposit() throws Exception
	{
		long limit=200000l;
		System.out.println("DEPOSIT FOR TRANSACTION LIMIT : "+limit);
		System.out.println("SERVICE CHARGE : 0");
		System.out.println("enter 1 to click on currency");
		int n3=s.nextInt();
		System.out.println("your transaction is being processed.. please wait.");
		System.out.println("enter 1 to click on ENTER ");
		int n4=s.nextInt();
		System.out.println("validating your cash...");
		Thread.sleep(3000);
		System.out.println("summary");
		System.out.println("500 * 20=10000");
		System.out.println("enter 1 to click on CONFIRM button");
		int n5=s.nextInt();
	}
}
public class Task_3_ATMInterface
	{
           public static void main(String[] args) throws Exception
	    {
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Please enter your card.");
		System.out.println("Hi, please do not remoove your chip card."+'\n'+"Leave yor card inserted during the Entire Transaction");
		Atm_Machine a=new Atm_Machine();
		a.apllicationID();
		a.language();
		System.out.println("TRANSACTION COMPLETE");
		System.out.println("please collect your card");
	  }
}
