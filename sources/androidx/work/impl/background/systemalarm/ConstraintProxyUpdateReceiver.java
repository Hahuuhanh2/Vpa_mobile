package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o3.j;
import p3.j0;
import y3.m;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3772a = 0;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f3773a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f3774b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3775c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3773a = intent;
            this.f3774b = context;
            this.f3775c = pendingResult;
        }

        public final void run() {
            try {
                boolean booleanExtra = this.f3773a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3773a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3773a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3773a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j a10 = j.a();
                int i10 = ConstraintProxyUpdateReceiver.f3772a;
                a10.getClass();
                m.a(this.f3774b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                m.a(this.f3774b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                m.a(this.f3774b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                m.a(this.f3774b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3775c.finish();
            }
        }
    }

    static {
        j.b("ConstrntProxyUpdtRecvr");
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            j.a().getClass();
            return;
        }
        j0.b(context).f13940d.d(new a(intent, context, goAsync()));
    }
}
