package hospital;

public class Ward {
	Doctor[] doctor; //this is a doctor object array
	int index;
	
	public Ward() {
		doctor = new Doctor[500]; 
		index=0;
		//emrin e array e kemi dhe me siper tani e inicializojme
	}
	public Ward(int size) {/*konstruktori qe inicializon nje array doctor me sizen sac do e ket
	ne parameter*/
		doctor = new Doctor[size];
		index=0;
	}
	public void addDoctor(Doctor d) {
		/*nqs indeksi eshte isoj me gjatesin e arrayt
		 * kjo behet qe ta rrisesh kapacitetin e arrayt dinamically*/
		if (index==doctor.length) {
			Doctor[] d2 = new Doctor[index*2];//eshte kjo ktu qe the
			for (int i=0;i<index; i++) {//bo kushtin 
				d2[i] = doctor[i];//te d2 te kopjosh kte doktor[i] dersa e ke
			}
			doctor = d2;
			doctor[index] = d;//te ky indeksi fusim kte qe krijoi problemin
			//System.out.println(doctor[index]);
			index++;
		}
		else {
			doctor[index]=d;
			//System.out.println(doctor[index]);
			index++;	
		}
	}
	public String toString() {
		//nuk behet me return direkt se do ktheje array prandaj
		String s = "";
		for (int i=0; i<index; i++) {
			s += doctor[i]+", "+ " \n";			
		}
		return s;
	}
	public void sortDoctor() {
		Doctor temp = null;
		for (int i=0; i<index-1;i++) {
			for (int j=i+1; j<index;j++) {
				if(doctor[j].getId()>doctor[i].getId())
				{
					temp = doctor[i];
					doctor[i] = doctor[j];
					doctor[j] = temp;
				}
			}
		}
		for (int i=0; i<index;i++) {
			System.out.println(doctor[i]);
		}
	}
}
