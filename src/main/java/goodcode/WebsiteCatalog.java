package goodcode;

public class WebsiteCatalog implements PaperbackCatalog, EBooksCatalog
{
	
	private void searchUsingPublisher()
	{
		
	}
	
	private void searchUsingGenre()
	{
		
	}
	
	private void searchUsingBookName()
	{
		
	}

	@Override
	public void showAllPaperbackBooks() {
		for(int i = 0; i < 3; i++)
			System.out.println("Lord of the Rings " + (i+1));
		
	}

	@Override
	public void searchPaperbackBooks() {
		searchUsingPublisher();
		searchUsingBookName();
		searchUsingGenre();
		
	}

	@Override
	public void showAllEBooks() {
		for(int i = 0; i < 8; i++)
			System.out.println("Game of Thrones " + (i+1));
		
	}

	@Override
	public void searchEBooks() {
		searchUsingPublisher();
		searchUsingBookName();
		searchUsingGenre();
		
	}
		

}
