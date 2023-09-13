
public class SavingsAccount extends Account
{
	public static double minimumDepositAmount;
	public static int noOfTransactionsPerDay;
	public SavingsAccount() {}
	public SavingsAccount(int accountNo, String openedDate, double balance,double minimumDepositAmount, int noOfTransactionsPerDay)
	{
		super(accountNo,openedDate,balance);
		this.minimumDepositAmount = minimumDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public double getMinimumDepositAmount()
	{
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount)
	{
		this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount);
	}
	public int getNoOfTransactionsPerDay() 
	{
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) 
	{
		this.noOfTransactionsPerDay = validatenoOfTransactionsPerDay(noOfTransactionsPerDay);
	}
	public double validateminimumDepositAmount(double minimumDepositAmount)
	{
		if(minimumDepositAmount > 1500)
		{
			return minimumDepositAmount;
		}
		throw new RuntimeException("Minimum balance is not sufficient");
	}
	public int validatenoOfTransactionsPerDay(int noOfTransactionsPerDay)
	{
		if(noOfTransactionsPerDay < 5)
		{
			return noOfTransactionsPerDay;
		}
		throw new RuntimeException("no of transactions exceeded for the day");
	}
}
