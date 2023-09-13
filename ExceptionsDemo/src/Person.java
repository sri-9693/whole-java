
public class Person
{
	int ssn;
	String Name;
	int age;
	char gender;
	public Person()  {}
	public Person(int ssn, String name, int age, char gender) 
	{
	
		this.ssn = ssn;
		Name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = ValidateAge(age);
	}
	public char getGender()
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = ValidateGender(gender);
	}
	
	private int ValidateAge(int age)
	{
		if(age>=18)
			return age;
		throw new RuntimeException("Age cannot be less than 1");
	}
	private char ValidateGender(char gender)
	{
		if(gender=='M' || gender=='F')
			return gender;
		throw new RuntimeException("gender should be either M or F");
	}

}
