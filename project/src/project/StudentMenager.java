package project;



public class StudentMenager extends UserMenager {

	public void learnArea(Student student) {
		System.out.println(student.getId() + " id li öğrencinin öğrenme alanı:  "+student.getLearningArea());
	}
	
	public void course(Student student) {
		System.out.println(student.getId()+ " id li öğrenci "+student.getCourse() +" kursuna kayıtlı." );
	}
}
