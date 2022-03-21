package badcode;

public class AllowAccess
{
	public void validateUserLibraryCard()
	{
		ValidateLibraryCard validateCard = new ValidateLibraryCard(new BarcodeReader());
		boolean validation = validateCard.validate();
		if(validation)
			System.out.println("Access allowed");
		else
			System.out.println("Access Denied");
	}
	
}



