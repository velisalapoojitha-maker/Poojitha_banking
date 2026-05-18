
public class StudentMain {
//main method
	public static void main(String[] args) {
		//creating student objects
		Student student1 = new Student(1, "CS", 20);
		Student student2 = new Student(2, "Pooja", 22);
		
		//displaying student details
		System.out.println("Student 1 Details:");
		student1.display();
		
		System.out.println("\nStudent 2 Details:");
		student2.display();
	}
}
