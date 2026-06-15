/**
 * Sends notifications via email 
 *
 * @author Shawn Doherty
 * @version 1.1
 */
public class EmailService implements NotificationMedium {

    /**
     * Constructs an email notification service.
     */
    public EmailService() {
    }

    /**
     * Sends a notification using the email service.
     *
     * @param message the email notification message
     */
    public void send(String message) {
        System.out.println("[Email] Sending message: " + message);
    }
}
