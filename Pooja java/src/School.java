
public class School {
//instance variables
	String name;
	String address;
	int numberOfStudents;
	
	//constructor
	public School(String name, String address, int numberOfStudents) {
		this.name = name;
		this.address = address;
		this.numberOfStudents = numberOfStudents;
	}
	
	//method to display school details
	public void display() {
		System.out.println("School Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Number of Students: " + numberOfStudents);
	}
}
