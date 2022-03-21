package goodcode;

public class ValidatePhysicalMember implements PhysicalMemberValidationInterface{
	
	public static void main(String args[])
	{
		ValidatePhysicalMember physicalMember = new ValidatePhysicalMember();
	}

	@Override
	public void allowAccessToLibraryWithLibraryCard() {
		AllowAccess allow = new AllowAccess();
		allow.validateUser();
		
	}
	
}
