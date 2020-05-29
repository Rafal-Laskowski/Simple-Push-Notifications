package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class InfoPushNotification extends DefaultPushNotification {

    public InfoPushNotification(String text) {
        super(text, TrayIcon.MessageType.INFO);
    }
}
