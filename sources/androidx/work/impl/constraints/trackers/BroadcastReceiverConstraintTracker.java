package androidx.work.impl.constraints.trackers;

import a4.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import sk.j;
import v3.e;
import v3.f;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
public abstract class BroadcastReceiverConstraintTracker<T> extends f<T> {

    /* renamed from: f  reason: collision with root package name */
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f3825f = new BroadcastReceiverConstraintTracker$broadcastReceiver$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, b bVar) {
        super(context, bVar);
        j.f(bVar, "taskExecutor");
    }

    public final void c() {
        o3.j a10 = o3.j.a();
        int i10 = e.f16018a;
        a10.getClass();
        this.f16020b.registerReceiver(this.f3825f, e());
    }

    public final void d() {
        o3.j a10 = o3.j.a();
        int i10 = e.f16018a;
        a10.getClass();
        this.f16020b.unregisterReceiver(this.f3825f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
