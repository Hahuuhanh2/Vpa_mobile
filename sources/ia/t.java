package ia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ja.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.b;
import na.c;
import p3.l0;
import vl.d;

/* compiled from: CrashlyticsController */
public final class t {

    /* renamed from: r  reason: collision with root package name */
    public static final i f11362r = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f11363a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f11364b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11365c;

    /* renamed from: d  reason: collision with root package name */
    public final h f11366d;

    /* renamed from: e  reason: collision with root package name */
    public final l f11367e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f11368f;

    /* renamed from: g  reason: collision with root package name */
    public final c f11369g;

    /* renamed from: h  reason: collision with root package name */
    public final a f11370h;

    /* renamed from: i  reason: collision with root package name */
    public final ja.c f11371i;

    /* renamed from: j  reason: collision with root package name */
    public final fa.a f11372j;

    /* renamed from: k  reason: collision with root package name */
    public final ga.a f11373k;

    /* renamed from: l  reason: collision with root package name */
    public final k f11374l;

    /* renamed from: m  reason: collision with root package name */
    public final m0 f11375m;

    /* renamed from: n  reason: collision with root package name */
    public f0 f11376n;

    /* renamed from: o  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f11377o = new TaskCompletionSource<>();

    /* renamed from: p  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f11378p = new TaskCompletionSource<>();

    /* renamed from: q  reason: collision with root package name */
    public final TaskCompletionSource<Void> f11379q = new TaskCompletionSource<>();

    /* compiled from: CrashlyticsController */
    public class a implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Task f11380a;

        public a(Task task) {
            this.f11380a = task;
        }

