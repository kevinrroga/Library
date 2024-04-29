package hospital;

public class Main {
	public static void main(String[] args) {
		Ward ward = new Ward(3);
		
		ward.addDoctor(new Doctor("Kevin", "Rroga", 70));
		ward.addDoctor(new Doctor("Indrit", "Vani", 1));
		ward.addDoctor(new Doctor("Jurgen", "Halili", 11));
		ward.addDoctor(new Doctor("Endi", "Shima", 28));
		ward.addDoctor(new Doctor("Klejsti", "klejsti", 90));
		ward.addDoctor(new Doctor("Kosta", "lali neja", 1941));
		
		ward.sortDoctor();
	}

}
