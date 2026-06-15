/**
 * Sends notifications via SMS.
 *
 * @author Shawn Doherty
 * @version 1.1
 */
public class SMSService implements NotificationMedium {

    /**
     * Constructs an SMS notification service.
     */
    public SMSService() {
    }

    /**
     * Sends a notification using the SMS service.
     *
     * @param message the SMS notification to send
     */
    public void send(String message) {
        System.out.println("[SMS] Sending message: " + message);
    }
}
