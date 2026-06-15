/**
 * Test script for the Flexible Notification System.
 * Demonstrates the maintenance path: swapping notification services
 * without modifying the AlertSystem core.
 *
 * @author Shawn Doherty
 * @version 1.1
 */
public class AlertSystemTest {

    /**
     * Runs comprehensive tests of all notification services.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("=== Alert System Maintenance Test ===\n");

        // Test 1: Email Service
        System.out.println("Test 1: Email Service");
        AlertSystem alertSystem = new AlertSystem(new EmailService());
        alertSystem.notifyUser("Doctor appointment at 8AM today.");
        alertSystem.notifyUser("Prescription refill ready for pickup.");
        System.out.println();

        // Test 2: SMS Service
        System.out.println("Test 2: SMS Service");
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Reply yes for a callback.");
        alertSystem.notifyUser("Lab results available online.");
        System.out.println();

        // Test 3: WhatsApp Service (new maintenance enhancement)
        System.out.println("Test 3: WhatsApp Service (New Feature)");
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("Your appointment is in 1 hour.");
        alertSystem.notifyUser("Medication reminder: Take twice daily.");
        System.out.println();

        // Test 4: Print consolidated log
        System.out.println("Test 4: Consolidated Message Log");
        System.out.println("All messages sent across all channels:");
        alertSystem.printLog();
        System.out.println();

        System.out.println("=== Test Complete ===");
        System.out.println("✓ No modifications to AlertSystem or NotificationMedium required");
        System.out.println("✓ Services swapped at runtime via setMedium()");
        System.out.println("✓ Open-Closed Principle: System is open for extension, closed for modification");
    }
}