        public final Task then(Object obj) {
            Task<TContinuationResult> continueWithTask;
            l lVar = t.this.f11367e;
            s sVar = new s(this, (Boolean) obj);
            synchronized (lVar.f11334c) {
                continueWithTask = lVar.f11333b.continueWithTask(lVar.f11332a, new n(sVar));
                lVar.f11333b = continueWithTask.continueWith(lVar.f11332a, new b());
            }
            return continueWithTask;
        }
    }

    public t(Context context, l lVar, k0 k0Var, g0 g0Var, c cVar, d dVar, a aVar, h hVar, ja.c cVar2, m0 m0Var, fa.a aVar2, ga.a aVar3, k kVar) {
        new AtomicBoolean(false);
        this.f11363a = context;
        this.f11367e = lVar;
        this.f11368f = k0Var;
        this.f11364b = g0Var;
        this.f11369g = cVar;
        this.f11365c = dVar;
        this.f11370h = aVar;
        this.f11366d = hVar;
        this.f11371i = cVar2;
        this.f11372j = aVar2;
        this.f11373k = aVar3;
        this.f11374l = kVar;
        this.f11375m = m0Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:48|49|50|51|52|53|54|55|56|57|90) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0282 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(ia.t r31, java.lang.String r32) {
        /*
            r0 = r31
            r7 = r32
            r31.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r1 / r3
            java.lang.String r10 = "FirebaseCrashlytics"
            r1 = 3
            android.util.Log.isLoggable(r10, r1)
            java.util.Locale r11 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r12 = "18.4.3"
            r1[r2] = r12
            java.lang.String r2 = "Crashlytics Android SDK/%s"
            java.lang.String r3 = java.lang.String.format(r11, r2, r1)
            ia.k0 r1 = r0.f11368f
            ia.a r2 = r0.f11370h
            java.lang.String r14 = r1.f11328c
            java.lang.String r15 = r2.f11253f
            java.lang.String r4 = r2.f11254g
            ia.l0$a r1 = r1.b()
            ia.c r1 = (ia.c) r1
            java.lang.String r1 = r1.f11277a
            java.lang.String r5 = r2.f11251d
            if (r5 == 0) goto L_0x003d
            r5 = 4
            goto L_0x003e
        L_0x003d:
            r5 = 1
        L_0x003e:
            int r18 = f0.b0.l(r5)
            fa.d r2 = r2.f11255h
            ka.y r5 = new ka.y
            r13 = r5
            r16 = r4
            r17 = r1
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = android.os.Build.VERSION.RELEASE
            java.lang.String r14 = android.os.Build.VERSION.CODENAME
            boolean r1 = ia.h.h()
            ka.a0 r2 = new ka.a0
            r2.<init>(r13, r14, r1)
            android.content.Context r1 = r0.f11363a
            android.os.StatFs r4 = new android.os.StatFs
            java.io.File r6 = android.os.Environment.getDataDirectory()
            java.lang.String r6 = r6.getPath()
            r4.<init>(r6)
            int r6 = r4.getBlockCount()
            r16 = r14
            long r14 = (long) r6
            int r4 = r4.getBlockSize()
            r17 = r12
            r18 = r13
            long r12 = (long) r4
            long r25 = r14 * r12
            ia.h$a r4 = ia.h.a.UNKNOWN
            java.lang.String r12 = android.os.Build.CPU_ABI
            boolean r6 = android.text.TextUtils.isEmpty(r12)
            if (r6 == 0) goto L_0x008d
            r6 = 2
            android.util.Log.isLoggable(r10, r6)
            goto L_0x009d
        L_0x008d:
            java.lang.String r6 = r12.toLowerCase(r11)
            java.util.HashMap r13 = ia.h.a.f11307b
            java.lang.Object r6 = r13.get(r6)
            ia.h$a r6 = (ia.h.a) r6
            if (r6 != 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r4 = r6
        L_0x009d:
            int r20 = r4.ordinal()
            java.lang.String r13 = android.os.Build.MODEL
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            int r22 = r4.availableProcessors()
            long r23 = ia.h.a(r1)
            boolean r27 = ia.h.g()
            int r28 = ia.h.c()
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r15 = android.os.Build.PRODUCT
            ka.z r1 = new ka.z
            r19 = r1
            r21 = r13
            r29 = r14
            r30 = r15
            r19.<init>(r20, r21, r22, r23, r25, r27, r28, r29, r30)
            fa.a r4 = r0.f11372j
            ka.x r6 = new ka.x
            r6.<init>(r5, r2, r1)
            r1 = r4
            r2 = r32
            r4 = r8
            r1.d(r2, r3, r4, r6)
            ja.c r1 = r0.f11371i
            r1.a(r7)
            ia.k r1 = r0.f11374l
            ia.j r1 = r1.f11323b
            monitor-enter(r1)
            java.lang.String r2 = r1.f11320b     // Catch:{ all -> 0x0309 }
            boolean r2 = java.util.Objects.equals(r2, r7)     // Catch:{ all -> 0x0309 }
            if (r2 != 0) goto L_0x00f1
            na.c r2 = r1.f11319a     // Catch:{ all -> 0x0309 }
            java.lang.String r3 = r1.f11321c     // Catch:{ all -> 0x0309 }
            ia.j.a(r2, r7, r3)     // Catch:{ all -> 0x0309 }
            r1.f11320b = r7     // Catch:{ all -> 0x0309 }
        L_0x00f1:
            monitor-exit(r1)
            ia.m0 r0 = r0.f11375m
            ia.d0 r1 = r0.f11338a
            r1.getClass()
            java.nio.charset.Charset r2 = ka.b0.f12263a
            ka.b$a r2 = new ka.b$a
            r2.<init>()
            r3 = r17
            r2.f12252a = r3
            ia.a r3 = r1.f11284c
            java.lang.String r3 = r3.f11248a
            if (r3 == 0) goto L_0x0301
            r2.f12253b = r3
            ia.k0 r3 = r1.f11283b
            ia.l0$a r3 = r3.b()
            ia.c r3 = (ia.c) r3
            java.lang.String r3 = r3.f11277a
            if (r3 == 0) goto L_0x02f9
            r2.f12255d = r3
            ia.k0 r3 = r1.f11283b
            ia.l0$a r3 = r3.b()
            ia.c r3 = (ia.c) r3
            java.lang.String r3 = r3.f11278b
            r2.f12256e = r3
            ia.a r3 = r1.f11284c
            java.lang.String r4 = r3.f11253f
            if (r4 == 0) goto L_0x02f1
            r2.f12258g = r4
            java.lang.String r3 = r3.f11254g
            if (r3 == 0) goto L_0x02e9
            r2.f12259h = r3
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f12254c = r3
            ka.h$a r3 = new ka.h$a
            r3.<init>()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f12312f = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r3.f12310d = r4
            if (r7 == 0) goto L_0x02e1
            r3.f12308b = r7
            java.lang.String r4 = ia.d0.f11281g
            if (r4 == 0) goto L_0x02d9
            r3.f12307a = r4
            ia.k0 r4 = r1.f11283b
            java.lang.String r5 = r4.f11328c
            if (r5 == 0) goto L_0x02d1
            ia.a r6 = r1.f11284c
            java.lang.String r7 = r6.f11253f
            if (r7 == 0) goto L_0x02c9
            java.lang.String r6 = r6.f11254g
            ia.l0$a r4 = r4.b()
            ia.c r4 = (ia.c) r4
            java.lang.String r4 = r4.f11277a
            ia.a r8 = r1.f11284c
            fa.d r8 = r8.f11255h
            fa.d$a r9 = r8.f10076b
            if (r9 != 0) goto L_0x0179
            fa.d$a r9 = new fa.d$a
            r9.<init>(r8)
            r8.f10076b = r9
        L_0x0179:
            fa.d$a r8 = r8.f10076b
            java.lang.String r8 = r8.f10077a
            ia.a r9 = r1.f11284c
            fa.d r9 = r9.f11255h
            r17 = r10
            fa.d$a r10 = r9.f10076b
            if (r10 != 0) goto L_0x018e
            fa.d$a r10 = new fa.d$a
            r10.<init>(r9)
            r9.f10076b = r10
        L_0x018e:
            fa.d$a r9 = r9.f10076b
            java.lang.String r9 = r9.f10078b
            ka.i r10 = new ka.i
            r19 = r10
            r20 = r5
            r21 = r7
            r22 = r6
            r23 = r4
            r24 = r8
            r25 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r3.f12313g = r10
            ka.v$a r4 = new ka.v$a
            r4.<init>()
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.f12426a = r5
            r5 = r18
            r4.f12427b = r5
            r5 = r16
            r4.f12428c = r5
            boolean r5 = ia.h.h()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.f12429d = r5
            ka.v r4 = r4.a()
            r3.f12315i = r4
            android.os.StatFs r4 = new android.os.StatFs
            java.io.File r5 = android.os.Environment.getDataDirectory()
            java.lang.String r5 = r5.getPath()
            r4.<init>(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            r6 = 7
            if (r5 == 0) goto L_0x01e0
            goto L_0x01f3
        L_0x01e0:
            java.util.HashMap r5 = ia.d0.f11280f
            java.lang.String r7 = r12.toLowerCase(r11)
            java.lang.Object r5 = r5.get(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x01ef
            goto L_0x01f3
        L_0x01ef:
            int r6 = r5.intValue()
        L_0x01f3:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            android.content.Context r1 = r1.f11282a
            long r7 = ia.h.a(r1)
            int r1 = r4.getBlockCount()
            long r9 = (long) r1
            int r1 = r4.getBlockSize()
            long r11 = (long) r1
            long r9 = r9 * r11
            boolean r1 = ia.h.g()
            int r4 = ia.h.c()
            ka.k$a r11 = new ka.k$a
            r11.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.f12335a = r6
            r11.f12336b = r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.f12337c = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r11.f12338d = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r11.f12339e = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.f12340f = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r11.f12341g = r1
            r11.f12342h = r14
            r11.f12343i = r15
            ka.k r1 = r11.a()
            r3.f12316j = r1
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.f12318l = r1
            ka.h r1 = r3.a()
            r2.f12260i = r1
            ka.b r1 = r2.a()
            na.b r0 = r0.f11339b
            r0.getClass()
            ka.b0$e r2 = r1.f12249j
            if (r2 != 0) goto L_0x026a
            r0 = 3
            r3 = r17
            android.util.Log.isLoggable(r3, r0)
            goto L_0x02c8
        L_0x026a:
            r3 = r17
            java.lang.String r4 = r2.h()
            la.a r5 = na.b.f13544g     // Catch:{ IOException -> 0x02c4 }
            r5.getClass()     // Catch:{ IOException -> 0x02c4 }
            ua.d r5 = la.a.f12898a     // Catch:{ IOException -> 0x02c4 }
            r5.getClass()     // Catch:{ IOException -> 0x02c4 }
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ IOException -> 0x02c4 }
            r6.<init>()     // Catch:{ IOException -> 0x02c4 }
            r5.a(r1, r6)     // Catch:{ IOException -> 0x0282 }
        L_0x0282:
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x02c4 }
            na.c r5 = r0.f13548b     // Catch:{ IOException -> 0x02c4 }
            java.lang.String r6 = "report"
            java.io.File r5 = r5.b(r4, r6)     // Catch:{ IOException -> 0x02c4 }
            na.b.e(r5, r1)     // Catch:{ IOException -> 0x02c4 }
            na.c r0 = r0.f13548b     // Catch:{ IOException -> 0x02c4 }
            java.lang.String r1 = "start-time"
            java.io.File r0 = r0.b(r4, r1)     // Catch:{ IOException -> 0x02c4 }
            java.lang.String r1 = ""
            long r4 = r2.j()     // Catch:{ IOException -> 0x02c4 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x02c4 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02c4 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x02c4 }
            java.nio.charset.Charset r7 = na.b.f13542e     // Catch:{ IOException -> 0x02c4 }
            r2.<init>(r6, r7)     // Catch:{ IOException -> 0x02c4 }
            r2.write(r1)     // Catch:{ all -> 0x02b8 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r0.setLastModified(r4)     // Catch:{ all -> 0x02b8 }
            r2.close()     // Catch:{ IOException -> 0x02c4 }
            goto L_0x02c8
        L_0x02b8:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch:{ all -> 0x02be }
            goto L_0x02c3
        L_0x02be:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x02c4 }
        L_0x02c3:
            throw r1     // Catch:{ IOException -> 0x02c4 }
        L_0x02c4:
            r0 = 3
            android.util.Log.isLoggable(r3, r0)
        L_0x02c8:
            return
        L_0x02c9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x02d1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null identifier"
            r0.<init>(r1)
            throw r0
        L_0x02d9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x02e1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null identifier"
            r0.<init>(r1)
            throw r0
        L_0x02e9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x02f1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null buildVersion"
            r0.<init>(r1)
            throw r0
        L_0x02f9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x0301:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x0309:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.t.a(ia.t, java.lang.String):void");
    }

    public static Task b(t tVar) {
        boolean z10;
        Task task;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : c.e(tVar.f11369g.f13552b.listFiles(f11362r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    task = Tasks.forResult(null);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    task = Tasks.call(new ScheduledThreadPoolExecutor(1), new x(tVar, parseLong));
                }
                arrayList.add(task);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:114|(1:116)(1:117)|118|119|120|121|122|147) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02f5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r18, pa.g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.util.ArrayList r2 = new java.util.ArrayList
            ia.m0 r3 = r1.f11375m
            na.b r3 = r3.f11339b
            r3.getClass()
            java.util.TreeSet r4 = new java.util.TreeSet
            na.c r3 = r3.f13548b
            java.io.File r3 = r3.f13553c
            java.lang.String[] r3 = r3.list()
            java.util.List r3 = na.c.e(r3)
            r4.<init>(r3)
            java.util.NavigableSet r3 = r4.descendingSet()
            r2.<init>(r3)
            int r3 = r2.size()
            java.lang.String r4 = "FirebaseCrashlytics"
            r5 = 2
            if (r3 > r0) goto L_0x0032
            android.util.Log.isLoggable(r4, r5)
            return
        L_0x0032:
            java.lang.Object r3 = r2.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r6 = r19
            pa.e r6 = (pa.e) r6
            pa.c r6 = r6.b()
            pa.c$a r6 = r6.f14112b
            boolean r6 = r6.f14118b
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x00b0
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r6 < r9) goto L_0x00ac
            android.content.Context r6 = r1.f11363a
            java.lang.String r9 = "activity"
            java.lang.Object r6 = r6.getSystemService(r9)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)
            int r9 = r6.size()
            if (r9 == 0) goto L_0x00a8
            ja.c r9 = new ja.c
            na.c r10 = r1.f11369g
            r9.<init>(r10, r3)
            na.c r10 = r1.f11369g
            ia.l r11 = r1.f11367e
            ja.d r12 = new ja.d
            r12.<init>(r10)
            ja.h r13 = new ja.h
            r13.<init>(r3, r10, r11)
            ja.h$a r10 = r13.f11830d
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r10 = r10.f11833a
            java.lang.Object r10 = r10.getReference()
            ja.b r10 = (ja.b) r10
            java.util.Map r11 = r12.b(r3, r8)
            r10.c(r11)
            ja.h$a r10 = r13.f11831e
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r10 = r10.f11833a
            java.lang.Object r10 = r10.getReference()
            ja.b r10 = (ja.b) r10
            java.util.Map r11 = r12.b(r3, r7)
            r10.c(r11)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r10 = r13.f11832f
            java.lang.String r11 = r12.c(r3)
            r10.set(r11, r8)
            ia.m0 r10 = r1.f11375m
            r10.e(r3, r6, r9, r13)
            goto L_0x00b3
        L_0x00a8:
            android.util.Log.isLoggable(r4, r5)
            goto L_0x00b3
        L_0x00ac:
            android.util.Log.isLoggable(r4, r5)
            goto L_0x00b3
        L_0x00b0:
            android.util.Log.isLoggable(r4, r5)
        L_0x00b3:
            fa.a r6 = r1.f11372j
            boolean r6 = r6.c(r3)
            if (r6 == 0) goto L_0x00c7
            android.util.Log.isLoggable(r4, r5)
            fa.a r6 = r1.f11372j
            fa.e r3 = r6.a(r3)
            r3.getClass()
        L_0x00c7:
            r3 = 0
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00e2
        L_0x00d1:
            ia.k r0 = r1.f11374l
            ia.j r2 = r0.f11323b
            monitor-enter(r2)
            java.lang.String r0 = r2.f11320b     // Catch:{ all -> 0x0351 }
            boolean r0 = java.util.Objects.equals(r0, r3)     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x00e0
            r2.f11320b = r3     // Catch:{ all -> 0x0351 }
        L_0x00e0:
            monitor-exit(r2)
            r0 = r3
        L_0x00e2:
            ia.m0 r2 = r1.f11375m
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            na.b r2 = r2.f11339b
            na.c r6 = r2.f13548b
            r6.getClass()
            java.io.File r11 = new java.io.File
            java.io.File r12 = r6.f13551a
            java.lang.String r13 = ".com.google.firebase.crashlytics"
            r11.<init>(r12, r13)
            na.c.a(r11)
            java.io.File r11 = new java.io.File
            java.io.File r12 = r6.f13551a
            java.lang.String r13 = ".com.google.firebase.crashlytics-ndk"
            r11.<init>(r12, r13)
            na.c.a(r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r11 < r12) goto L_0x0112
            r11 = r7
            goto L_0x0113
        L_0x0112:
            r11 = r8
        L_0x0113:
            if (r11 == 0) goto L_0x0121
            java.io.File r11 = new java.io.File
            java.io.File r6 = r6.f13551a
            java.lang.String r12 = ".com.google.firebase.crashlytics.files.v1"
            r11.<init>(r6, r12)
            na.c.a(r11)
        L_0x0121:
            java.util.TreeSet r6 = new java.util.TreeSet
            na.c r11 = r2.f13548b
            java.io.File r11 = r11.f13553c
            java.lang.String[] r11 = r11.list()
            java.util.List r11 = na.c.e(r11)
            r6.<init>(r11)
            java.util.NavigableSet r6 = r6.descendingSet()
            if (r0 == 0) goto L_0x013b
            r6.remove(r0)
        L_0x013b:
            int r0 = r6.size()
            r11 = 8
            r12 = 3
            if (r0 > r11) goto L_0x0145
            goto L_0x0167
        L_0x0145:
            int r0 = r6.size()
            if (r0 <= r11) goto L_0x0167
            java.lang.Object r0 = r6.last()
            java.lang.String r0 = (java.lang.String) r0
            android.util.Log.isLoggable(r4, r12)
            na.c r13 = r2.f13548b
            r13.getClass()
            java.io.File r14 = new java.io.File
            java.io.File r13 = r13.f13553c
            r14.<init>(r13, r0)
            na.c.d(r14)
            r6.remove(r0)
            goto L_0x0145
        L_0x0167:
            java.util.Iterator r6 = r6.iterator()
        L_0x016b:
            boolean r0 = r6.hasNext()
            r11 = 4
            if (r0 == 0) goto L_0x0320
            java.lang.Object r0 = r6.next()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            android.util.Log.isLoggable(r4, r5)
            na.c r0 = r2.f13548b
            na.a r14 = na.b.f13546i
            r0.getClass()
            java.io.File r15 = new java.io.File
            java.io.File r0 = r0.f13553c
            r15.<init>(r0, r13)
            r15.mkdirs()
            java.io.File[] r0 = r15.listFiles(r14)
            java.util.List r0 = na.c.e(r0)
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L_0x01a0
            android.util.Log.isLoggable(r4, r5)
            goto L_0x0308
        L_0x01a0:
            java.util.Collections.sort(r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x01ac:
            r3 = r8
        L_0x01ad:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0213
            java.lang.Object r0 = r15.next()
            r16 = r0
            java.io.File r16 = (java.io.File) r16
            la.a r0 = na.b.f13544g     // Catch:{ IOException -> 0x020d }
            java.lang.String r5 = na.b.d(r16)     // Catch:{ IOException -> 0x020d }
            r0.getClass()     // Catch:{ IOException -> 0x020d }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0206 }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0206 }
            r0.<init>(r5)     // Catch:{ IllegalStateException -> 0x0206 }
            r7.<init>(r0)     // Catch:{ IllegalStateException -> 0x0206 }
            ka.l r0 = la.a.e(r7)     // Catch:{ all -> 0x01fa }
            r7.close()     // Catch:{ IllegalStateException -> 0x0206 }
            r14.add(r0)     // Catch:{ IOException -> 0x020d }
            if (r3 != 0) goto L_0x01f8
            java.lang.String r0 = r16.getName()     // Catch:{ IOException -> 0x020d }
            java.lang.String r5 = "event"
            boolean r5 = r0.startsWith(r5)     // Catch:{ IOException -> 0x020d }
            if (r5 == 0) goto L_0x01f0
            java.lang.String r5 = "_"
            boolean r0 = r0.endsWith(r5)     // Catch:{ IOException -> 0x020d }
            if (r0 == 0) goto L_0x01f0
            r0 = 1
            goto L_0x01f1
        L_0x01f0:
            r0 = r8
        L_0x01f1:
            if (r0 == 0) goto L_0x01f4
            goto L_0x01f8
        L_0x01f4:
            r3 = 0
            r5 = 2
            r7 = 1
            goto L_0x01ac
        L_0x01f8:
            r3 = 1
            goto L_0x0210
        L_0x01fa:
            r0 = move-exception
            r5 = r0
            r7.close()     // Catch:{ all -> 0x0200 }
            goto L_0x0205
        L_0x0200:
            r0 = move-exception
            r7 = r0
            r5.addSuppressed(r7)     // Catch:{ IllegalStateException -> 0x0206 }
        L_0x0205:
            throw r5     // Catch:{ IllegalStateException -> 0x0206 }
        L_0x0206:
            r0 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x020d }
            r5.<init>(r0)     // Catch:{ IOException -> 0x020d }
            throw r5     // Catch:{ IOException -> 0x020d }
        L_0x020d:
            java.util.Objects.toString(r16)
        L_0x0210:
            r5 = 2
            r7 = 1
            goto L_0x01ad
        L_0x0213:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x021b
            goto L_0x0308
        L_0x021b:
            na.c r0 = r2.f13548b
            ja.d r5 = new ja.d
            r5.<init>(r0)
            java.lang.String r0 = r5.c(r13)
            ia.k r5 = r2.f13550d
            ia.j r5 = r5.f11323b
            monitor-enter(r5)
            java.lang.String r7 = r5.f11320b     // Catch:{ all -> 0x031d }
            boolean r7 = java.util.Objects.equals(r7, r13)     // Catch:{ all -> 0x031d }
            if (r7 == 0) goto L_0x0237
            java.lang.String r7 = r5.f11321c     // Catch:{ all -> 0x031d }
            monitor-exit(r5)
            goto L_0x0269
        L_0x0237:
            na.c r7 = r5.f11319a     // Catch:{ all -> 0x031d }
            ia.i r15 = ia.j.f11317d     // Catch:{ all -> 0x031d }
            r7.getClass()     // Catch:{ all -> 0x031d }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x031d }
            java.io.File r7 = r7.f13553c     // Catch:{ all -> 0x031d }
            r8.<init>(r7, r13)     // Catch:{ all -> 0x031d }
            r8.mkdirs()     // Catch:{ all -> 0x031d }
            java.io.File[] r7 = r8.listFiles(r15)     // Catch:{ all -> 0x031d }
            java.util.List r7 = na.c.e(r7)     // Catch:{ all -> 0x031d }
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x031d }
            if (r8 == 0) goto L_0x0258
            r7 = 0
            goto L_0x0268
        L_0x0258:
            f0.k0 r8 = ia.j.f11318e     // Catch:{ all -> 0x031d }
            java.lang.Object r7 = java.util.Collections.min(r7, r8)     // Catch:{ all -> 0x031d }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x031d }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x031d }
            java.lang.String r7 = r7.substring(r11)     // Catch:{ all -> 0x031d }
        L_0x0268:
            monitor-exit(r5)
        L_0x0269:
            na.c r5 = r2.f13548b
            java.lang.String r8 = "report"
            java.io.File r5 = r5.b(r13, r8)
            la.a r8 = na.b.f13544g     // Catch:{ IOException -> 0x0305 }
            java.lang.String r11 = na.b.d(r5)     // Catch:{ IOException -> 0x0305 }
            r8.getClass()     // Catch:{ IOException -> 0x0305 }
            ka.b r8 = la.a.h(r11)     // Catch:{ IOException -> 0x0305 }
            ka.b r0 = r8.m(r9, r3, r0)     // Catch:{ IOException -> 0x0305 }
            ka.b$a r8 = new ka.b$a     // Catch:{ IOException -> 0x0305 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0305 }
            r8.f12257f = r7     // Catch:{ IOException -> 0x0305 }
            ka.b0$e r0 = r0.f12249j     // Catch:{ IOException -> 0x0305 }
            if (r0 == 0) goto L_0x0299
            ka.h$a r0 = r0.m()     // Catch:{ IOException -> 0x0305 }
            r0.f12309c = r7     // Catch:{ IOException -> 0x0305 }
            ka.h r0 = r0.a()     // Catch:{ IOException -> 0x0305 }
            r8.f12260i = r0     // Catch:{ IOException -> 0x0305 }
        L_0x0299:
            ka.b r0 = r8.a()     // Catch:{ IOException -> 0x0305 }
            ka.c0 r7 = new ka.c0     // Catch:{ IOException -> 0x0305 }
            r7.<init>(r14)     // Catch:{ IOException -> 0x0305 }
            ka.b0$e r8 = r0.f12249j     // Catch:{ IOException -> 0x0305 }
            if (r8 == 0) goto L_0x02fd
            ka.b$a r8 = new ka.b$a     // Catch:{ IOException -> 0x0305 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0305 }
            ka.b0$e r0 = r0.f12249j     // Catch:{ IOException -> 0x0305 }
            ka.h$a r0 = r0.m()     // Catch:{ IOException -> 0x0305 }
            r0.f12317k = r7     // Catch:{ IOException -> 0x0305 }
            ka.h r0 = r0.a()     // Catch:{ IOException -> 0x0305 }
            r8.f12260i = r0     // Catch:{ IOException -> 0x0305 }
            ka.b r0 = r8.a()     // Catch:{ IOException -> 0x0305 }
            ka.b0$e r7 = r0.f12249j     // Catch:{ IOException -> 0x0305 }
            if (r7 != 0) goto L_0x02c2
            goto L_0x0308
        L_0x02c2:
            android.util.Log.isLoggable(r4, r12)     // Catch:{ IOException -> 0x0305 }
            if (r3 == 0) goto L_0x02d8
            na.c r3 = r2.f13548b     // Catch:{ IOException -> 0x0305 }
            java.lang.String r7 = r7.h()     // Catch:{ IOException -> 0x0305 }
            r3.getClass()     // Catch:{ IOException -> 0x0305 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0305 }
            java.io.File r3 = r3.f13555e     // Catch:{ IOException -> 0x0305 }
            r8.<init>(r3, r7)     // Catch:{ IOException -> 0x0305 }
            goto L_0x02e8
        L_0x02d8:
            na.c r3 = r2.f13548b     // Catch:{ IOException -> 0x0305 }
            java.lang.String r7 = r7.h()     // Catch:{ IOException -> 0x0305 }
            r3.getClass()     // Catch:{ IOException -> 0x0305 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0305 }
            java.io.File r3 = r3.f13554d     // Catch:{ IOException -> 0x0305 }
            r8.<init>(r3, r7)     // Catch:{ IOException -> 0x0305 }
        L_0x02e8:
            ua.d r3 = la.a.f12898a     // Catch:{ IOException -> 0x0305 }
            r3.getClass()     // Catch:{ IOException -> 0x0305 }
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x0305 }
            r7.<init>()     // Catch:{ IOException -> 0x0305 }
            r3.a(r0, r7)     // Catch:{ IOException -> 0x02f5 }
        L_0x02f5:
            java.lang.String r0 = r7.toString()     // Catch:{ IOException -> 0x0305 }
            na.b.e(r8, r0)     // Catch:{ IOException -> 0x0305 }
            goto L_0x0308
        L_0x02fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0305 }
            java.lang.String r3 = "Reports without sessions cannot have events added to them."
            r0.<init>(r3)     // Catch:{ IOException -> 0x0305 }
            throw r0     // Catch:{ IOException -> 0x0305 }
        L_0x0305:
            java.util.Objects.toString(r5)
        L_0x0308:
            na.c r0 = r2.f13548b
            r0.getClass()
            java.io.File r3 = new java.io.File
            java.io.File r0 = r0.f13553c
            r3.<init>(r0, r13)
            na.c.d(r3)
            r3 = 0
            r5 = 2
            r7 = 1
            r8 = 0
            goto L_0x016b
        L_0x031d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0320:
            pa.g r0 = r2.f13549c
            pa.e r0 = (pa.e) r0
            pa.c r0 = r0.b()
            pa.c$b r0 = r0.f14111a
            r0.getClass()
            java.util.ArrayList r0 = r2.b()
            int r2 = r0.size()
            if (r2 > r11) goto L_0x0338
            goto L_0x0350
        L_0x0338:
            java.util.List r0 = r0.subList(r11, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0340:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0350
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L_0x0340
        L_0x0350:
            return
        L_0x0351:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.t.c(boolean, pa.g):void");
    }

    public final String d() {
        na.b bVar = this.f11375m.f11339b;
        bVar.getClass();
        NavigableSet descendingSet = new TreeSet(c.e(bVar.f13548b.f13553c.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r6 = this;
            java.lang.Class<ia.t> r0 = ia.t.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ IOException -> 0x0055 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            java.lang.String r2 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r2)     // Catch:{ IOException -> 0x0055 }
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            r2 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            r1 = 3
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r3, r1)     // Catch:{ IOException -> 0x0055 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0055 }
            r1.<init>()     // Catch:{ IOException -> 0x0055 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0055 }
        L_0x0026:
            int r4 = r0.read(r3)     // Catch:{ IOException -> 0x0055 }
            r5 = -1
            if (r4 == r5) goto L_0x0031
            r1.write(r3, r2, r4)     // Catch:{ IOException -> 0x0055 }
            goto L_0x0026
        L_0x0031:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x0055 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x0055 }
        L_0x0039:
            if (r1 == 0) goto L_0x0055
            ja.h r0 = r6.f11366d     // Catch:{ IllegalArgumentException -> 0x0041 }
            r0.a(r1)     // Catch:{ IllegalArgumentException -> 0x0041 }
            goto L_0x0055
        L_0x0041:
            r0 = move-exception
            android.content.Context r1 = r6.f11363a     // Catch:{ IOException -> 0x0055 }
            if (r1 == 0) goto L_0x0055
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ IOException -> 0x0055 }
            int r1 = r1.flags     // Catch:{ IOException -> 0x0055 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0051
            r2 = 1
        L_0x0051:
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            throw r0     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.t.e():void");
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> f(Task<pa.c> task) {
        boolean z10;
        Task task2;
        Task<Void> task3;
        na.b bVar = this.f11375m.f11339b;
        if (!c.e(bVar.f13548b.f13554d.listFiles()).isEmpty() || !c.e(bVar.f13548b.f13555e.listFiles()).isEmpty() || !c.e(bVar.f13548b.f13556f.listFiles()).isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f11377o.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f11364b.a()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            this.f11377o.trySetResult(Boolean.FALSE);
            task2 = Tasks.forResult(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f11377o.trySetResult(Boolean.TRUE);
            g0 g0Var = this.f11364b;
            synchronized (g0Var.f11300b) {
                task3 = g0Var.f11301c.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task3.onSuccessTask(new l0());
            Log.isLoggable("FirebaseCrashlytics", 3);
            Task<Boolean> task4 = this.f11378p.getTask();
            ExecutorService executorService = o0.f11348a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            n0 n0Var = new n0(1, taskCompletionSource);
            onSuccessTask.continueWith(n0Var);
            task4.continueWith(n0Var);
            task2 = taskCompletionSource.getTask();
        }
        return task2.onSuccessTask(new a(task));
    }
}
