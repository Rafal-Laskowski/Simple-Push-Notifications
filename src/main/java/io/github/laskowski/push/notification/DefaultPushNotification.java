package io.github.laskowski.push.notification;

import java.awt.*;

public abstract class DefaultPushNotification implements PushNotification {
    private String text;
    private TrayIcon.MessageType type;
    private SystemTray tray;
    private TrayIcon trayIcon;

    protected DefaultPushNotification(String text, TrayIcon.MessageType type) {
        this.text = text;
        this.type = type;
    }

    public abstract String getCaption();

    public abstract String getTooltipMessage();

    @Override
    public void displayNotification() {
        try {
            tray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

            trayIcon = new TrayIcon(image, getTooltipMessage());
            trayIcon.setImageAutoSize(true);

            tray.add(trayIcon);

            trayIcon.displayMessage(getCaption(), text, type);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void stop() {
        tray.remove(trayIcon);
    }
}
