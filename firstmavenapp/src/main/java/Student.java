
public class Student extends Person
{
     private int rollNo;
     private double gpa;
     private int standard;
     public Student() {}
	public Student(int ssn,String name,int age,int rollNo, double gpa, int standard) 
	{
		super(ssn,name,age);
		this.rollNo = rollNo;
		this.gpa = gpa;
		this.standard = standard;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public double getGpa() 
	{
		return gpa;
	}
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	public int getStandard() 
	{
		return standard;
	}
	public void setStandard(int standard) 
	{
		this.standard = standard;
	}
	
}
     
