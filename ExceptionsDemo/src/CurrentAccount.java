
public class CurrentAccount extends Account
{
	private double overDraftLimit;
	public CurrentAccount() {}
	public CurrentAccount(int accountNo, String openedDate, double balance,double overDraftLimit) 
	{
		super(accountNo,openedDate,balance);
		this.overDraftLimit = overDraftLimit;
	}
	public double getOverDraftLimit() 
	{
		return overDraftLimit;
	}
	public void setOverDraftLimiit(double overDraftLimit) 
	{
		this.overDraftLimit = overDraftLimit;
	}
	public double validateoverDraftLimit(double overDraftLimit)
	{
		if(overDraftLimit > 100000)
		{
			return overDraftLimit;
		}
		throw new RuntimeException("OD limit crossed");
	}
}
