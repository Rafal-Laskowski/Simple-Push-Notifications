package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class DefaultPushNotification implements PushNotification {
    private String text, caption, tooltip;
    private TrayIcon.MessageType type;
    private SystemTray tray;
    private TrayIcon trayIcon;

    protected DefaultPushNotification(String caption, String tooltip, String text, TrayIcon.MessageType type) {
        this.caption = caption;
        this.text = text;
        this.tooltip = tooltip;
        this.type = type;
    }

    @Override
    public void displayNotification() {
        try {
            tray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

            trayIcon = new TrayIcon(image, tooltip);
            trayIcon.setImageAutoSize(true);

            tray.add(trayIcon);

            trayIcon.displayMessage(caption, text, type);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void stop() {
        tray.remove(trayIcon);
    }
}
