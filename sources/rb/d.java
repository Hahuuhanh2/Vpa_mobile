package rb;

import android.annotation.SuppressLint;
import android.content.Context;
import c6.g;
import hb.c;
import ib.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c;
import tb.h;
import tb.i;
import tb.j;
import tb.m;
import za.b;

/* compiled from: TransportManager */
public final class d implements a.b {

    /* renamed from: y  reason: collision with root package name */
    public static final lb.a f14545y = lb.a.d();

    /* renamed from: z  reason: collision with root package name */
    public static final d f14546z = new d();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f14547a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f14548b = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f14549c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public m9.d f14550d;

    /* renamed from: e  reason: collision with root package name */
    public c f14551e;

    /* renamed from: f  reason: collision with root package name */
    public ab.c f14552f;

    /* renamed from: n  reason: collision with root package name */
    public b<g> f14553n;

    /* renamed from: o  reason: collision with root package name */
    public a f14554o;

    /* renamed from: p  reason: collision with root package name */
    public ThreadPoolExecutor f14555p = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: q  reason: collision with root package name */
    public Context f14556q;

    /* renamed from: r  reason: collision with root package name */
    public jb.a f14557r;

    /* renamed from: s  reason: collision with root package name */
    public c f14558s;

    /* renamed from: t  reason: collision with root package name */
    public a f14559t;

    /* renamed from: u  reason: collision with root package name */
    public c.a f14560u;

    /* renamed from: v  reason: collision with root package name */
    public String f14561v;

    /* renamed from: w  reason: collision with root package name */
    public String f14562w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14563x = false;

