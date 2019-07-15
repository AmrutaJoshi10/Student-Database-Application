package studdb;
import java.util.*;
public class student {
	
	// Encapsulation will be private. Since we do not want to access it outside.
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tutionBalance = 0;
	/* static means that the value or the property is not specific
	to the object but it is true for all the objects.
	Moreover, it belongs to the class and not the instance of the object.
	*/
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
    // Constructor to prompt user to enter student's name and year
	
	public student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student's first name : ");
		this.firstName = in.nextLine();
		System.out.println("Enter student's last name : ");
		this.lastName= in.nextLine();
		System.out.println("\n 1- Freshmen\n 2- Sophomore \n 3 - Junior \n 4- Senior"
				+ "\n Enter student's grade level : ");
		this.gradeYear = in.nextInt();
		setStudentID();
		}
	
	// Generate an ID
	private void setStudentID() {
	id++;
	this.studentId = gradeYear + ""+id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop user hits Q
		do {
		System.out.print("Enter course to enroll (Q to quit) :");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q"))
		{
			courses = courses + "\n  " +course;
			tutionBalance = tutionBalance + costOfCourse;
		}
		else { break ;}
		} while(1 != 0);
	}
	
	// View Balance
	
	public void ViewBalance() {
		System.out.println("Your balance is : $" +tutionBalance);
	}
	
	// Pay Tuition
	
	public void payTution()
	{ 
		ViewBalance();
		System.out.println("Enter your payment $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank You for your payment of $" +payment);
		ViewBalance();
	}
	
	// Show status
	//toString is the part of the object.
	public String toString()
	{
		return "\nName :"  +firstName + " " + lastName +
				"\nGrade Level :" + gradeYear + 
				"\nStudent ID :" + studentId +
				"\nCourses Enrolled :" + courses +
				"\nBalance :" + tutionBalance;
	}
}
