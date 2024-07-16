package jul16th;

public class Bank {
	
	private double balance=10000;
	
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	//getters 
	public double getBalance(int pin)
	{
		//validation 
		if(pin == 3214)
		{
		return balance;
		}
		else
		{
			return 0.0;
		}
	}
	

}
