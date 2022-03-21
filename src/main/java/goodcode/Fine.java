package goodcode;

public class Fine {

	public static void main(String[] args) {
		FineCalculation calculate = new FineCalculation(34);
		double fine = calculate.calculateFine();
		System.out.println("Fine = " + fine);
		
		SendFineNotification notify = new SendNotificationByCall("7898767654");
		notify.notifyMember(fine);
	}

}
