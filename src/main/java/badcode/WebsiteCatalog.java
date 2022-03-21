package badcode;

public class WebsiteCatalog implements Catalog
{

	@Override
	public void showpaperback() {
		for(int i = 0; i < 3; i++)
		System.out.println("Lord of the Rings " + (i+1));
		
	}

	@Override
	public void showEbooks() {
		//System.out.println("No Ebooks available");
		throw new AssertionError("No Ebooks available");
		
	}

	@Override
	public void showAudiobooks() {
		//System.out.println("No audio books available");
		throw new AssertionError("No audio books available");
		
	}
	
}
