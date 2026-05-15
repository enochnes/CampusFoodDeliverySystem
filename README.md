# Campus Food Delivery System

## Project Description

This project was developed for the Software Design Patterns homework assignment.

The system simulates a simple campus food ordering application where students can place food orders and receive notifications.

The project was refactored by using:
- Factory Pattern
- Singleton Pattern

## Design Patterns Used

### Factory Pattern
The Factory Pattern was used to create different notification objects such as:
- EmailNotification
- SmsNotification
- PushNotification

This improved the flexibility and maintainability of the system.

### Singleton Pattern
The Singleton Pattern was used in the AppConfig class to manage shared system configuration values such as:
- University name
- Delivery fee
- System version

## Project Structure

```text
Notification.java
EmailNotification.java
SmsNotification.java
PushNotification.java
NotificationFactory.java
AppConfig.java
CampusFoodOrderService.java
