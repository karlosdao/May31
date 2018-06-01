
public class Student 
{
	private String name;
	private String major;
	private double gpa;
	private int hours;

	public Student() 
	{
		this.name = "Not set";
		this.major = "Not set";
		this.gpa = 0;
		this.hours = 0; //don't need this. , but it saves typing if you copy and paste.
	}

	public Student(String name, String major, double gpa, int hours) throws Exception
	{
	
		setName(name);
		setMajor(major);
		setGpa(gpa);
		setHours(hours);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) throws Exception 
	{
		
		if (name.length() > 0)
		{
		throw new Exception("Name not blank");
		}
		this.name = name;
	}

	public String getMajor() 
	{
		return major;
	}

	public void setMajor(String major) throws Exception 
	{
		
		if (major.length() > 0)
		{
		throw new Exception("Major not blank");
		}
		this.major = major;
	}

	public double getGpa() 
	{
		return gpa;
	}

	public void setGpa(double gpa) throws Exception 
	{
		
		if (gpa < 0 && gpa > 4.0)
		{
		throw new Exception("GPA is invalid");
		}
		this.gpa = gpa;
	}

	public int getHours() 
	{
		return hours;
	}

	public void setHours(int hours) throws Exception 
	{
		
		if (hours < 0 && hours > 17)
		{
		throw new Exception("Hours invalid");
		}
		this.hours = hours;
		
	}
	public String toString()
	{
		return name + "\t\t" + major + "\t" + gpa + "\t" + hours;
	}

}
