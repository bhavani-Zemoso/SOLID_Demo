package badcode;

import java.util.*;

public class CardDatabase {
	
	public List<String> cardsList = new ArrayList<String>();
	
	public void addCards(String cardNumber)
	{
		cardsList.add(cardNumber);
	}

}
