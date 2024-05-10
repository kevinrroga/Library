package biblioteka;

public class TheSupervisor extends TheUser {
	protected String name;
	protected String surame;
	protected String email;
	protected String password;
	protected int PhoneNumber;
	protected int accessLevel = 3;
	
	public TheSupervisor (String name, String surname, String email, String password)
	{
		super(name,surname,email,password);
	}
}
