package badcode;

public class ValidateLibraryCard
{
	CardDatabase cards = new CardDatabase();
	private BarcodeReader reader;
	
	public ValidateLibraryCard(BarcodeReader reader)
	{
		this.reader = reader;
	}
	
	public boolean validate()
	{
		String details = reader.readCard();
		if(cards.cardsList.contains(details))
			return true;
		return false;
	}
}
