package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class ErrorPushNotification extends DefaultPushNotification {

    public ErrorPushNotification(String text) {
        super(text, TrayIcon.MessageType.ERROR);
    }
}
