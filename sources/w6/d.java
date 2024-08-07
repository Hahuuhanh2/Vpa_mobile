package w6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.g;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u6.a;
import y6.k;
import y6.w;
import z6.c;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class d implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f16565p = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f16566q = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: r  reason: collision with root package name */
    public static final Object f16567r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static d f16568s;

    /* renamed from: a  reason: collision with root package name */
    public long f16569a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16570b = false;

    /* renamed from: c  reason: collision with root package name */
    public TelemetryData f16571c;

    /* renamed from: d  reason: collision with root package name */
    public c f16572d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f16573e;

    /* renamed from: f  reason: collision with root package name */
    public final a f16574f;

    /* renamed from: g  reason: collision with root package name */
    public final w f16575g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f16576h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f16577i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f16578j;

    /* renamed from: k  reason: collision with root package name */
    public t f16579k;

    /* renamed from: l  reason: collision with root package name */
    public final v0.d f16580l;

    /* renamed from: m  reason: collision with root package name */
    public final v0.d f16581m;

    /* renamed from: n  reason: collision with root package name */
    public final zau f16582n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f16583o;

    public d(Context context, Looper looper) {
        a aVar = a.f15288d;
        boolean z10 = true;
        this.f16576h = new AtomicInteger(1);
        this.f16577i = new AtomicInteger(0);
        this.f16578j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f16579k = null;
        this.f16580l = new v0.d();
        this.f16581m = new v0.d();
        this.f16583o = true;
        this.f16573e = context;
        zau zau = new zau(looper, this);
        this.f16582n = zau;
        this.f16574f = aVar;
        this.f16575g = new w();
        PackageManager packageManager = context.getPackageManager();
        if (h7.d.f10613d == null) {
            h7.d.f10613d = Boolean.valueOf((!g.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z10);
        }
        if (h7.d.f10613d.booleanValue()) {
            this.f16583o = false;
        }
        zau.sendMessage(zau.obtainMessage(6));
    }

    public static Status d(a aVar, ConnectionResult connectionResult) {
        String str = aVar.f16536b.f5352c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(17, "API: " + str + " is not available on this device. Connection failed with: " + valueOf, connectionResult.f5322c, connectionResult);
    }

    public static d g(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f16567r) {
            try {
                if (f16568s == null) {
                    synchronized (y6.d.f17548a) {
                        handlerThread = y6.d.f17550c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            y6.d.f17550c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = y6.d.f17550c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = a.f15287c;
                    f16568s = new d(applicationContext, looper);
                }
                dVar = f16568s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public final void a(t tVar) {
        synchronized (f16567r) {
            if (this.f16579k != tVar) {
                this.f16579k = tVar;
                this.f16580l.clear();
            }
            this.f16580l.addAll(tVar.f16656e);
        }
    }

    public final boolean b() {
        if (this.f16570b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = k.a().f17567a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f5415b) {
            return false;
        }
        int i10 = this.f16575g.f17602a.get(203400000, -1);
        if (i10 == -1 || i10 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(com.google.android.gms.common.ConnectionResult r9, int r10) {
        /*
            r8 = this;
            u6.a r0 = r8.f16574f
            android.content.Context r1 = r8.f16573e
            r0.getClass()
            java.lang.Class<j7.a> r2 = j7.a.class
            monitor-enter(r2)
            android.content.Context r3 = r1.getApplicationContext()     // Catch:{ all -> 0x00a1 }
            android.content.Context r4 = j7.a.f11700a     // Catch:{ all -> 0x00a1 }
            r5 = 0
            if (r4 == 0) goto L_0x0020
            java.lang.Boolean r6 = j7.a.f11701b     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x0020
            if (r4 == r3) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            boolean r3 = r6.booleanValue()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)
            goto L_0x0052
        L_0x0020:
            j7.a.f11701b = r5     // Catch:{ all -> 0x00a1 }
            boolean r4 = h7.g.a()     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0037
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ all -> 0x00a1 }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x00a1 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x00a1 }
            j7.a.f11701b = r4     // Catch:{ all -> 0x00a1 }
            goto L_0x0049
        L_0x0037:
            java.lang.ClassLoader r4 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0045 }
            java.lang.String r6 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0045 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0045 }
            j7.a.f11701b = r4     // Catch:{ ClassNotFoundException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a1 }
            j7.a.f11701b = r4     // Catch:{ all -> 0x00a1 }
        L_0x0049:
            j7.a.f11700a = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Boolean r3 = j7.a.f11701b     // Catch:{ all -> 0x00a1 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)
        L_0x0052:
            r2 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0057
            goto L_0x009f
        L_0x0057:
            int r3 = r9.f5321b
            if (r3 == 0) goto L_0x0061
            android.app.PendingIntent r6 = r9.f5322c
            if (r6 == 0) goto L_0x0061
            r6 = r2
            goto L_0x0062
        L_0x0061:
            r6 = r4
        L_0x0062:
            r7 = 134217728(0x8000000, float:3.85186E-34)
            if (r6 == 0) goto L_0x0069
            android.app.PendingIntent r3 = r9.f5322c
            goto L_0x0078
        L_0x0069:
            android.content.Intent r3 = r0.a(r3, r1, r5)
            if (r3 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            int r5 = com.google.android.gms.internal.common.zzd.zza
            r5 = r5 | r7
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r1, r4, r3, r5)
        L_0x0077:
            r3 = r5
        L_0x0078:
            if (r3 == 0) goto L_0x009f
            int r9 = r9.f5321b
            int r5 = com.google.android.gms.common.api.GoogleApiActivity.f5336b
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r6 = com.google.android.gms.common.api.GoogleApiActivity.class
            r5.<init>(r1, r6)
            java.lang.String r6 = "pending_intent"
            r5.putExtra(r6, r3)
            java.lang.String r3 = "failing_client_id"
            r5.putExtra(r3, r10)
            java.lang.String r10 = "notify_manager"
            r5.putExtra(r10, r2)
            int r10 = com.google.android.gms.internal.base.zap.zaa
            r10 = r10 | r7
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r1, r4, r5, r10)
            r0.h(r1, r9, r10)
            goto L_0x00a0
        L_0x009f:
            r2 = r4
        L_0x00a0:
            return r2
        L_0x00a1:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.d.c(com.google.android.gms.common.ConnectionResult, int):boolean");
    }

    public final b0 e(b bVar) {
        a apiKey = bVar.getApiKey();
        b0 b0Var = (b0) this.f16578j.get(apiKey);
        if (b0Var == null) {
            b0Var = new b0(this, bVar);
            this.f16578j.put(apiKey, b0Var);
        }
        if (b0Var.f16547b.requiresSignIn()) {
            this.f16581m.add(apiKey);
        }
        b0Var.n();
        return b0Var;
    }

    public final void f(TaskCompletionSource taskCompletionSource, int i10, b bVar) {
        long j10;
        long j11;
        if (i10 != 0) {
            a apiKey = bVar.getApiKey();
            j0 j0Var = null;
            if (b()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = k.a().f17567a;
                boolean z10 = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.f5415b) {
                        boolean z11 = rootTelemetryConfiguration.f5416c;
                        b0 b0Var = (b0) this.f16578j.get(apiKey);
                        if (b0Var != null) {
                            a.f fVar = b0Var.f16547b;
                            if (fVar instanceof y6.a) {
                                y6.a aVar = (y6.a) fVar;
                                if (aVar.hasConnectionInfo() && !aVar.isConnecting()) {
                                    ConnectionTelemetryConfiguration a10 = j0.a(b0Var, aVar, i10);
                                    if (a10 != null) {
                                        b0Var.f16557o++;
                                        z10 = a10.f5385c;
                                    }
                                }
                            }
                        }
                        z10 = z11;
                    }
                }
                if (z10) {
                    j10 = System.currentTimeMillis();
                } else {
                    j10 = 0;
                }
                if (z10) {
                    j11 = SystemClock.elapsedRealtime();
                } else {
                    j11 = 0;
                }
                j0Var = new j0(this, i10, apiKey, j10, j11);
            }
            if (j0Var != null) {
                Task task = taskCompletionSource.getTask();
                zau zau = this.f16582n;
                zau.getClass();
                task.addOnCompleteListener((Executor) new w(zau), j0Var);
            }
        }
    }

    public final Task h(b bVar, k kVar, p pVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        kVar.getClass();
        f(taskCompletionSource, 0, bVar);
        b1 b1Var = new b1(new n0(kVar, pVar, runnable), taskCompletionSource);
        zau zau = this.f16582n;
        zau.sendMessage(zau.obtainMessage(8, new m0(b1Var, this.f16577i.get(), bVar)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            r2 = 0
            r3 = 300000(0x493e0, double:1.482197E-318)
            r5 = 17
            r6 = 0
            switch(r0) {
                case 1: goto L_0x03d2;
                case 2: goto L_0x03ca;
                case 3: goto L_0x03a7;
                case 4: goto L_0x036a;
                case 5: goto L_0x02eb;
                case 6: goto L_0x029d;
                case 7: goto L_0x0294;
                case 8: goto L_0x036a;
                case 9: goto L_0x0270;
                case 10: goto L_0x0246;
                case 11: goto L_0x01f7;
                case 12: goto L_0x01de;
                case 13: goto L_0x036a;
                case 14: goto L_0x01b0;
                case 15: goto L_0x0178;
                case 16: goto L_0x00e4;
                case 17: goto L_0x00be;
                case 18: goto L_0x0012;
                case 19: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r6
        L_0x000e:
            r10.f16570b = r6
            goto L_0x040a
        L_0x0012:
            java.lang.Object r11 = r11.obj
            w6.k0 r11 = (w6.k0) r11
            long r3 = r11.f16620c
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            int r2 = r11.f16619b
            com.google.android.gms.common.internal.MethodInvocation[] r3 = new com.google.android.gms.common.internal.MethodInvocation[r1]
            com.google.android.gms.common.internal.MethodInvocation r11 = r11.f16618a
            r3[r6] = r11
            java.util.List r11 = java.util.Arrays.asList(r3)
            r0.<init>(r2, r11)
            z6.c r11 = r10.f16572d
            if (r11 != 0) goto L_0x003e
            android.content.Context r11 = r10.f16573e
            y6.m r2 = y6.m.f17572b
            z6.c r3 = new z6.c
            r3.<init>(r11, r2)
            r10.f16572d = r3
        L_0x003e:
            z6.c r11 = r10.f16572d
            r11.a(r0)
            goto L_0x040a
        L_0x0045:
            com.google.android.gms.common.internal.TelemetryData r0 = r10.f16571c
            if (r0 == 0) goto L_0x009a
            java.util.List r3 = r0.f5420b
            int r0 = r0.f5419a
            int r4 = r11.f16619b
            if (r0 != r4) goto L_0x0071
            if (r3 == 0) goto L_0x005c
            int r0 = r3.size()
            int r3 = r11.f16621d
            if (r0 < r3) goto L_0x005c
            goto L_0x0071
        L_0x005c:
            com.google.android.gms.common.internal.TelemetryData r0 = r10.f16571c
            com.google.android.gms.common.internal.MethodInvocation r2 = r11.f16618a
            java.util.List r3 = r0.f5420b
            if (r3 != 0) goto L_0x006b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f5420b = r3
        L_0x006b:
            java.util.List r0 = r0.f5420b
            r0.add(r2)
            goto L_0x009a
        L_0x0071:
            com.google.android.gms.internal.base.zau r0 = r10.f16582n
            r0.removeMessages(r5)
            com.google.android.gms.common.internal.TelemetryData r0 = r10.f16571c
            if (r0 == 0) goto L_0x009a
            int r3 = r0.f5419a
            if (r3 > 0) goto L_0x0084
            boolean r3 = r10.b()
            if (r3 == 0) goto L_0x0098
        L_0x0084:
            z6.c r3 = r10.f16572d
            if (r3 != 0) goto L_0x0093
            android.content.Context r3 = r10.f16573e
            y6.m r4 = y6.m.f17572b
            z6.c r6 = new z6.c
            r6.<init>(r3, r4)
            r10.f16572d = r6
        L_0x0093:
            z6.c r3 = r10.f16572d
            r3.a(r0)
        L_0x0098:
            r10.f16571c = r2
        L_0x009a:
            com.google.android.gms.common.internal.TelemetryData r0 = r10.f16571c
            if (r0 != 0) goto L_0x040a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation r2 = r11.f16618a
            r0.add(r2)
            com.google.android.gms.common.internal.TelemetryData r2 = new com.google.android.gms.common.internal.TelemetryData
            int r3 = r11.f16619b
            r2.<init>(r3, r0)
            r10.f16571c = r2
            com.google.android.gms.internal.base.zau r0 = r10.f16582n
            android.os.Message r2 = r0.obtainMessage(r5)
            long r3 = r11.f16620c
            r0.sendMessageDelayed(r2, r3)
            goto L_0x040a
        L_0x00be:
            com.google.android.gms.common.internal.TelemetryData r11 = r10.f16571c
            if (r11 == 0) goto L_0x040a
            int r0 = r11.f5419a
            if (r0 > 0) goto L_0x00cc
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x00e0
        L_0x00cc:
            z6.c r0 = r10.f16572d
            if (r0 != 0) goto L_0x00db
            android.content.Context r0 = r10.f16573e
            y6.m r3 = y6.m.f17572b
            z6.c r4 = new z6.c
            r4.<init>(r0, r3)
            r10.f16572d = r4
        L_0x00db:
            z6.c r0 = r10.f16572d
            r0.a(r11)
        L_0x00e0:
            r10.f16571c = r2
            goto L_0x040a
        L_0x00e4:
            java.lang.Object r11 = r11.obj
            w6.c0 r11 = (w6.c0) r11
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            w6.a r2 = r11.f16560a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x040a
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            w6.a r2 = r11.f16560a
            java.lang.Object r0 = r0.get(r2)
            w6.b0 r0 = (w6.b0) r0
            java.util.ArrayList r2 = r0.f16555m
            boolean r2 = r2.remove(r11)
            if (r2 == 0) goto L_0x040a
            w6.d r2 = r0.f16558p
            com.google.android.gms.internal.base.zau r2 = r2.f16582n
            r3 = 15
            r2.removeMessages(r3, r11)
            w6.d r2 = r0.f16558p
            com.google.android.gms.internal.base.zau r2 = r2.f16582n
            r3 = 16
            r2.removeMessages(r3, r11)
            com.google.android.gms.common.Feature r11 = r11.f16561b
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.LinkedList r3 = r0.f16546a
            int r3 = r3.size()
            r2.<init>(r3)
            java.util.LinkedList r3 = r0.f16546a
            java.util.Iterator r3 = r3.iterator()
        L_0x0129:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x015c
            java.lang.Object r4 = r3.next()
            w6.e1 r4 = (w6.e1) r4
            boolean r5 = r4 instanceof w6.h0
            if (r5 == 0) goto L_0x0129
            r5 = r4
            w6.h0 r5 = (w6.h0) r5
            com.google.android.gms.common.Feature[] r5 = r5.g(r0)
            if (r5 == 0) goto L_0x0129
            int r7 = r5.length
            r8 = r6
        L_0x0144:
            if (r8 >= r7) goto L_0x0155
            r9 = r5[r8]
            boolean r9 = y6.i.a(r9, r11)
            if (r9 == 0) goto L_0x0152
            if (r8 < 0) goto L_0x0155
            r5 = r1
            goto L_0x0156
        L_0x0152:
            int r8 = r8 + 1
            goto L_0x0144
        L_0x0155:
            r5 = r6
        L_0x0156:
            if (r5 == 0) goto L_0x0129
            r2.add(r4)
            goto L_0x0129
        L_0x015c:
            int r3 = r2.size()
        L_0x0160:
            if (r6 >= r3) goto L_0x040a
            java.lang.Object r4 = r2.get(r6)
            w6.e1 r4 = (w6.e1) r4
            java.util.LinkedList r5 = r0.f16546a
            r5.remove(r4)
            com.google.android.gms.common.api.UnsupportedApiCallException r5 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r5.<init>(r11)
            r4.b(r5)
            int r6 = r6 + 1
            goto L_0x0160
        L_0x0178:
            java.lang.Object r11 = r11.obj
            w6.c0 r11 = (w6.c0) r11
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            w6.a r2 = r11.f16560a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x040a
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            w6.a r2 = r11.f16560a
            java.lang.Object r0 = r0.get(r2)
            w6.b0 r0 = (w6.b0) r0
            java.util.ArrayList r2 = r0.f16555m
            boolean r11 = r2.contains(r11)
            if (r11 != 0) goto L_0x019a
            goto L_0x040a
        L_0x019a:
            boolean r11 = r0.f16554l
            if (r11 != 0) goto L_0x040a
            com.google.android.gms.common.api.a$f r11 = r0.f16547b
            boolean r11 = r11.isConnected()
            if (r11 != 0) goto L_0x01ab
            r0.n()
            goto L_0x040a
        L_0x01ab:
            r0.e()
            goto L_0x040a
        L_0x01b0:
            java.lang.Object r11 = r11.obj
            w6.u r11 = (w6.u) r11
            w6.a r0 = r11.f16658a
            j$.util.concurrent.ConcurrentHashMap r2 = r10.f16578j
            boolean r2 = r2.containsKey(r0)
            if (r2 != 0) goto L_0x01c7
            com.google.android.gms.tasks.TaskCompletionSource r11 = r11.f16659b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setResult(r0)
            goto L_0x040a
        L_0x01c7:
            j$.util.concurrent.ConcurrentHashMap r2 = r10.f16578j
            java.lang.Object r0 = r2.get(r0)
            w6.b0 r0 = (w6.b0) r0
            boolean r0 = r0.l(r6)
            com.google.android.gms.tasks.TaskCompletionSource r11 = r11.f16659b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.setResult(r0)
            goto L_0x040a
        L_0x01de:
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r2 = r11.obj
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x040a
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            w6.b0 r11 = (w6.b0) r11
            r11.l(r1)
            goto L_0x040a
        L_0x01f7:
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r3 = r11.obj
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x040a
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            w6.b0 r11 = (w6.b0) r11
            w6.d r0 = r11.f16558p
            com.google.android.gms.internal.base.zau r0 = r0.f16582n
            y6.j.b(r0)
            boolean r0 = r11.f16554l
            if (r0 == 0) goto L_0x040a
            r11.i()
            w6.d r0 = r11.f16558p
            u6.a r3 = r0.f16574f
            android.content.Context r0 = r0.f16573e
            int r0 = r3.b(r0)
            r3 = 18
            if (r0 != r3) goto L_0x0231
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r3 = 21
            java.lang.String r4 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r3, r4, r2, r2)
            goto L_0x023a
        L_0x0231:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r3 = 22
            java.lang.String r4 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r3, r4, r2, r2)
        L_0x023a:
            r11.c(r0)
            com.google.android.gms.common.api.a$f r11 = r11.f16547b
            java.lang.String r0 = "Timing out connection while resuming."
            r11.disconnect(r0)
            goto L_0x040a
        L_0x0246:
            v0.d r11 = r10.f16581m
            java.util.Iterator r11 = r11.iterator()
        L_0x024c:
            r0 = r11
            v0.g$a r0 = (v0.g.a) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0269
            java.lang.Object r0 = r0.next()
            w6.a r0 = (w6.a) r0
            j$.util.concurrent.ConcurrentHashMap r2 = r10.f16578j
            java.lang.Object r0 = r2.remove(r0)
            w6.b0 r0 = (w6.b0) r0
            if (r0 == 0) goto L_0x024c
            r0.s()
            goto L_0x024c
        L_0x0269:
            v0.d r11 = r10.f16581m
            r11.clear()
            goto L_0x040a
        L_0x0270:
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r2 = r11.obj
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x040a
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            java.lang.Object r11 = r11.obj
            java.lang.Object r11 = r0.get(r11)
            w6.b0 r11 = (w6.b0) r11
            w6.d r0 = r11.f16558p
            com.google.android.gms.internal.base.zau r0 = r0.f16582n
            y6.j.b(r0)
            boolean r0 = r11.f16554l
            if (r0 == 0) goto L_0x040a
            r11.n()
            goto L_0x040a
        L_0x0294:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.common.api.b r11 = (com.google.android.gms.common.api.b) r11
            r10.e(r11)
            goto L_0x040a
        L_0x029d:
            android.content.Context r11 = r10.f16573e
            android.content.Context r11 = r11.getApplicationContext()
            boolean r11 = r11 instanceof android.app.Application
            if (r11 == 0) goto L_0x040a
            android.content.Context r11 = r10.f16573e
            android.content.Context r11 = r11.getApplicationContext()
            android.app.Application r11 = (android.app.Application) r11
            w6.b.b(r11)
            w6.b r11 = w6.b.f16541e
            w6.x r0 = new w6.x
            r0.<init>(r10)
            r11.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f16543b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x02df
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.util.concurrent.atomic.AtomicBoolean r2 = r11.f16543b
            boolean r2 = r2.getAndSet(r1)
            if (r2 != 0) goto L_0x02df
            int r0 = r0.importance
            r2 = 100
            if (r0 <= r2) goto L_0x02df
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f16542a
            r0.set(r1)
        L_0x02df:
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.f16542a
            boolean r11 = r11.get()
            if (r11 != 0) goto L_0x040a
            r10.f16569a = r3
            goto L_0x040a
        L_0x02eb:
            int r0 = r11.arg1
            java.lang.Object r11 = r11.obj
            com.google.android.gms.common.ConnectionResult r11 = (com.google.android.gms.common.ConnectionResult) r11
            j$.util.concurrent.ConcurrentHashMap r3 = r10.f16578j
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x02fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x030c
            java.lang.Object r4 = r3.next()
            w6.b0 r4 = (w6.b0) r4
            int r6 = r4.f16552j
            if (r6 != r0) goto L_0x02fb
            goto L_0x030d
        L_0x030c:
            r4 = r2
        L_0x030d:
            if (r4 == 0) goto L_0x0352
            int r0 = r11.f5321b
            r3 = 13
            if (r0 != r3) goto L_0x0347
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            u6.a r3 = r10.f16574f
            int r6 = r11.f5321b
            r3.getClass()
            java.util.concurrent.atomic.AtomicBoolean r3 = u6.d.f15292a
            java.lang.String r3 = com.google.android.gms.common.ConnectionResult.P0(r6)
            java.lang.String r11 = r11.f5323d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error resolution was canceled by the user, original error message: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ": "
            r6.append(r3)
            r6.append(r11)
            java.lang.String r11 = r6.toString()
            r0.<init>(r5, r11, r2, r2)
            r4.c(r0)
            goto L_0x040a
        L_0x0347:
            w6.a r0 = r4.f16548c
            com.google.android.gms.common.api.Status r11 = d(r0, r11)
            r4.c(r11)
            goto L_0x040a
        L_0x0352:
            java.lang.String r11 = "Could not find API instance "
            java.lang.String r2 = " while trying to fail enqueued calls."
            java.lang.StringBuilder r11 = n0.l.l(r11, r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = "GoogleApiManager"
            android.util.Log.wtf(r2, r11, r0)
            goto L_0x040a
        L_0x036a:
            java.lang.Object r11 = r11.obj
            w6.m0 r11 = (w6.m0) r11
            j$.util.concurrent.ConcurrentHashMap r0 = r10.f16578j
            com.google.android.gms.common.api.b r2 = r11.f16628c
            w6.a r2 = r2.getApiKey()
            java.lang.Object r0 = r0.get(r2)
            w6.b0 r0 = (w6.b0) r0
            if (r0 != 0) goto L_0x0384
            com.google.android.gms.common.api.b r0 = r11.f16628c
            w6.b0 r0 = r10.e(r0)
        L_0x0384:
            com.google.android.gms.common.api.a$f r2 = r0.f16547b
            boolean r2 = r2.requiresSignIn()
            if (r2 == 0) goto L_0x03a1
            java.util.concurrent.atomic.AtomicInteger r2 = r10.f16577i
            int r2 = r2.get()
            int r3 = r11.f16627b
            if (r2 == r3) goto L_0x03a1
            w6.e1 r11 = r11.f16626a
            com.google.android.gms.common.api.Status r2 = f16565p
            r11.a(r2)
            r0.s()
            goto L_0x040a
        L_0x03a1:
            w6.e1 r11 = r11.f16626a
            r0.p(r11)
            goto L_0x040a
        L_0x03a7:
            j$.util.concurrent.ConcurrentHashMap r11 = r10.f16578j
            java.util.Collection r11 = r11.values()
            java.util.Iterator r11 = r11.iterator()
        L_0x03b1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x040a
            java.lang.Object r0 = r11.next()
            w6.b0 r0 = (w6.b0) r0
            w6.d r3 = r0.f16558p
            com.google.android.gms.internal.base.zau r3 = r3.f16582n
            y6.j.b(r3)
            r0.f16556n = r2
            r0.n()
            goto L_0x03b1
        L_0x03ca:
            java.lang.Object r11 = r11.obj
            w6.f1 r11 = (w6.f1) r11
            r11.getClass()
            throw r2
        L_0x03d2:
            java.lang.Object r11 = r11.obj
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r1 == r11) goto L_0x03dd
            goto L_0x03df
        L_0x03dd:
            r3 = 10000(0x2710, double:4.9407E-320)
        L_0x03df:
            r10.f16569a = r3
            com.google.android.gms.internal.base.zau r11 = r10.f16582n
            r0 = 12
            r11.removeMessages(r0)
            j$.util.concurrent.ConcurrentHashMap r11 = r10.f16578j
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x03f2:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x040a
            java.lang.Object r2 = r11.next()
            w6.a r2 = (w6.a) r2
            com.google.android.gms.internal.base.zau r3 = r10.f16582n
            android.os.Message r2 = r3.obtainMessage(r0, r2)
            long r4 = r10.f16569a
            r3.sendMessageDelayed(r2, r4)
            goto L_0x03f2
        L_0x040a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.d.handleMessage(android.os.Message):boolean");
    }

    public final void i(ConnectionResult connectionResult, int i10) {
        if (!c(connectionResult, i10)) {
            zau zau = this.f16582n;
            zau.sendMessage(zau.obtainMessage(5, i10, 0, connectionResult));
        }
    }
}
