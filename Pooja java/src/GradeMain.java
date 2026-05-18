

public class GradeMain {
//main method
	public static void main(String[] args) {
	//scanning user input
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();
		
		//creating Grade object
		Grade grade = new Grade(score);
		
		//displaying the grade
		System.out.println("The grade is: " + grade.getGrade());
		
		scanner.close();
	}
}
