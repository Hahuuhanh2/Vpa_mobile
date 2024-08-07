package v3;

import a4.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import sk.j;

/* compiled from: BatteryChargingTracker.kt */
public final class a extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar) {
        super(context, bVar);
        j.f(bVar, "taskExecutor");
    }

    public final Object a() {
        boolean z10;
        Intent registerReceiver = this.f16020b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            o3.j a10 = o3.j.a();
            int i10 = b.f16015a;
            a10.getClass();
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public final void f(Intent intent) {
        j.f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            o3.j a10 = o3.j.a();
            int i10 = b.f16015a;
            a10.getClass();
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        b(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        b(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        b(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        b(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
