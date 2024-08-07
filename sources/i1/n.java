package i1;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat */
public final class n extends s {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f10966b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f10967c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10968d;

    /* compiled from: NotificationCompat */
    public static class a {
        public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            return bigPictureStyle.bigPicture(bitmap);
        }

        public static Notification.BigPictureStyle b(Notification.Builder builder) {
            return new Notification.BigPictureStyle(builder);
        }

        public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            return bigPictureStyle.setBigContentTitle(charSequence);
        }

        public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    /* compiled from: NotificationCompat */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    public final void b(t tVar) {
        Bitmap bitmap;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle c10 = a.c(a.b(tVar.f10996b), (CharSequence) null);
        IconCompat iconCompat = this.f10966b;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.a(c10, IconCompat.a.f(iconCompat, tVar.f10995a));
            } else {
                int i11 = iconCompat.f2120a;
                if (i11 == -1) {
                    i11 = IconCompat.a.c(iconCompat.f2121b);
                }
                if (i11 == 1) {
                    IconCompat iconCompat2 = this.f10966b;
                    int i12 = iconCompat2.f2120a;
                    if (i12 == -1) {
                        Object obj = iconCompat2.f2121b;
                        if (obj instanceof Bitmap) {
                            bitmap = (Bitmap) obj;
                        } else {
                            bitmap = null;
                        }
                    } else if (i12 == 1) {
                        bitmap = (Bitmap) iconCompat2.f2121b;
                    } else if (i12 == 5) {
                        bitmap = IconCompat.a((Bitmap) iconCompat2.f2121b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    c10 = a.a(c10, bitmap);
                }
            }
        }
        if (this.f10968d) {
            IconCompat iconCompat3 = this.f10967c;
            if (iconCompat3 == null) {
                a.d(c10, (Bitmap) null);
            } else {
                b.a(c10, IconCompat.a.f(iconCompat3, tVar.f10995a));
            }
        }
        if (i10 >= 31) {
            c.c(c10, false);
            c.b(c10, (CharSequence) null);
        }
    }

    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
