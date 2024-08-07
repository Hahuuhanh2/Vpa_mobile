package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import s8.a0;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f7312a = new a0("IntegrityDialogWrapper");

    /* renamed from: b  reason: collision with root package name */
    private final String f7313b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7314c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7315d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f7316e;

    public y(String str, long j10) {
        this.f7313b = str;
        this.f7314c = j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = r7.f7312a;
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r9)};
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (android.util.Log.isLoggable("PlayCore", 3) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        s8.a0.c(r0.f14658a, "checkAndShowDialog(%s)", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = new android.os.Bundle();
        r0.putInt("dialog.intent.type", r9);
        r0.putString("package.name", r7.f7313b);
        r0.putInt("playcore.integrity.version.major", 1);
        r0.putInt("playcore.integrity.version.minor", 3);
        r0.putInt("playcore.integrity.version.patch", 0);
        r0.putLong("request.token.sid", r7.f7314c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        return b(r8, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task a(android.app.Activity r8, int r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7315d
            monitor-enter(r0)
            boolean r1 = r7.f7316e     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005f }
            com.google.android.gms.tasks.Task r8 = com.google.android.gms.tasks.Tasks.forResult(r8)     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r8
        L_0x0012:
            r1 = 1
            r7.f7316e = r1     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            s8.a0 r0 = r7.f7312a
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r2] = r4
            java.lang.String r4 = "checkAndShowDialog(%s)"
            r0.getClass()
            java.lang.String r5 = "PlayCore"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)
            if (r5 == 0) goto L_0x0033
            java.lang.String r0 = r0.f14658a
            s8.a0.c(r0, r4, r3)
        L_0x0033:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "dialog.intent.type"
            r0.putInt(r3, r9)
            java.lang.String r9 = r7.f7313b
            java.lang.String r3 = "package.name"
            r0.putString(r3, r9)
            java.lang.String r9 = "playcore.integrity.version.major"
            r0.putInt(r9, r1)
            java.lang.String r9 = "playcore.integrity.version.minor"
            r0.putInt(r9, r6)
            java.lang.String r9 = "playcore.integrity.version.patch"
            r0.putInt(r9, r2)
            long r1 = r7.f7314c
            java.lang.String r9 = "request.token.sid"
            r0.putLong(r9, r1)
            com.google.android.gms.tasks.Task r8 = r7.b(r8, r0)
            return r8
        L_0x005f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.y.a(android.app.Activity, int):com.google.android.gms.tasks.Task");
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
