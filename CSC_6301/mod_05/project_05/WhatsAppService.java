/**
 * Sends notifications via WhatsApp.
 *
 * @author Shawn Doherty
 * @version 1.1
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Constructs a WhatsApp notification service.
     */
    public WhatsAppService() {
    }

    /**
     * Sends a notification using the WhatsApp service.
     *
     * @param message the WhatsApp notification message
     */
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
