
public class CourseSession {

	private String department;
	private String number;
	private int numberOfStudents;

	
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;		
		numberOfStudents = 0;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public Object getNumberOfStudents() {
		return numberOfStudents;
	}
	
	void enroll(Student student){
		numberOfStudents = numberOfStudents + 1; 
	}

}
