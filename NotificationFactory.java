public class NotificationFactory {

    public Notification createNotification(String type) {

        if (type.equalsIgnoreCase("EMAIL")) {

            return new EmailNotification();

        }

        else if (type.equalsIgnoreCase("SMS")) {

            return new SmsNotification();

        }

        else if (type.equalsIgnoreCase("PUSH")) {

            return new PushNotification();

        }

        return null;
    }
}