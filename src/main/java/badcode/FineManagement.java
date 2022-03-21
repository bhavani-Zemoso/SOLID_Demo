package badcode;

public class FineManagement
{
	public double calculateFine(int days)
    {
        double fine = 0;
        if(days <= 10)
            fine = 50.0;
        else if(days > 10 && days < 80)
            fine = 300;
        else
            fine = 600;

        return fine;
    }

    public void fineNotification(double fine)
    {
        Notification obj = new Notification("Call", "9987676545");
        obj.sendMessage(fine);
    }
}
