package i1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.R$dimen;
import androidx.core.graphics.drawable.IconCompat;
import i1.t;
import java.util.ArrayList;

/* compiled from: NotificationCompat */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public Context f10970a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<m> f10971b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<y> f10972c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<m> f10973d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f10974e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f10975f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f10976g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f10977h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f10978i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f10979j;

    /* renamed from: k  reason: collision with root package name */
    public int f10980k;

    /* renamed from: l  reason: collision with root package name */
    public int f10981l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10982m = true;

    /* renamed from: n  reason: collision with root package name */
    public s f10983n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f10984o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10985p = false;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f10986q;

    /* renamed from: r  reason: collision with root package name */
    public int f10987r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f10988s = 0;

    /* renamed from: t  reason: collision with root package name */
    public RemoteViews f10989t;

    /* renamed from: u  reason: collision with root package name */
    public String f10990u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10991v;

    /* renamed from: w  reason: collision with root package name */
    public Notification f10992w;
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f10993x;

    /* compiled from: NotificationCompat */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
            return builder.setContentType(i10);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
            return builder.setLegacyStreamType(i10);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
            return builder.setUsage(i10);
        }
    }

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f10992w = notification;
        this.f10970a = context;
        this.f10990u = str;
        notification.when = System.currentTimeMillis();
        this.f10992w.audioStreamType = -1;
        this.f10981l = 0;
        this.f10993x = new ArrayList<>();
        this.f10991v = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        RemoteViews f10;
        t tVar = new t(this);
        s sVar = tVar.f10997c.f10983n;
        if (sVar != null) {
            sVar.b(tVar);
        }
        if (sVar != null) {
            sVar.g();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            notification = t.a.a(tVar.f10996b);
        } else if (i10 >= 24) {
            notification = t.a.a(tVar.f10996b);
        } else {
            t.c.a(tVar.f10996b, tVar.f10999e);
            notification = t.a.a(tVar.f10996b);
            RemoteViews remoteViews = tVar.f10998d;
            if (remoteViews != null) {
                notification.bigContentView = remoteViews;
            }
        }
        tVar.f10997c.getClass();
        if (!(sVar == null || (f10 = sVar.f()) == null)) {
            notification.bigContentView = f10;
        }
        if (sVar != null) {
            tVar.f10997c.f10983n.h();
        }
        if (!(sVar == null || (bundle = notification.extras) == null)) {
            sVar.a(bundle);
        }
        return notification;
    }

    public final void c(int i10, boolean z10) {
        if (z10) {
            Notification notification = this.f10992w;
            notification.flags = i10 | notification.flags;
            return;
        }
        Notification notification2 = this.f10992w;
        notification2.flags = (~i10) & notification2.flags;
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            Context context = this.f10970a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f2119k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f2121b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f10978i = iconCompat;
    }

    public final void e(Uri uri) {
        Notification notification = this.f10992w;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
        this.f10992w.audioAttributes = a.a(e10);
    }

    public final void f(s sVar) {
        if (this.f10983n != sVar) {
            this.f10983n = sVar;
            if (sVar != null) {
                sVar.i(this);
            }
        }
    }
}
