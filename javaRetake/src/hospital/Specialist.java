package hospital;

public class Specialist extends Doctor {
	String speciality;

	public Specialist(String name, String surname, int id, String speciality) {
		super(name, surname, id);
		this.speciality = speciality;
	}
	public String toString() {
		return super.toString() + "Speciality: "+speciality;
	}
}