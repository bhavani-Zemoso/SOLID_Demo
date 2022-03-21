package goodcode;

public class BarcodeReaderVersion1 implements BarcodeReader
{
	public void readCard()
	{
		System.out.println("Details obtained");
	}
	
	public String sendDetails()
	{
		String cardId = "898778-89878";
		return cardId;
	}
}