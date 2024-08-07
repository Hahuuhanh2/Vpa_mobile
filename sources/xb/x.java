package xb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import sk.j;

/* compiled from: SessionInitiator.kt */
public final class x implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f17265a;

    public x(y yVar) {
        this.f17265a = yVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        j.f(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        y yVar = this.f17265a;
        yVar.f17271f = yVar.f17266a.g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r9 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e8, code lost:
        if (r4 != false) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResumed(android.app.Activity r14) {
        /*
            r13 = this;
            java.lang.String r0 = "activity"
            sk.j.f(r14, r0)
            xb.y r14 = r13.f17265a
            xb.z r0 = r14.f17266a
            long r0 = r0.g()
            long r2 = r14.f17271f
            int r4 = zk.a.f23785d
            r4 = 1
            long r5 = r2 >> r4
            long r5 = -r5
            int r2 = (int) r2
            r2 = r2 & r4
            long r5 = r5 << r4
            long r2 = (long) r2
            long r5 = r5 + r2
            int r2 = zk.b.f23787a
            boolean r2 = zk.a.j(r0)
            r7 = 0
            r3 = 0
            if (r2 == 0) goto L_0x003b
            boolean r2 = zk.a.j(r5)
            r2 = r2 ^ r4
            if (r2 != 0) goto L_0x00aa
            long r5 = r5 ^ r0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0033
            goto L_0x00aa
        L_0x0033:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Summing infinite durations of different signs yields an undefined result."
            r14.<init>(r0)
            throw r14
        L_0x003b:
            boolean r2 = zk.a.j(r5)
            if (r2 == 0) goto L_0x0044
            r0 = r5
            goto L_0x00aa
        L_0x0044:
            int r2 = (int) r0
            r2 = r2 & r4
            int r9 = (int) r5
            r9 = r9 & r4
            if (r2 != r9) goto L_0x0096
            long r0 = r0 >> r4
            long r5 = r5 >> r4
            long r0 = r0 + r5
            if (r2 != 0) goto L_0x0051
            r2 = r4
            goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r2 == 0) goto L_0x0075
            vk.k r2 = new vk.k
            r9 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r11 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r2.<init>(r9, r11)
            boolean r2 = r2.m(r0)
            if (r2 == 0) goto L_0x006e
        L_0x006c:
            long r0 = r0 << r4
            goto L_0x00aa
        L_0x006e:
            long r5 = (long) r5
            long r0 = r0 / r5
            long r0 = p3.l0.G(r0)
            goto L_0x00aa
        L_0x0075:
            vk.k r2 = new vk.k
            r9 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r11 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r2.<init>(r9, r11)
            boolean r2 = r2.m(r0)
            if (r2 == 0) goto L_0x008d
            long r5 = (long) r5
            long r0 = r0 * r5
            goto L_0x006c
        L_0x008d:
            long r0 = p3.l0.w(r0)
            long r0 = p3.l0.G(r0)
            goto L_0x00aa
        L_0x0096:
            if (r2 != r4) goto L_0x009a
            r2 = r4
            goto L_0x009b
        L_0x009a:
            r2 = r3
        L_0x009b:
            if (r2 == 0) goto L_0x00a4
            long r0 = r0 >> r4
            long r5 = r5 >> r4
            long r0 = zk.a.b(r0, r5)
            goto L_0x00aa
        L_0x00a4:
            long r5 = r5 >> r4
            long r0 = r0 >> r4
            long r0 = zk.a.b(r5, r0)
        L_0x00aa:
            zb.g r2 = r14.f17269d
            zb.j r5 = r2.f17935a
            zk.a r5 = r5.b()
            if (r5 == 0) goto L_0x00cc
            long r5 = r5.f23786a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00bc
            r9 = r4
            goto L_0x00bd
        L_0x00bc:
            r9 = r3
        L_0x00bd:
            if (r9 == 0) goto L_0x00c8
            boolean r9 = zk.a.j(r5)
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x00c8
            r9 = r4
            goto L_0x00c9
        L_0x00c8:
            r9 = r3
        L_0x00c9:
            if (r9 == 0) goto L_0x00cc
            goto L_0x00f3
        L_0x00cc:
            zb.j r2 = r2.f17936b
            zk.a r2 = r2.b()
            if (r2 == 0) goto L_0x00eb
            long r5 = r2.f23786a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00dc
            r2 = r4
            goto L_0x00dd
        L_0x00dc:
            r2 = r3
        L_0x00dd:
            if (r2 == 0) goto L_0x00e7
            boolean r2 = zk.a.j(r5)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r4 = r3
        L_0x00e8:
            if (r4 == 0) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            r2 = 30
            zk.c r3 = zk.c.MINUTES
            long r5 = p3.l0.R0(r2, r3)
        L_0x00f3:
            int r0 = zk.a.i(r0, r5)
            if (r0 <= 0) goto L_0x00fc
            r14.a()
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.x.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        j.f(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        j.f(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
    }
}
