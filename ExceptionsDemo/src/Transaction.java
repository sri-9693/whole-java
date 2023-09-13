
public class Transaction
{
    public static void deposit(Account acc,double amount)
    {
    	acc.setBalance(acc.getBalance()+amount);
    }
    public static void withdraw(Account acc,double amount)
    {
    	double bal = acc.getBalance();
    	if(bal - amount>=1000)
    	{
    		acc.setBalance(bal-amount);
    	}
    	else
    	{
    	throw new InsufficientBalanceException("your account funds are not sufficient");
    	}
    }
    
}
