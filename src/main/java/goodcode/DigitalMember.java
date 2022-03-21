package goodcode;

public class DigitalMember {
	
	private String memberId;
	private String name;
	private String password;
	
	public DigitalMember(String memberId, String name, String password)
	{
		this.memberId = memberId;
		this.name = name;
		this.password = password;
	}
	
	public String toString()
	{
		return "Member Id : " + memberId + " \n Name : " + name;
	}
}
