package badcode;

public class Member {
	
	private String memberId;
	private String name;
	private String cardId;
	
	public Member(String memberId, String name, String cardId)
	{
		this.memberId = memberId;
		this.name = name;
		this.cardId = cardId;
	}
	
	public String toString()
	{
		return "Member Id : " + memberId + " \n Name : " + name + " Card Id : " + cardId;
	}
}
