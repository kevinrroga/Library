package hospital;

public class Doctor {
	private String name;
	private String surname;
	private int id;
	
	public Doctor(String name, String surname, int id) {
		this.name=name;
		this.surname=surname;
		this.id=id;
	}
	//kur bejme setet gjithmone void
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public int getId(){
		return id;				
	}
	@Override
	 public String toString() {
		 return "Name: "+name+"Surname: "+surname+"Id: "+id;
	 }
	
	public boolean equals(Object o) {
		Doctor doc = (Doctor) o;//eshte nje objekt 'doc' i klases Doctor
		if (doc.id==this.id) {
			return true;
		}
		else
			return false;
	}

}
