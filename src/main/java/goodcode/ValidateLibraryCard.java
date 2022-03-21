package goodcode;

public class ValidateLibraryCard
{
	private BarcodeReader reader;
	
	public ValidateLibraryCard(BarcodeReader reader)
	{
		this.reader = reader;
	}
	
	public boolean validate()
	{
		CardDatabase cards = new CardDatabase();
		
		String details = reader.sendDetails();
		
		if(cards.returnCards().contains(details))
			return true;
		return false;
	}
}
