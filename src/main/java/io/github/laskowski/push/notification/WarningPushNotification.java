package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class WarningPushNotification extends DefaultPushNotification {

    public WarningPushNotification(String text) {
        super(text, TrayIcon.MessageType.WARNING);
    }
}
