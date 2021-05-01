package project;

public class Student extends User {
private String learningArea;
	
	private String course;

	public Student(int id, String firstName, String lastName, String learningArea, String course) {
		super(id, firstName, lastName);
		this.learningArea = learningArea;
		this.course = course;
	}

	public String getLearningArea() {
		return learningArea;
	}

	public void setLearningArea(String learningArea) {
		this.learningArea = learningArea;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
