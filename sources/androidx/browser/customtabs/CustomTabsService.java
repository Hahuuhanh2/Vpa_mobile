package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import b.b;
import v0.h;

public abstract class CustomTabsService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final h<IBinder, IBinder.DeathRecipient> f1267a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public a f1268b = new a();

    public class a extends b {
        public a() {
        }

        public static PendingIntent m(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        public final boolean o(b.a aVar, PendingIntent pendingIntent) {
            try {
                r.a aVar2 = new r.a(this, new r.b(aVar, pendingIntent));
                synchronized (CustomTabsService.this.f1267a) {
                    aVar.asBinder().linkToDeath(aVar2, 0);
                    CustomTabsService.this.f1267a.put(aVar.asBinder(), aVar2);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public final IBinder onBind(Intent intent) {
        return this.f1268b;
    }
}
