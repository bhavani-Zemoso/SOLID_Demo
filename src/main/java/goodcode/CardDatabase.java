package goodcode;

import java.util.*;

public class CardDatabase {
 private List<String> cardsList = new ArrayList<String>();
	
	public void addCards(String cardNumber)
	{
		cardsList.add(cardNumber);
	}
	
	public List<String> returnCards()
	{
		return cardsList;
	}
}
