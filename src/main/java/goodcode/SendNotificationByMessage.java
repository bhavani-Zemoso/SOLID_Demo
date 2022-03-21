package goodcode;

public class SendNotificationByMessage implements SendFineNotification
{
	String number;
    public SendNotificationByMessage(String number)
    {
        this.number = number;
    }

	@Override
	public void notifyMember(double fine) {
		System.out.println("Need to pay a fine of " + fine);
		System.out.println("Sent a message to .. " + number);
		
	}
	
}
