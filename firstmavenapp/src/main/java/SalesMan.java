
public class SalesMan extends Employee
{
    private int points;
    public SalesMan() {}
	public SalesMan(int points,int ssn,String name,int age,int empid, double salary, String orgName) 
	{
		super(ssn,name,age,empid,salary,orgName);
		this.points = points;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
}