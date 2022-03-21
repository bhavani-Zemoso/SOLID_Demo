package goodcode;

public class SendNotificationByCall implements SendFineNotification
{
    String number;
    public SendNotificationByCall(String number)
    {
        this.number = number;
    }

    @Override
    public void notifyMember(double fine) {
    	System.out.println("Need to pay a fine of " + fine);
    	System.out.println("Made a call to .. " + number);
    }
}
