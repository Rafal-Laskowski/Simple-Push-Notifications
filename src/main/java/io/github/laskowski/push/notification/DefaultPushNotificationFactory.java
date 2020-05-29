package io.github.laskowski.push.notification;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultPushNotificationFactory {

    private static final List<PushNotification> pushNotifications = new ArrayList<>();

    public static PushNotification info(String caption, String tooltip, String text) {
        return storeInstance(new InfoPushNotification(caption, tooltip, text));
    }

    public static PushNotification error(String caption, String tooltip, String text) {
        return storeInstance(new ErrorPushNotification(caption, tooltip, text));
    }

    public static PushNotification warning(String caption, String tooltip, String text) {
        return storeInstance(new WarningPushNotification(caption, tooltip, text));
    }

    public static PushNotification none(String caption, String tooltip, String text) {
        return storeInstance(new NonePushNotification(caption, tooltip, text));
    }

    private static PushNotification storeInstance(PushNotification pushNotification) {
        pushNotifications.add(pushNotification);
        return pushNotification;
    }

    public static void stopAll() {
        pushNotifications.forEach(PushNotification::stop);
    }
}
