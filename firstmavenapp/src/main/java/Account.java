import java.time.LocalDate;
public class Account 
{
    private int accountNumber;
    private double balance;
    private String name;
    private LocalDate openedDate;
    public Account() {}
	public Account(int accountNumber, double balance, String name, LocalDate openedDate) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.openedDate = openedDate;
    }
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Account  )
		{
			Account a = (Account)obj;
			return accountNumber == a.accountNumber && balance == a.balance && name.equals(a.name) && openedDate.equals(a.openedDate);
		}
		return false;
	}
	public String toString()
	{
	    return "Account number:" + accountNumber + " \nBalance : " + balance + " \nName : " + name + " \nAccount opened date : " + openedDate;
	}
	
}   

