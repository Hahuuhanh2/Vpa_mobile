package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import sk.j;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
public final class BroadcastReceiverConstraintTracker$broadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiverConstraintTracker<T> f3826a;

    public BroadcastReceiverConstraintTracker$broadcastReceiver$1(BroadcastReceiverConstraintTracker<T> broadcastReceiverConstraintTracker) {
        this.f3826a = broadcastReceiverConstraintTracker;
    }

    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        this.f3826a.f(intent);
    }
}
