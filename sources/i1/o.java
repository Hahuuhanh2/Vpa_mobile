package i1;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: NotificationCompat */
public final class o extends s {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f10969b;

    /* compiled from: NotificationCompat */
    public static class a {
        public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.bigText(charSequence);
        }

        public static Notification.BigTextStyle b(Notification.Builder builder) {
            return new Notification.BigTextStyle(builder);
        }

        public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setBigContentTitle(charSequence);
        }

        public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setSummaryText(charSequence);
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    public final void b(t tVar) {
        a.a(a.c(a.b(tVar.f10996b), (CharSequence) null), this.f10969b);
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
