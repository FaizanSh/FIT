
public class BankAccount
{
	//instance variable diclaration
	private double account=0;
	
	
	
	//Initialization of account
	public BankAccount(){
		
	}
	
	
	
	public BankAccount (double money)
	{	
		if(money>0)
			account=money;
		else
			System.out.println("can't deposit negative value");
	}
	
	//to deposit money into an account.
	public void cashDeposit(int money)
	{	
		if(money>0)
			account=account+money;
		else
			System.out.println("can't deposit negative value");
	}
	
	//to draw money from an account.
	public void cashWithDraw(int money)
	{
		if(account>money)
			account=account-money;
		else
		{
			remainingBalance();
			System.out.print(" is less than the ammount Entered.");
		}
		
	}
	
	//to display the amount of an account.
	public void remainingBalance()
	{
		System.out.println("Remaining balance " + account);
		
	}
	
	/* if amount in a balance is greater than 100000, 
	then increment this amount by 10%.*/
	public void updateBalance()
	{
		if (account>100000)
		{
			account=account+(account*0.1);
		}
	}
	
}


