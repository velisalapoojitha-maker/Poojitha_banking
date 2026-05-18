
public class Grade {
//instance variable
	int score;
	
	//constructor
	public Grade(int score) {
		this.score = score;
	}
	
	public Grade() {
		// TODO Auto-generated constructor stub
	}

	//method to determine grade
	public String getGrade() {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}
