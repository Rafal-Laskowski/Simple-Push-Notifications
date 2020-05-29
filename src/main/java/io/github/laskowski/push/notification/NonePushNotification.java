package io.github.laskowski.push.notification;

import java.awt.*;

public class NonePushNotification extends DefaultPushNotification {

    public NonePushNotification(String caption, String tooltip, String text) {
        super(caption, tooltip, text, TrayIcon.MessageType.NONE);
    }
}
