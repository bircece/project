package project;



public class StudentMenager extends UserMenager {

	public void learnArea(Student student) {
		System.out.println(student.getId() + " id li ��rencinin ��renme alan�:  "+student.getLearningArea());
	}
	
	public void course(Student student) {
		System.out.println(student.getId()+ " id li ��renci "+student.getCourse() +" kursuna kay�tl�." );
	}
}
