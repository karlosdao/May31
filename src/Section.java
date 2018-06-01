import java.util.ArrayList;

public class Section 
{
	private int secNum;
	private String inst;
	private String room;
	private ArrayList<Student> students;

	public Section() 
	{
		this.secNum = 0;
		this.inst = "not set";
		this.room = "not set";
		students = new ArrayList<Student>();
	}

	public Section(int secNum, String inst, String room) throws Exception 
	{
		this();
		setSecNum(secNum);
		setInst(inst);
		setRoom(room);
	}

	public int getSecNum() {
		return secNum;
	}

	public void setSecNum(int secNum) throws Exception 
	{
		if(secNum < 1 || secNum > 15)
		{
			throw new Exception("Invalid section");
		}
		this.secNum = secNum;
	}

	public String getInst() {
		return inst;
	}

	public void setInst(String inst) throws Exception 
	{
		if (inst.isEmpty())
		{
			throw new Exception("Insturctor cannot be blank");
		}
		this.inst = inst;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) throws Exception 
	{
		if(room.isEmpty())
		{
			throw new Exception("Room cannot be blank");
		}
		this.room = room;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addStudent(Student stu)
	{
		students.add(stu);
	}
	public String toString()
	{
		String result = "Section\t\tInstructor\t\tRoom";
		result += secNum + "\t\t" + inst + "\t\t" + room + "\n";
		
		result += "Name\t\tMajor\tGPA\tHours\n";
		
		
		for(Student stu : students)
		{
			result += stu.toString() + "\n";
		}
		return result;
	}

}
