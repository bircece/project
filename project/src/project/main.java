package project;



public class main {

	public static void main(String[] args) {
	
		
		User user= new User(12345, "Birce ", "Cetin");

		UserMenager userMenager= new UserMenager();
		userMenager.Add(user);
		
		Student student = new Student(67583, "Tu��e", "Akku�", "C#", "yaz�l�mc� geli�tirme kursu 1");
		StudentMenager studentMenager= new StudentMenager();
		studentMenager.course(student);
		studentMenager.learnArea(student);
		
		Instructor instructor= new Instructor(49382, "Nazl� ", "Mutluer", "ITIL", "Java, Android");
		
		InstructorMenager instructorMenager= new InstructorMenager();
		instructorMenager.showCertifacate(instructor);
		instructorMenager.profession(instructor);

	}

}
