package v3;

import a4.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import t3.c;

/* compiled from: NetworkStateTracker.kt */
public final class j extends BroadcastReceiverConstraintTracker<c> {

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f16029g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, b bVar) {
        super(context, bVar);
        sk.j.f(bVar, "taskExecutor");
        Object systemService = this.f16020b.getSystemService("connectivity");
        sk.j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f16029g = (ConnectivityManager) systemService;
    }

    public final Object a() {
        return i.a(this.f16029g);
    }

    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public final void f(Intent intent) {
        sk.j.f(intent, "intent");
        if (sk.j.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            o3.j a10 = o3.j.a();
            int i10 = i.f16028a;
            a10.getClass();
            b(i.a(this.f16029g));
        }
    }
}
