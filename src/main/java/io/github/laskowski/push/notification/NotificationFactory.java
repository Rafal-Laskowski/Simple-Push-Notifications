package io.github.laskowski.push.notification;

public interface NotificationFactory<T extends PushNotificationCaption> {
    T getPushNotificationCaption(Class<T> pushNotificationCaption);
}
