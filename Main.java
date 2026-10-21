abstract class Notification {
    private String message;

    public String getMessage() {
        return message;
    }

    Notification(String message) {

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message is required");
        }
        this.message = message;
    }

    abstract void getSend();

}

class EmailNotification extends Notification {
    EmailNotification(String message) {
        super(message);

    }

    @Override
    void getSend() {
        System.out.println("Sending Email:" + getMessage());
    }

}

class SMSNotification extends Notification {
    SMSNotification(String message) {
        super(message);

    }

    @Override
    void getSend() {
        System.out.println("SMSNotification :" + getMessage());
    }

}

class PushNotification extends Notification {
    PushNotification(String message) {
        super(message);

    }

    @Override
    void getSend() {
        System.out.println("PushNotification :" + getMessage());
    }

}


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Notification n1 = new EmailNotification("Your order is confirmed");
        Notification n2 = new SMSNotification("Your order is confirmed");
        Notification n3 = new PushNotification("Your order is confirmed");

        n1.getSend();
        n2.getSend();
        n3.getSend();
    }
}