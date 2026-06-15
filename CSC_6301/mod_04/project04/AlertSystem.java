import java.util.ArrayList;

/**
 * Container class that creates a notification system.
 *
 * @author Shawn Doherty
 * @version 1.0
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> messagesLog;

    /**
     * Constructs an alert system with initial medium.
     *
     * @param medium the initial notification medium to use
     */
    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.messagesLog = new ArrayList<String>();
    }

    /**
     * Allows you to swap the notification service.
     *
     * @param medium the new notification medium
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a message through the preset medium.
     *
     * @param message the message to send
     */
    public void notifyUser(String message) {
        medium.send(message);
        messagesLog.add(currentMediumName() + " " + message);
    }

    /**
     * Returns the current notification medium name.
     *
     * @return current medium simple class name
     */
    private String currentMediumName() {
        return medium.getClass().getSimpleName();
    }

    /**
     * Prints all session messages and their medium.
     */
    public void printLog() {
        System.out.println(messagesLog);
    }

    /**
     * Runs a short demo that sends alerts through two media and prints the log.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem(new EmailService());
        
        String message = "Doctor appointment at 8AM today.";
        alertSystem.notifyUser(message);

        alertSystem.setMedium(new SMSService());
        
        message = "Reply yes for a callback.";
        alertSystem.notifyUser(message);

        alertSystem.printLog();
    }
}
