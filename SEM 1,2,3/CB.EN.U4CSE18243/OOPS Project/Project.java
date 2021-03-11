import java.util.*
class Mailing_system
{
	public abstract class PeopleDetails
	{
		String Name;
		String ClgId;
		int RollNo;
		String Dept;
		private int PhoneNo;
		String Hostel;
		public Details(String name, int rollno, int phone_number)
		{
			Name=name;
			RollNo=rollno;
			PhoneNo=phone_number;
		}
		public void setname(String name)
		{
			Name=name; 
 		}
		public String getname()
		{
			return Name;
		}
		public void setclgid(String college_id)
		{
			ClgId=college_id;
		}
		public String getclgid()
		{
			return ClgId;
		}
		public void setrollno(int rollno)
		{ 
			RollNo=rollno;
		}
		public int getrollno()
		{
			return RollNo;
		}
		public void setdepartment(String department)
		{
			Dept=department;
		}
		public String getdepartment()
		{
			return Dept;
		}
		public void sethostelname(String Hostel_name)
		{
			Hostel=Hostel_name;
		}
		public String gethostelname()
		{
			return Hostel;
		}
		public void setphoneno(int phoneno)
		{
			PhoneNo=phoneno;
		}
		public int getphoneno()
		{
			return PhoneNo;
		}
		public String toString()
		{
			return String.format("%s\n%s\n%d\n%s\n%d\n%s",getname(),getclgid(),getrollno(),getdepartment(),getphoneno(),gethostelname())
		}
	}
	public class Student extends PeopleDetails
	{
		public Student(String name,int rollno,int phone_number,String dept)
		{
			super(name,rollno,phone_number);
			super.setdepartment(dept);
		}
		public String toString()
		{
			return String.format("%s\n%s\n%d\n%s\n%d\n%s",getname(),getclgid(),getrollno(),getdepartment(),getphoneno(),gethostelname());
		}
	}
	public class Faculty extends PeopleDetails
	{
		public Faculty(String name,int rollno,int phone_number,String dept)
		{
			super(name,rollno,phone_number);
			super.setdepartment(dept);
		}
		public String toString()
		{
			return String.format("%s\n%s\n%d\n%s\n%d",getname(),getclgid(),getrollno(),getdepartment(),getphoneno());
		}
	}
	public class Warden extends PeopleDetails
	{
		public Warden(String name,int rollno,int phone_number,String hostel)
		{
			super(name,rollno,phone_number);
			super.sethostelname(hostel);
		}
		public String toString()
		{
			return String.format("%s\n%s\n%d\n%d\n%s",getname(),getclgid(),getrollno(),getphoneno(),gethostelname());
		}
	}
	public class Complaint extends Student
	{
		public Complaint(String name,int rollno,int phone_number,String dept,String complaint_raised,String location_of_issue,String nature_of_issue)
		{
			super(name,rollno,phone_number,dept);
			setcomplaintdetails(complaint_raised,location_of_issue,nature_of_issue);
		}
		public String setcomplaintdetails(String complaint_raised,String location_of_issue,String nature_of_issue)
		{
			String Compt=complaint_raised;
			String Loc=location_of_issue;
			String Nature=nature_of_issue;
		}
		public String getcomplaintintensity()
		{
			return Nature;
		}
		public String toString()
		{
			return String.format("%s\n%s\n%s\n%s\n%s\n%s","Student Details:-",super.toString(),"Complain_Details:-",Compt,Loc,getcomplaintintensity());
		}
	}
	public class Mailing_system_test
	{
		public static void main(String args[])
		{
			Student student = new Student("Ramesh",18123,8080901011,"Computer Science");
			Faculty faculty = new Faculty("Rajeev",15111,8080909088,"Computer Science");
			Warden warden = new Warden("Shanmukh",14545,8080909188,"Valmiki Bhavanam");
			Complaint complaint = new Complaint("Ramesh",18123,8080901011,"Computer Science","Water Dispenser not working","Valmiki Bhavanam","High intensity")
			
			PeopleDetails peopledetails[]=new PeopleDetails[4];
			peopledetails[0] = student;
			peopledetails[1] = faculty;
			peopledetails[2] = warden;
			peopledetails[3] = complaint;
			
			for (int j = 0; j < peopledetails.length; j++)
			{
				System.out.printf("Person %d is a %s \n",j, peopledetails[j],getClass().getName());
			}
			for (PeopleDetails PD : peopledetails)
			{
				if (PD instanceof Complaint)
				{
					Complaint peopledetail = (Complaint) PD;
					System.out.println("")
					System.out.println("")
					System.out.println("Complaint raiser's Details and Complaint Details :-")
				}
				System.out.println(PD);
			}
		}
	}
}