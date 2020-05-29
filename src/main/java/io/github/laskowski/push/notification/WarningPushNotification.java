package io.github.laskowski.push.notification;

import java.awt.*;

public class WarningPushNotification extends DefaultPushNotification {

    public WarningPushNotification(String caption, String tooltip, String text) {
        super(caption, tooltip, text, TrayIcon.MessageType.WARNING);
    }
}
