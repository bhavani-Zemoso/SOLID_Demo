
package badcode;

public interface MemberValidationInterface{

	public void allowAccessToLibraryWithLibraryCard();
	
}

class PhysicalMember implements MemberValidationInterface
{

	@Override
	public void allowAccessToLibraryWithLibraryCard() {
		AllowAccess access = new AllowAccess();
		access.validateUserLibraryCard();
	}

}

class DigitalMember implements MemberValidationInterface
{

	@Override
	public void allowAccessToLibraryWithLibraryCard() {
		//System.out.println("Library Card not available for digital membership");
		throw new AssertionError("Library Card not available for digital membership");
		
	}
	
}
