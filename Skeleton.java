import java.util.Scanner;

public class Skeleton {
	public static void main(String[] args) {
		 Initialize array of integers
		int[] assignmentGrades = new int[5];
		Scanner scan = new Scanner(System.in);
		int attendanceGrade, midtermGrade;
		double attendancePercent, midtermPercent, assignmentPercent;
		int asgnnumber = 1, sum = 0;
		 for loop to get user input & store in array
		for (int i = 0; i  assignmentGrades.length; i++, asgnnumber++) {
			System.out.println(Input the grade of assignment  + asgnnumber);
			assignmentGrades[i] = scan.nextInt();
		}

		System.out.println(Input the number of attended labs );
		attendanceGrade = scan.nextInt();
		System.out.println(Input the midterm grade );
		midtermGrade = scan.nextInt();
		 for loop to iterate over the array & perform calculations
		for (int value  assignmentGrades) {
			sum += value;
		}
		assignmentPercent = sum  0.3  5;
		midtermPercent = midtermGrade  0.3;
		attendancePercent = attendanceGrade  5  7;

		 display output to user
		System.out.println(Assignments (30%)  + assignmentPercent + n + Attendance (5%)  + attendancePercent
				+ n + Midterm (30%)  + midtermPercent);
	}
}