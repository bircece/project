package project;



public class InstructorMenager extends UserMenager{

	public void showCertifacate(Instructor instructor) {
		System.out.println(instructor.getId()+" id li e�itmen "+instructor.getCertificate() + " sertifikas�na sahip.");
	}
	
	public void profession(Instructor instructor) {
		System.out.println(instructor.getId() +" id li e�itmenin uzmanl�k alan�: "+instructor.getProfession());
	}
}
