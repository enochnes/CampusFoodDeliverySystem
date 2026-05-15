public class CampusFoodOrderService {

    public void placeOrder(String studentName,
                           String foodName,
                           String notificationType) {

        AppConfig config =
                AppConfig.getInstance();

        System.out.println("University: "
                + config.getUniversityName());

        System.out.println("System Version: "
                + config.getSystemVersion());

        System.out.println("Order created for: "
                + studentName);

        System.out.println("Food: "
                + foodName);

        System.out.println("Delivery Fee: "
                + config.getDeliveryFee()
                + " TL");

        NotificationFactory factory =
                new NotificationFactory();

        Notification notification =
                factory.createNotification(notificationType);

        if (notification != null) {

            notification.send(studentName, foodName);

        }

        else {

            System.out.println("Unknown notification type.");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CampusFoodOrderService service =
                new CampusFoodOrderService();

        service.placeOrder(
                "Ali",
                "Chicken Sandwich",
                "EMAIL"
        );

        service.placeOrder(
                "Zeynep",
                "Vegetarian Pizza",
                "SMS"
        );

        service.placeOrder(
                "Omar",
                "Coffee",
                "PUSH"
        );
    }
}