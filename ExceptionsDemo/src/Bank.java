
public class Bank 
{
	private String bankName;
	private String branchName;
	private Account[] accounts;
	private int index=0;
	public Bank() {}
	public Bank(String bankName, String branchName)
	{
		super();
		this.bankName = bankName;
		this.branchName = branchName;
        this.accounts = new Account[10];
	}
	public String getBankName()
	{
		return bankName;
	}
	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}
	public String getBranchName()
	{
		return branchName;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	public boolean addAccount(Account a)
	{
		if(index<10)
		{
			accounts[++index]=a;
			return true;
		}
		throw new RuntimeException("cannot add accounts");
	}
	public boolean transaction(char type,int accountNo,double amount)
	{
		for(int i=0;i<index;i++)
		{
			if(accounts[i].getAccountNo()==accountNo)
			{
				if(type=='W')
				{
					if(accounts[i] instanceof SavingsAccount)
					{
						if(accounts[i].getBalance()-amount >=SavingsAccount.minimumDepositAmount);
					}
				}
			}
		}
		return false;
	}
	

}
