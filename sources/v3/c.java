package v3;

import a4.b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import sk.j;

/* compiled from: BatteryNotLowTracker.kt */
public final class c extends BroadcastReceiverConstraintTracker {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f16016g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, b bVar, int i10) {
        super(context, bVar);
        this.f16016g = i10;
        if (i10 != 1) {
            j.f(bVar, "taskExecutor");
            return;
        }
        j.f(bVar, "taskExecutor");
        super(context, bVar);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f16016g) {
            case 0:
                return g();
            default:
                return g();
        }
    }

    public final IntentFilter e() {
        switch (this.f16016g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter2;
        }
    }

    public final void f(Intent intent) {
        switch (this.f16016g) {
            case 0:
                j.f(intent, "intent");
                if (intent.getAction() != null) {
                    o3.j a10 = o3.j.a();
                    int i10 = d.f16017a;
                    intent.getAction();
                    a10.getClass();
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                                b(Boolean.FALSE);
                                return;
                            }
                            return;
                        } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                            b(Boolean.TRUE);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                j.f(intent, "intent");
                if (intent.getAction() != null) {
                    o3.j a11 = o3.j.a();
                    int i11 = k.f16030a;
                    intent.getAction();
                    a11.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode2 = action2.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action2.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                b(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else if (action2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            b(Boolean.FALSE);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean g() {
        /*
            r7 = this;
            int r0 = r7.f16016g
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0049
        L_0x0009:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r4)
            android.content.Context r4 = r7.f16020b
            android.content.Intent r0 = r4.registerReceiver(r3, r0)
            if (r0 != 0) goto L_0x0024
            o3.j r0 = o3.j.a()
            int r1 = v3.d.f16017a
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0048
        L_0x0024:
            r3 = -1
            java.lang.String r4 = "status"
            int r4 = r0.getIntExtra(r4, r3)
            java.lang.String r5 = "level"
            int r5 = r0.getIntExtra(r5, r3)
            java.lang.String r6 = "scale"
            int r0 = r0.getIntExtra(r6, r3)
            float r3 = (float) r5
            float r0 = (float) r0
            float r3 = r3 / r0
            if (r4 == r2) goto L_0x0043
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x0048:
            return r0
        L_0x0049:
            android.content.Context r0 = r7.f16020b
            android.content.IntentFilter r4 = r7.e()
            android.content.Intent r0 = r0.registerReceiver(r3, r4)
            if (r0 == 0) goto L_0x0080
            java.lang.String r3 = r0.getAction()
            if (r3 != 0) goto L_0x005c
            goto L_0x0080
        L_0x005c:
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L_0x0081
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L_0x007a
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L_0x0071
            goto L_0x0081
        L_0x0071:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0080
            goto L_0x0081
        L_0x007a:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.equals(r2)
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.c.g():java.lang.Boolean");
    }
}
