package badcode;

public class Notification {
	String type;
    String number;
    public Notification(String type, String number)
    {
        this.type = type;
        this.number = number;
    }


	public void sendMessage(double fine) {
		
		if(type.equalsIgnoreCase("Call"))
        {
            System.out.println("Calling ..." + number);
            System.out.println("Need to pay a fine of " + fine);
        }
        else if(type.equalsIgnoreCase("Message"))
        {
            System.out.println("Sending message to ... "+ number);
            System.out.println("Need to pay a fine of " + fine);
        }
		
	}
}
