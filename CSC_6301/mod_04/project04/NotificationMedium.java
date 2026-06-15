/**
 * Defines a notification channel capable of sending a message.
 *
 * @author Shawn Doherty
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message through the implementing medium.
     *
     * @param message the message text to send
     */
    void send(String message);
}
