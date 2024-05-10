package biblioteka;

public class TheUser {
	protected String name;
	protected String surname;
	protected String email;
	protected String password;
	
	public TheUser ()
	{
		
	}
	public TheUser (String name, String surname, String email, String password) {
		this.name=name;
		this.surname=surname;
		this.email=email;
		this.password=password;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return ("Name -> " + this.name + " Surname -> " + this.surname
				+ " Email -> " + this.email);
	}
}
