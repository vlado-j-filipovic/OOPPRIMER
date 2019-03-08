package rs.math.oop1.zd.p120700.kreiranje.z01.konstruktor;

public class Employee
{
	private String name;
	private double salary;
	
	public Employee(String n, double s )
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary( double byPercent )
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public String toString()
	{
		return name + " " + salary;
	}
}
