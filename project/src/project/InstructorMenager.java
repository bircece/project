package project;



public class InstructorMenager extends UserMenager{

	public void showCertifacate(Instructor instructor) {
		System.out.println(instructor.getId()+" id li eðitmen "+instructor.getCertificate() + " sertifikasýna sahip.");
	}
	
	public void profession(Instructor instructor) {
		System.out.println(instructor.getId() +" id li eðitmenin uzmanlýk alaný: "+instructor.getProfession());
	}
}
