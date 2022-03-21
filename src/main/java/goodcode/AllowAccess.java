package goodcode;

public class AllowAccess {
	public void validateUser()
	{
		ValidateLibraryCard validateCard = new ValidateLibraryCard(new BarcodeReaderVersion1());
		boolean validation = validateCard.validate();
		if(validation)
			System.out.println("Access allowed");
		else
			System.out.println("Access Denied");
	}
	
}

