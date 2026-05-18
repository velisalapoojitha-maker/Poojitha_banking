
public class SchoolMain {
//Scanner class to read input from user
	public static void main(String[] args) {
		//creating an object of School class
		School school = new School("Care model high school", "Tilak Nagar", 600);
		school.display();
		
		System.out.println();
		
		//creating an object of Student class
		Student student = new Student(1, "Alice", 20);
		student.display();
		
		System.out.println();
		
		//creating an object of Account class
		Account account = new Account(12345, "Alice", 1000.50);
		account.display();
	}
	
}
