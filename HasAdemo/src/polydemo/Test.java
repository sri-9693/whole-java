package polydemo;
public class Test
{
	public static void main(String[] args) 
	{
         HomeLoan hl = new HomeLoan(5000000,3,5);
         System.out.println(hl.CalculateEmi());
         VehicleLoan vl = new VehicleLoan(5,9,5500000); 
         System.out.println(vl.CalculateEmi());
	}
}