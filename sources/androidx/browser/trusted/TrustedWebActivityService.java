package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import c.b;
import java.util.Locale;

public abstract class TrustedWebActivityService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public NotificationManager f1271a;

    /* renamed from: b  reason: collision with root package name */
    public int f1272b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final a f1273c = new a();

    public class a extends b {
        public a() {
        }

        public final void m() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1272b == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.c().a();
                TrustedWebActivityService.this.getPackageManager();
            }
            if (TrustedWebActivityService.this.f1272b != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.f1271a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract s.b c();

    public final int d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f1273c;
    }

    public final void onCreate() {
        super.onCreate();
        this.f1271a = (NotificationManager) getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.f1272b = -1;
        return super.onUnbind(intent);
    }
}
