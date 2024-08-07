package s;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.browser.trusted.TrustedWebActivityService;

/* compiled from: NotificationApiHelperForO */
public final class a {
    public static Notification a(TrustedWebActivityService trustedWebActivityService, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    public static boolean b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
