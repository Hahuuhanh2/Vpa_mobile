package s8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class d implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14665a;

    public /* synthetic */ d(e eVar) {
        this.f14665a = eVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14665a.f14670b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f14665a.a().post(new b(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14665a.f14670b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f14665a.a().post(new c(this, 0));
    }
}
