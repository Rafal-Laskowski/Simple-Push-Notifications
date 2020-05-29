package io.github.laskowski.push.notification;

import java.awt.*;

public class ErrorPushNotification extends DefaultPushNotification {

    public ErrorPushNotification(String caption, String tooltip, String text) {
        super(caption, tooltip, text, TrayIcon.MessageType.ERROR);
    }
}
