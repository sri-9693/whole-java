package polydemo;

abstract public class Loan 
{
	double loanamount;
	int tenure;
	double roi;
	
	public Loan(double loanamount, int tenure, double roi) 
	{
		this.loanamount = loanamount;
		this.tenure = tenure;
		this.roi = roi;
	}
	public Loan(int tenure, double roi)
	{
		this.tenure = tenure;
		this.roi = roi;
	
	}

	abstract public double CalculateEmi(); 
}
