import java.util.Scanner;

public class SectionDriver 
{
	private Scanner input;

	public static void main(String[] args) 
	{
		SectionDriver sd = new SectionDriver();
		sd.input = new Scanner(System.in);
		Section sec = sd.getSectionInfo();
		boolean another = true;
		while(another)
		{
			try
			{
				Student stu = sd.getStudentInfo();
				sec.addStudent(stu);
			}
			catch(Exception e)
			{
				another = false;
			}
		}
		System.out.println(sec.toString());

	}
	private Section getSectionInfo()
	{
		//Scanner input = new Scanner(System.in);
		Section sec = new Section();
		boolean valid = false;
		do
		{
			try 
			{
				System.out.println("Please enter the section number:");
				int secNum = input.nextInt();
				sec.setSecNum(secNum);
				valid = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				valid = false;
			} finally {
				input.nextLine();
			}
		} while (!valid);
		
		valid = false;
		do
		{
			try 
			{
				System.out.println("Please enter the instructor for section " + sec.getSecNum() + ".");
				String inst = input.next();
				sec.setInst(inst);
				valid = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				valid = false;
			} finally {
				input.nextLine();
			}
		} while (!valid);
		
		valid = false;
		do
		{
			try 
			{
				System.out.println("Please enter the room for the section " + sec.getRoom() + ".");
				String room = input.next();
				sec.setRoom(room);
				valid = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				valid = false;
			} finally {
				input.nextLine();
			}
		} while (!valid);
		
		return sec;
	}
	
	private Student getStudentInfo() throws Exception
	{
		Student stu = new Student();
		System.out.println("Please enter the student name, press enter to exit");
		String name = input.nextLine();
		stu.setName(name);
		boolean valid = false;
		do
		{
			try
			{
			System.out.println("Please enter the major for " + stu.getName());
			String major = input.nextLine();
			stu.setMajor(major);
			valid = true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			valid = false;
		}
	}while(!valid);
		
		return stu;
	}

}
