package goodcode;

public class SendNotificationByEmail implements SendFineNotification
{
	String email;
    public SendNotificationByEmail(String email)
    {
        this.email = email;
    }

	@Override
	public void notifyMember(double fine) {
		System.out.println("Need to pay a fine of " + fine);
		System.out.println("Sent a email to .. " + email);
		
	}
}