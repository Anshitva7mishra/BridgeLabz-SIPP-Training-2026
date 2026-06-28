class Notification {
    private String recipientName;
    private String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        System.out.println("Sending generic notification to " + recipientName);
    }
}

class EmailNotification extends Notification {
    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + getRecipientName() + " | Message: " + getMessage());
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + getRecipientName() + " | Message: " + getMessage());
    }
}

class PushNotification extends Notification {
    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " + getRecipientName() + " | Message: " + getMessage());
    }
}

public class smartNotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];
        notifications[0] = new EmailNotification("Alice", "Welcome to our platform!");
        notifications[1] = new SMSNotification("Bob", "Your OTP is 123456.");
        notifications[2] = new PushNotification("Charlie", "You have a new match!");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
