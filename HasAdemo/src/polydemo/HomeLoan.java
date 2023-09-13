package polydemo;

public class HomeLoan extends Loan
{
	double propertyvalue;
	public HomeLoan(double propertyvalue,int tenure,double roi)
	{
		super(propertyvalue * 0.9,tenure,roi);
		this.propertyvalue = propertyvalue;
	}
	
	public double CalculateEmi()
	{
		double a = loanamount * (roi/100);
        a = a * tenure;
        a = a + loanamount;
        a = a/(tenure*12);
        return a;
	}

		
}



