package goodcode;

public class ValidateDigitalMember implements DigitalMemberValidationInterface{
	
	private String username;
	private String password;
	
	private ValidateDigitalMember(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	@Override
	public void login(String username, String password) {
		if(this.username.equals(username) && this.password.equals(password))
			System.out.println("Allow access");
		else
			System.out.println("Access Denied");
	}
	
	public static void main(String args[])
	{
		ValidateDigitalMember physicalMember = new ValidateDigitalMember("b_123", "12345");
		physicalMember.login("b_123", "12345");
	}
	
	
}
