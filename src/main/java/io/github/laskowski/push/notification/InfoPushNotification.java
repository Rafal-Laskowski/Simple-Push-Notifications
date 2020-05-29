package io.github.laskowski.push.notification;

import java.awt.*;

public class InfoPushNotification extends DefaultPushNotification {

    public InfoPushNotification(String caption, String tooltip, String text) {
        super(caption, tooltip, text, TrayIcon.MessageType.INFO);
    }
}
