package project;

public class Instructor extends User{


	private String certificate;
	
	private String profession;

	public Instructor(int id, String firstName, String lastName, String certificate, String profession) {
		super(id, firstName, lastName);
		this.certificate = certificate;
		this.profession = profession;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