    @SuppressLint({"ThreadPoolCreation"})
    public d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f14547a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String b(j jVar) {
        long j10;
        String str;
        if (jVar.l()) {
            m m10 = jVar.m();
            long U = m10.U();
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{m10.V(), new DecimalFormat("#.####").format(((double) U) / 1000.0d)});
        } else if (jVar.n()) {
            h o10 = jVar.o();
            if (o10.k0()) {
                j10 = o10.b0();
            } else {
                j10 = 0;
            }
            if (o10.g0()) {
                str = String.valueOf(o10.W());
            } else {
                str = "UNKNOWN";
            }
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{o10.d0(), str, new DecimalFormat("#.####").format(((double) j10) / 1000.0d)});
        } else if (!jVar.j()) {
            return "log";
        } else {
            tb.g p10 = jVar.p();
            return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(p10.O()), Integer.valueOf(p10.L()), Integer.valueOf(p10.K())});
        }
    }

    public final void a(tb.d dVar) {
        boolean z10;
        if (dVar == tb.d.FOREGROUND) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14563x = z10;
        if (this.f14549c.get()) {
            this.f14555p.execute(new d.h(this, 24));
        }
    }

    public final void c(i iVar) {
        if (iVar.l()) {
            this.f14559t.b("_fstec");
        } else if (iVar.n()) {
            this.f14559t.b("_fsntc");
        }
    }

    public final void d(m mVar, tb.d dVar) {
        this.f14555p.execute(new v.i(7, this, mVar, dVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v120, resolved type: com.google.protobuf.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: tb.c$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0327, code lost:
        if (rb.c.a(r0.m().W()) == false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0385, code lost:
        if (jb.a.q(r13) != false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0408, code lost:
        if (rb.c.a(r0.m().W()) == false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c6, code lost:
        if (rb.c.a(r0.o().X()) == false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04c8, code lost:
        r2 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(tb.i.a r20, tb.d r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f14549c
            boolean r0 = r0.get()
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            if (r0 != 0) goto L_0x00b5
            j$.util.concurrent.ConcurrentHashMap r0 = r1.f14547a
            java.lang.String r9 = "KEY_AVAILABLE_TRACES_FOR_CACHING"
            java.lang.Object r0 = r0.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            j$.util.concurrent.ConcurrentHashMap r10 = r1.f14547a
            java.lang.String r11 = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            j$.util.concurrent.ConcurrentHashMap r12 = r1.f14547a
            java.lang.String r13 = "KEY_AVAILABLE_GAUGES_FOR_CACHING"
            java.lang.Object r12 = r12.get(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            boolean r14 = r20.l()
            if (r14 == 0) goto L_0x0050
            if (r0 <= 0) goto L_0x0050
            j$.util.concurrent.ConcurrentHashMap r4 = r1.f14547a
            int r0 = r0 - r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r9, r0)
            goto L_0x0075
        L_0x0050:
            boolean r9 = r20.n()
            if (r9 == 0) goto L_0x0063
            if (r10 <= 0) goto L_0x0063
            j$.util.concurrent.ConcurrentHashMap r0 = r1.f14547a
            int r10 = r10 - r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0.put(r11, r4)
            goto L_0x0075
        L_0x0063:
            boolean r9 = r20.j()
            if (r9 == 0) goto L_0x0077
            if (r12 <= 0) goto L_0x0077
            j$.util.concurrent.ConcurrentHashMap r0 = r1.f14547a
            int r12 = r12 - r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r0.put(r13, r4)
        L_0x0075:
            r0 = r7
            goto L_0x0099
        L_0x0077:
            lb.a r9 = f14545y
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r11 = b(r20)
            r6[r8] = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r6[r4] = r0
            java.lang.String r0 = "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."
            r9.b(r0, r6)
            r0 = r8
        L_0x0099:
            if (r0 == 0) goto L_0x00b4
            lb.a r0 = f14545y
            java.lang.String r4 = "Transport is not initialized yet, %s will be queued for to be dispatched later"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r6 = b(r20)
            r5[r8] = r6
            r0.b(r4, r5)
            java.util.concurrent.ConcurrentLinkedQueue<rb.b> r0 = r1.f14548b
            rb.b r4 = new rb.b
            r4.<init>(r2, r3)
            r0.add(r4)
        L_0x00b4:
            return
        L_0x00b5:
            jb.a r0 = r1.f14557r
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x012c
            tb.c$a r0 = r1.f14560u
            MessageType r0 = r0.f7906b
            tb.c r0 = (tb.c) r0
            boolean r0 = r0.O()
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r1.f14563x
            if (r0 != 0) goto L_0x00ce
            goto L_0x012c
        L_0x00ce:
            r9 = 0
            ab.c r0 = r1.f14552f     // Catch:{ ExecutionException -> 0x0104, InterruptedException -> 0x00f3, TimeoutException -> 0x00e2 }
            com.google.android.gms.tasks.Task r0 = r0.getId()     // Catch:{ ExecutionException -> 0x0104, InterruptedException -> 0x00f3, TimeoutException -> 0x00e2 }
            r10 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x0104, InterruptedException -> 0x00f3, TimeoutException -> 0x00e2 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r10, r12)     // Catch:{ ExecutionException -> 0x0104, InterruptedException -> 0x00f3, TimeoutException -> 0x00e2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x0104, InterruptedException -> 0x00f3, TimeoutException -> 0x00e2 }
            r9 = r0
            goto L_0x0114
        L_0x00e2:
            r0 = move-exception
            lb.a r10 = f14545y
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r10.c(r0, r11)
            goto L_0x0114
        L_0x00f3:
            r0 = move-exception
            lb.a r10 = f14545y
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r10.c(r0, r11)
            goto L_0x0114
        L_0x0104:
            r0 = move-exception
            lb.a r10 = f14545y
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r10.c(r0, r11)
        L_0x0114:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0127
            tb.c$a r0 = r1.f14560u
            r0.s()
            MessageType r0 = r0.f7906b
            tb.c r0 = (tb.c) r0
            tb.c.J(r0, r9)
            goto L_0x012c
        L_0x0127:
            lb.a r0 = f14545y
            r0.f()
        L_0x012c:
            tb.c$a r0 = r1.f14560u
            r0.s()
            MessageType r9 = r0.f7906b
            tb.c r9 = (tb.c) r9
            tb.c.H(r9, r3)
            boolean r3 = r20.l()
            if (r3 != 0) goto L_0x0144
            boolean r3 = r20.n()
            if (r3 == 0) goto L_0x0191
        L_0x0144:
            MessageType r3 = r0.f7905a
            com.google.protobuf.i$e r9 = com.google.protobuf.i.e.NEW_BUILDER
            java.lang.Object r3 = r3.w(r9)
            com.google.protobuf.i$a r3 = (com.google.protobuf.i.a) r3
            com.google.protobuf.i r0 = r0.r()
            r3.f7906b = r0
            r0 = r3
            tb.c$a r0 = (tb.c.a) r0
            hb.c r3 = r1.f14551e
            if (r3 != 0) goto L_0x0173
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f14549c
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x0173
            lb.a r3 = hb.c.f10698e
            m9.d r3 = m9.d.d()
            java.lang.Class<hb.c> r9 = hb.c.class
            java.lang.Object r3 = r3.b(r9)
            hb.c r3 = (hb.c) r3
            r1.f14551e = r3
        L_0x0173:
            hb.c r3 = r1.f14551e
            if (r3 == 0) goto L_0x017f
            java.util.HashMap r9 = new java.util.HashMap
            j$.util.concurrent.ConcurrentHashMap r3 = r3.f10699a
            r9.<init>(r3)
            goto L_0x0183
        L_0x017f:
            java.util.Map r9 = java.util.Collections.emptyMap()
        L_0x0183:
            r0.s()
            MessageType r3 = r0.f7906b
            tb.c r3 = (tb.c) r3
            com.google.protobuf.r r3 = tb.c.I(r3)
            r3.putAll(r9)
        L_0x0191:
            r20.s()
            MessageType r3 = r2.f7906b
            tb.i r3 = (tb.i) r3
            com.google.protobuf.i r0 = r0.q()
            tb.c r0 = (tb.c) r0
            tb.i.G(r3, r0)
            com.google.protobuf.i r0 = r20.q()
            tb.i r0 = (tb.i) r0
            jb.a r2 = r1.f14557r
            boolean r2 = r2.p()
            if (r2 != 0) goto L_0x01c0
            lb.a r2 = f14545y
            java.lang.String r3 = "Performance collection is not enabled, dropping %s"
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = b(r0)
            r9[r8] = r10
            r2.e(r3, r9)
            goto L_0x0557
        L_0x01c0:
            tb.c r2 = r0.K()
            boolean r2 = r2.O()
            if (r2 != 0) goto L_0x01db
            lb.a r2 = f14545y
            java.lang.String r3 = "App Instance ID is null or empty, dropping %s"
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = b(r0)
            r9[r8] = r10
            r2.g(r3, r9)
            goto L_0x0557
        L_0x01db:
            android.content.Context r2 = r1.f14556q
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r9 = r0.l()
            if (r9 == 0) goto L_0x01f4
            nb.d r9 = new nb.d
            tb.m r10 = r0.m()
            r9.<init>(r10)
            r3.add(r9)
        L_0x01f4:
            boolean r9 = r0.n()
            if (r9 == 0) goto L_0x0206
            nb.c r9 = new nb.c
            tb.h r10 = r0.o()
            r9.<init>(r10, r2)
            r3.add(r9)
        L_0x0206:
            boolean r2 = r0.L()
            if (r2 == 0) goto L_0x0218
            nb.a r2 = new nb.a
            tb.c r9 = r0.K()
            r2.<init>(r9)
            r3.add(r2)
        L_0x0218:
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x022a
            nb.b r2 = new nb.b
            tb.g r9 = r0.p()
            r2.<init>(r9)
            r3.add(r2)
        L_0x022a:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0238
            lb.a r2 = lb.a.d()
            r2.a()
            goto L_0x024e
        L_0x0238:
            java.util.Iterator r2 = r3.iterator()
        L_0x023c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0250
            java.lang.Object r3 = r2.next()
            nb.e r3 = (nb.e) r3
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x023c
        L_0x024e:
            r2 = r8
            goto L_0x0251
        L_0x0250:
            r2 = r7
        L_0x0251:
            if (r2 != 0) goto L_0x0264
            lb.a r2 = f14545y
            java.lang.String r3 = "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = b(r0)
            r9[r8] = r10
            r2.g(r3, r9)
            goto L_0x0557
        L_0x0264:
            rb.c r2 = r1.f14558s
            r2.getClass()
            boolean r3 = r0.l()
            r9 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 == 0) goto L_0x032e
            jb.a r3 = r2.f14527a
            r3.getClass()
            java.lang.Class<jb.u> r13 = jb.u.class
            monitor-enter(r13)
            jb.u r14 = jb.u.f11862b     // Catch:{ all -> 0x032b }
            if (r14 != 0) goto L_0x0289
            jb.u r14 = new jb.u     // Catch:{ all -> 0x032b }
            r14.<init>()     // Catch:{ all -> 0x032b }
            jb.u.f11862b = r14     // Catch:{ all -> 0x032b }
        L_0x0289:
            jb.u r14 = jb.u.f11862b     // Catch:{ all -> 0x032b }
            monitor-exit(r13)
            com.google.firebase.perf.config.RemoteConfigManager r13 = r3.f11839a
            r14.getClass()
            java.lang.String r15 = "fpr_vc_trace_sampling_rate"
            sb.e r13 = r13.getDouble(r15)
            boolean r15 = r13.b()
            if (r15 == 0) goto L_0x02c9
            java.lang.Object r15 = r13.a()
            java.lang.Double r15 = (java.lang.Double) r15
            double r15 = r15.doubleValue()
            boolean r15 = jb.a.q(r15)
            if (r15 == 0) goto L_0x02c9
            jb.v r3 = r3.f11841c
            java.lang.String r14 = "com.google.firebase.perf.TraceSamplingRate"
            java.lang.Object r15 = r13.a()
            java.lang.Double r15 = (java.lang.Double) r15
            double r4 = r15.doubleValue()
            r3.d(r14, r4)
            java.lang.Object r3 = r13.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x0310
        L_0x02c9:
            sb.e r4 = r3.b(r14)
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x02ee
            java.lang.Object r5 = r4.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r13 = r5.doubleValue()
            boolean r5 = jb.a.q(r13)
            if (r5 == 0) goto L_0x02ee
            java.lang.Object r3 = r4.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x0310
        L_0x02ee:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r3.f11839a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L_0x0308
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            double r3 = r3.doubleValue()
            double r3 = r3 / r9
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            goto L_0x0310
        L_0x0308:
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            double r3 = r3.doubleValue()
        L_0x0310:
            double r13 = r2.f14528b
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0318
            r3 = r7
            goto L_0x0319
        L_0x0318:
            r3 = r8
        L_0x0319:
            if (r3 != 0) goto L_0x032e
            tb.m r3 = r0.m()
            com.google.protobuf.k$c r3 = r3.W()
            boolean r3 = rb.c.a(r3)
            if (r3 != 0) goto L_0x032e
            goto L_0x04c8
        L_0x032b:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x032e:
            boolean r3 = r0.l()
            if (r3 == 0) goto L_0x0350
            tb.m r3 = r0.m()
            java.lang.String r3 = r3.V()
            java.lang.String r4 = "_st_"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0350
            tb.m r3 = r0.m()
            boolean r3 = r3.P()
            if (r3 == 0) goto L_0x0350
            r3 = r7
            goto L_0x0351
        L_0x0350:
            r3 = r8
        L_0x0351:
            if (r3 == 0) goto L_0x040f
            jb.a r3 = r2.f14527a
            r3.getClass()
            java.lang.Class<jb.e> r4 = jb.e.class
            monitor-enter(r4)
            jb.e r5 = jb.e.f11845b     // Catch:{ all -> 0x040c }
            if (r5 != 0) goto L_0x0366
            jb.e r5 = new jb.e     // Catch:{ all -> 0x040c }
            r5.<init>()     // Catch:{ all -> 0x040c }
            jb.e.f11845b = r5     // Catch:{ all -> 0x040c }
        L_0x0366:
            jb.e r5 = jb.e.f11845b     // Catch:{ all -> 0x040c }
            monitor-exit(r4)
            sb.e r4 = r3.i(r5)
            boolean r13 = r4.b()
            if (r13 == 0) goto L_0x0388
            java.lang.Object r4 = r4.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r13 / r17
            boolean r4 = jb.a.q(r13)
            if (r4 == 0) goto L_0x0388
            goto L_0x03f1
        L_0x0388:
            com.google.firebase.perf.config.RemoteConfigManager r4 = r3.f11839a
            java.lang.String r13 = "fpr_vc_fragment_sampling_rate"
            sb.e r4 = r4.getDouble(r13)
            boolean r13 = r4.b()
            if (r13 == 0) goto L_0x03c2
            java.lang.Object r13 = r4.a()
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            boolean r13 = jb.a.q(r13)
            if (r13 == 0) goto L_0x03c2
            jb.v r3 = r3.f11841c
            java.lang.String r5 = "com.google.firebase.perf.FragmentSamplingRate"
            java.lang.Object r13 = r4.a()
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            r3.d(r5, r13)
            java.lang.Object r3 = r4.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r13 = r3.doubleValue()
            goto L_0x03f1
        L_0x03c2:
            sb.e r3 = r3.b(r5)
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x03e7
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = jb.a.q(r4)
            if (r4 == 0) goto L_0x03e7
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r13 = r3.doubleValue()
            goto L_0x03f1
        L_0x03e7:
            r3 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r13 = r3.doubleValue()
        L_0x03f1:
            double r3 = r2.f14529c
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x03f9
            r3 = r7
            goto L_0x03fa
        L_0x03f9:
            r3 = r8
        L_0x03fa:
            if (r3 != 0) goto L_0x040f
            tb.m r3 = r0.m()
            com.google.protobuf.k$c r3 = r3.W()
            boolean r3 = rb.c.a(r3)
            if (r3 != 0) goto L_0x040f
            goto L_0x04c8
        L_0x040c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x040f:
            boolean r3 = r0.n()
            if (r3 == 0) goto L_0x04cd
            jb.a r3 = r2.f14527a
            r3.getClass()
            java.lang.Class<jb.i> r4 = jb.i.class
            monitor-enter(r4)
            jb.i r5 = jb.i.f11850b     // Catch:{ all -> 0x04ca }
            if (r5 != 0) goto L_0x0428
            jb.i r5 = new jb.i     // Catch:{ all -> 0x04ca }
            r5.<init>()     // Catch:{ all -> 0x04ca }
            jb.i.f11850b = r5     // Catch:{ all -> 0x04ca }
        L_0x0428:
            jb.i r5 = jb.i.f11850b     // Catch:{ all -> 0x04ca }
            monitor-exit(r4)
            com.google.firebase.perf.config.RemoteConfigManager r4 = r3.f11839a
            r5.getClass()
            java.lang.String r13 = "fpr_vc_network_request_sampling_rate"
            sb.e r4 = r4.getDouble(r13)
            boolean r13 = r4.b()
            if (r13 == 0) goto L_0x0468
            java.lang.Object r13 = r4.a()
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            boolean r13 = jb.a.q(r13)
            if (r13 == 0) goto L_0x0468
            jb.v r3 = r3.f11841c
            java.lang.String r5 = "com.google.firebase.perf.NetworkRequestSamplingRate"
            java.lang.Object r9 = r4.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r9 = r9.doubleValue()
            r3.d(r5, r9)
            java.lang.Object r3 = r4.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x04af
        L_0x0468:
            sb.e r4 = r3.b(r5)
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x048d
            java.lang.Object r5 = r4.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r13 = r5.doubleValue()
            boolean r5 = jb.a.q(r13)
            if (r5 == 0) goto L_0x048d
            java.lang.Object r3 = r4.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x04af
        L_0x048d:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r3.f11839a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L_0x04a7
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            double r3 = r3.doubleValue()
            double r3 = r3 / r9
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            goto L_0x04af
        L_0x04a7:
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            double r3 = r3.doubleValue()
        L_0x04af:
            double r9 = r2.f14528b
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x04b7
            r2 = r7
            goto L_0x04b8
        L_0x04b7:
            r2 = r8
        L_0x04b8:
            if (r2 != 0) goto L_0x04cd
            tb.h r2 = r0.o()
            com.google.protobuf.k$c r2 = r2.X()
            boolean r2 = rb.c.a(r2)
            if (r2 != 0) goto L_0x04cd
        L_0x04c8:
            r2 = r8
            goto L_0x04ce
        L_0x04ca:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x04cd:
            r2 = r7
        L_0x04ce:
            if (r2 != 0) goto L_0x04e4
            r1.c(r0)
            lb.a r2 = f14545y
            java.lang.String r3 = "Event dropped due to device sampling - %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = b(r0)
            r4[r8] = r5
            r2.e(r3, r4)
            goto L_0x0557
        L_0x04e4:
            rb.c r2 = r1.f14558s
            r2.getClass()
            boolean r3 = r0.l()
            if (r3 == 0) goto L_0x051a
            tb.m r3 = r0.m()
            java.lang.String r3 = r3.V()
            java.lang.String r4 = "_fs"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x050f
            tb.m r3 = r0.m()
            java.lang.String r3 = r3.V()
            java.lang.String r4 = "_bs"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x051a
        L_0x050f:
            tb.m r3 = r0.m()
            int r3 = r3.Q()
            if (r3 <= 0) goto L_0x051a
            goto L_0x0520
        L_0x051a:
            boolean r3 = r0.j()
            if (r3 == 0) goto L_0x0522
        L_0x0520:
            r3 = r8
            goto L_0x0523
        L_0x0522:
            r3 = r7
        L_0x0523:
            if (r3 != 0) goto L_0x0527
            r2 = r8
            goto L_0x0543
        L_0x0527:
            boolean r3 = r0.n()
            if (r3 == 0) goto L_0x0534
            rb.c$a r2 = r2.f14531e
            boolean r2 = r2.a()
            goto L_0x0540
        L_0x0534:
            boolean r3 = r0.l()
            if (r3 == 0) goto L_0x0542
            rb.c$a r2 = r2.f14530d
            boolean r2 = r2.a()
        L_0x0540:
            r2 = r2 ^ r7
            goto L_0x0543
        L_0x0542:
            r2 = r7
        L_0x0543:
            if (r2 == 0) goto L_0x0559
            r1.c(r0)
            lb.a r2 = f14545y
            java.lang.String r3 = "Rate limited (per device) - %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = b(r0)
            r4[r8] = r5
            r2.e(r3, r4)
        L_0x0557:
            r2 = r8
            goto L_0x055a
        L_0x0559:
            r2 = r7
        L_0x055a:
            if (r2 == 0) goto L_0x0618
            boolean r2 = r0.l()
            if (r2 == 0) goto L_0x05be
            lb.a r2 = f14545y
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = b(r0)
            r4[r8] = r3
            tb.m r3 = r0.m()
            java.lang.String r3 = r3.V()
            java.lang.String r5 = "_st_"
            boolean r5 = r3.startsWith(r5)
            java.lang.String r9 = "android-ide"
            java.lang.String r10 = "perf-android-sdk"
            if (r5 == 0) goto L_0x059c
            java.lang.String r5 = r1.f14562w
            java.lang.String r11 = r1.f14561v
            java.lang.String r5 = m9.b.D(r5, r11)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r8] = r5
            r6[r7] = r3
            r5 = 2
            r6[r5] = r10
            r11 = 3
            r6[r11] = r9
            java.lang.String r3 = "%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r3 = java.lang.String.format(r3, r6)
            goto L_0x05b6
        L_0x059c:
            r5 = 2
            r11 = 3
            java.lang.String r12 = r1.f14562w
            java.lang.String r13 = r1.f14561v
            java.lang.String r12 = m9.b.D(r12, r13)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r8] = r12
            r6[r7] = r3
            r6[r5] = r10
            r6[r11] = r9
            java.lang.String r3 = "%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r3 = java.lang.String.format(r3, r6)
        L_0x05b6:
            r4[r7] = r3
            java.lang.String r3 = "Logging %s. In a minute, visit the Firebase console to view your data: %s"
            r2.e(r3, r4)
            goto L_0x05cd
        L_0x05be:
            lb.a r2 = f14545y
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = b(r0)
            r3[r8] = r4
            java.lang.String r4 = "Logging %s"
            r2.e(r4, r3)
        L_0x05cd:
            rb.a r2 = r1.f14554o
            c6.f<tb.i> r3 = r2.f14524c
            if (r3 != 0) goto L_0x05f9
            za.b<c6.g> r3 = r2.f14523b
            java.lang.Object r3 = r3.get()
            c6.g r3 = (c6.g) r3
            if (r3 == 0) goto L_0x05f4
            java.lang.String r4 = r2.f14522a
            c6.b r5 = new c6.b
            java.lang.String r6 = "proto"
            r5.<init>(r6)
            v.g0 r6 = new v.g0
            r9 = 26
            r6.<init>(r9)
            f6.u r3 = r3.a(r4, r5, r6)
            r2.f14524c = r3
            goto L_0x05f9
        L_0x05f4:
            lb.a r3 = rb.a.f14521d
            r3.f()
        L_0x05f9:
            c6.f<tb.i> r2 = r2.f14524c
            if (r2 == 0) goto L_0x05fe
            goto L_0x05ff
        L_0x05fe:
            r7 = r8
        L_0x05ff:
            if (r7 != 0) goto L_0x0607
            lb.a r0 = rb.a.f14521d
            r0.f()
            goto L_0x0611
        L_0x0607:
            c6.a r3 = new c6.a
            c6.d r4 = c6.d.DEFAULT
            r3.<init>(r0, r4)
            r2.a(r3)
        L_0x0611:
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()
            r0.stopGaugeCollectionIfSessionRunningTooLong()
        L_0x0618:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.d.e(tb.i$a, tb.d):void");
    }
}
