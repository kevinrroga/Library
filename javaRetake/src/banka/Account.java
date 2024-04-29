package banka;

public class Account {
	private String name;
	private String surname;
	private int id;
	
	public Account(String name, String surname, int id) {
		this.name=name;
		this.surname=surname;
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Name: "+name+"Surname: "+surname+"Id: "+id;
	}
	public boolean equals(Object o) {
		Account a = (Account) o;
		if(a.id==this.id) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
