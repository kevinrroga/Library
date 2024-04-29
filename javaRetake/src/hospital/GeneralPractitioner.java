package hospital;

public class GeneralPractitioner extends Doctor{
	int patientsChecked;
	
	public GeneralPractitioner(String name,String surname, int id, int patientsChecked) {
		super(name,surname,id);
		this.patientsChecked=patientsChecked;
	}
	public String toString() {
		return super.toString() + "Patients Checked: "+ patientsChecked;
	}
}
