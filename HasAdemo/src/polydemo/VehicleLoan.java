package polydemo;

public class VehicleLoan extends Loan
{
	double vehiclevalue;

	public VehicleLoan(int tenure, double roi, double vehiclevalue) 
	{
		super(tenure, roi);
		this.vehiclevalue = vehiclevalue;
	}
	public double CalculateEmi()
	{
		double a = vehiclevalue * (roi/100);
        a = a * tenure;
        a = a + vehiclevalue;
        a = a/(tenure*12);
        return a;
	}


}
