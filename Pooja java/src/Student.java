
public class Student {
	//instance variable
	int id;
	String name;
	int age;
	
	//constructor
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//method to display student details
	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
