package badcode;

public class Fine {
	public static void main(String args[])
    {
		FineManagement manage = new FineManagement();
        double fine = manage.calculateFine(34);
        manage.fineNotification(fine);
        
    }
}