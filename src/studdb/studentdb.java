package studdb;
import java.util.*;
public class studentdb {

	public static void main(String[] args) {
		// Ask how many new students to be added in the DB. 
		System.out.println("Enter the number of students to enroll");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		// Array of Object.
		student[] students = new student[numOfStudents];
		
		// Create n number of students.
		for(int i =0 ; i<numOfStudents ; i++)
		{ 	students[i] = new student();
			students[i].enroll();
			students[i].payTution();
		}
		
		for(int i =0 ; i<numOfStudents ; i++)
		{ 	
			System.out.println(students[i].toString());
		}
	
		
		

	}

}
