package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class NonePushNotification extends DefaultPushNotification {

    public NonePushNotification(String text) {
        super(text, TrayIcon.MessageType.NONE);
    }
}
