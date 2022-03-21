package badcode;

public class ValidateMember {
	public static void main(String args[])
	{
		PhysicalMember pMember = new PhysicalMember();
		pMember.allowAccessToLibraryWithLibraryCard();
		
		DigitalMember dMember = new DigitalMember();
		dMember.allowAccessToLibraryWithLibraryCard();
	}
}
