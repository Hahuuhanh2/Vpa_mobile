package y3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import o3.j;
import o3.m;
import p3.j0;
import p3.o;
import p3.v;
import p3.x;

/* compiled from: EnqueueRunnable */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final x f17397a;

    /* renamed from: b  reason: collision with root package name */
    public final o f17398b;

    static {
        j.b("EnqueueRunnable");
    }

    public e(x xVar) {
        o oVar = new o();
        this.f17397a = xVar;
        this.f17398b = oVar;
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0160, code lost:
        if (r19 != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0162, code lost:
        r0 = r15.u();
        r2 = r0.f(r6).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0172, code lost:
        if (r2.hasNext() == false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0174, code lost:
        r0.a(((x3.s.a) r2.next()).f17042a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0180, code lost:
        r18 = false;
        r19 = false;
        r9 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(p3.x r61) {
        /*
            r0 = r61
            java.util.List<p3.x> r1 = r0.f14035o
            r2 = 0
            if (r1 == 0) goto L_0x0031
            java.util.Iterator r1 = r1.iterator()
            r3 = r2
        L_0x000c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r1.next()
            p3.x r4 = (p3.x) r4
            boolean r5 = r4.f14036p
            if (r5 != 0) goto L_0x0022
            boolean r4 = a(r4)
            r3 = r3 | r4
            goto L_0x000c
        L_0x0022:
            o3.j r5 = o3.j.a()
            java.util.ArrayList r4 = r4.f14033f
            java.lang.String r6 = ", "
            android.text.TextUtils.join(r6, r4)
            r5.getClass()
            goto L_0x000c
        L_0x0031:
            r3 = r2
        L_0x0032:
            java.util.HashSet r1 = p3.x.K(r61)
            p3.j0 r4 = r0.f14029b
            java.util.List<? extends o3.q> r5 = r0.f14032e
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r6)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r6 = r0.f14030c
            int r7 = r0.f14031d
            o3.o r8 = o3.o.ENQUEUED
            o3.o r10 = o3.o.SUCCEEDED
            o3.o r11 = o3.o.CANCELLED
            o3.o r12 = o3.o.FAILED
            androidx.work.a r13 = r4.f13938b
            j7.a r13 = r13.f3743c
            r13.getClass()
            long r13 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r15 = r4.f13939c
            if (r1 == 0) goto L_0x0062
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0062
            r9 = 1
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            if (r9 == 0) goto L_0x00a0
            int r2 = r1.length
            r20 = r3
            r3 = 0
            r17 = 1
            r18 = 0
            r19 = 0
        L_0x006f:
            if (r3 >= r2) goto L_0x00a8
            r21 = r2
            r2 = r1[r3]
            x3.t r0 = r15.u()
            x3.s r0 = r0.t(r2)
            if (r0 != 0) goto L_0x0087
            o3.j r0 = o3.j.a()
            r0.getClass()
            goto L_0x00e7
        L_0x0087:
            o3.o r0 = r0.f17020b
            if (r0 != r10) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            r17 = r17 & r2
            if (r0 != r12) goto L_0x0095
            r19 = 1
            goto L_0x0099
        L_0x0095:
            if (r0 != r11) goto L_0x0099
            r18 = 1
        L_0x0099:
            int r3 = r3 + 1
            r0 = r61
            r2 = r21
            goto L_0x006f
        L_0x00a0:
            r20 = r3
            r17 = 1
            r18 = 0
            r19 = 0
        L_0x00a8:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00b4
            if (r9 != 0) goto L_0x00b4
            r2 = 1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            if (r2 == 0) goto L_0x0196
            x3.t r2 = r15.u()
            java.util.ArrayList r2 = r2.f(r6)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0196
            r3 = 3
            if (r7 == r3) goto L_0x0114
            r3 = 4
            if (r7 != r3) goto L_0x00cc
            goto L_0x0114
        L_0x00cc:
            r3 = 2
            if (r7 != r3) goto L_0x00ed
            java.util.Iterator r3 = r2.iterator()
        L_0x00d3:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00ed
            java.lang.Object r7 = r3.next()
            x3.s$a r7 = (x3.s.a) r7
            o3.o r7 = r7.f17043b
            if (r7 == r8) goto L_0x00e7
            o3.o r10 = o3.o.RUNNING
            if (r7 != r10) goto L_0x00d3
        L_0x00e7:
            r1 = 1
            r2 = 0
        L_0x00e9:
            r0 = r61
            goto L_0x0311
        L_0x00ed:
            y3.c r3 = new y3.c
            r3.<init>(r4, r6)
            r3.run()
            x3.t r3 = r15.u()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r2.next()
            x3.s$a r7 = (x3.s.a) r7
            java.lang.String r7 = r7.f17042a
            r3.a(r7)
            goto L_0x00fd
        L_0x010f:
            r21 = r0
            r2 = 1
            goto L_0x0199
        L_0x0114:
            x3.b r3 = r15.p()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0121:
            boolean r21 = r2.hasNext()
            if (r21 == 0) goto L_0x0159
            java.lang.Object r21 = r2.next()
            r22 = r2
            r2 = r21
            x3.s$a r2 = (x3.s.a) r2
            r21 = r0
            java.lang.String r0 = r2.f17042a
            boolean r0 = r3.d(r0)
            if (r0 != 0) goto L_0x0154
            o3.o r0 = r2.f17043b
            if (r0 != r10) goto L_0x0142
            r23 = 1
            goto L_0x0144
        L_0x0142:
            r23 = 0
        L_0x0144:
            r17 = r17 & r23
            if (r0 != r12) goto L_0x014b
            r19 = 1
            goto L_0x014f
        L_0x014b:
            if (r0 != r11) goto L_0x014f
            r18 = 1
        L_0x014f:
            java.lang.String r0 = r2.f17042a
            r9.add(r0)
        L_0x0154:
            r0 = r21
            r2 = r22
            goto L_0x0121
        L_0x0159:
            r21 = r0
            r0 = 4
            if (r7 != r0) goto L_0x0188
            if (r18 != 0) goto L_0x0162
            if (r19 == 0) goto L_0x0188
        L_0x0162:
            x3.t r0 = r15.u()
            java.util.ArrayList r2 = r0.f(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x016e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0180
            java.lang.Object r3 = r2.next()
            x3.s$a r3 = (x3.s.a) r3
            java.lang.String r3 = r3.f17042a
            r0.a(r3)
            goto L_0x016e
        L_0x0180:
            java.util.List r9 = java.util.Collections.emptyList()
            r18 = 0
            r19 = 0
        L_0x0188:
            java.lang.Object[] r0 = r9.toArray(r1)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0194
            r9 = 1
            goto L_0x0198
        L_0x0194:
            r9 = 0
            goto L_0x0198
        L_0x0196:
            r21 = r0
        L_0x0198:
            r2 = 0
        L_0x0199:
            java.util.Iterator r0 = r5.iterator()
        L_0x019d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x030e
            java.lang.Object r3 = r0.next()
            o3.q r3 = (o3.q) r3
            x3.s r5 = r3.f13697b
            if (r9 == 0) goto L_0x01be
            if (r17 != 0) goto L_0x01be
            if (r19 == 0) goto L_0x01b4
            r5.f17020b = r12
            goto L_0x01c0
        L_0x01b4:
            if (r18 == 0) goto L_0x01b9
            r5.f17020b = r11
            goto L_0x01c0
        L_0x01b9:
            o3.o r7 = o3.o.BLOCKED
            r5.f17020b = r7
            goto L_0x01c0
        L_0x01be:
            r5.f17032n = r13
        L_0x01c0:
            o3.o r7 = r5.f17020b
            if (r7 != r8) goto L_0x01c5
            r2 = 1
        L_0x01c5:
            x3.t r7 = r15.u()
            java.util.List<p3.t> r10 = r4.f13941e
            r16 = r0
            java.lang.String r0 = "schedulers"
            sk.j.f(r10, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r0 >= r10) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            if (r0 == 0) goto L_0x02a4
            java.lang.Class<androidx.work.impl.workers.ConstraintTrackingWorker> r0 = androidx.work.impl.workers.ConstraintTrackingWorker.class
            o3.c r10 = r5.f17028j
            r22 = r2
            java.lang.String r2 = r5.f17021c
            r23 = r4
            java.lang.String r4 = r0.getName()
            boolean r4 = sk.j.a(r2, r4)
            if (r4 != 0) goto L_0x02a8
            boolean r4 = r10.f13669d
            if (r4 != 0) goto L_0x01f9
            boolean r4 = r10.f13670e
            if (r4 == 0) goto L_0x02a8
        L_0x01f9:
            androidx.work.c$a r4 = new androidx.work.c$a
            r4.<init>()
            androidx.work.c r10 = r5.f17023e
            java.util.HashMap r10 = r10.f3754a
            r4.a(r10)
            java.util.HashMap r10 = r4.f3755a
            r24 = r8
            java.lang.String r8 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            r10.put(r8, r2)
            androidx.work.c r2 = new androidx.work.c
            r30 = r2
            java.util.HashMap r4 = r4.f3755a
            r2.<init>((java.util.HashMap) r4)
            androidx.work.c.b(r2)
            java.lang.String r28 = r0.getName()
            java.lang.String r0 = r5.f17019a
            r26 = r0
            o3.o r2 = r5.f17020b
            r27 = r2
            java.lang.String r4 = r5.f17022d
            r29 = r4
            androidx.work.c r8 = r5.f17024f
            r31 = r8
            r57 = r11
            long r10 = r5.f17025g
            r32 = r10
            long r10 = r5.f17026h
            r34 = r10
            long r10 = r5.f17027i
            r36 = r10
            o3.c r10 = r5.f17028j
            r38 = r10
            int r11 = r5.f17029k
            r39 = r11
            int r11 = r5.f17030l
            r40 = r11
            r58 = r12
            r59 = r13
            long r12 = r5.f17031m
            r41 = r12
            long r12 = r5.f17032n
            r43 = r12
            long r12 = r5.f17033o
            r45 = r12
            long r12 = r5.f17034p
            r47 = r12
            boolean r12 = r5.f17035q
            r49 = r12
            int r12 = r5.f17036r
            r50 = r12
            int r13 = r5.f17037s
            r51 = r13
            int r13 = r5.f17038t
            r52 = r13
            long r13 = r5.f17039u
            r53 = r13
            int r13 = r5.f17040v
            r55 = r13
            int r5 = r5.f17041w
            r56 = r5
            java.lang.String r5 = "id"
            sk.j.f(r0, r5)
            java.lang.String r0 = "state"
            sk.j.f(r2, r0)
            java.lang.String r0 = "inputMergerClassName"
            sk.j.f(r4, r0)
            java.lang.String r0 = "output"
            sk.j.f(r8, r0)
            java.lang.String r0 = "constraints"
            sk.j.f(r10, r0)
            java.lang.String r0 = "backoffPolicy"
            n0.l.o(r11, r0)
            java.lang.String r0 = "outOfQuotaPolicy"
            n0.l.o(r12, r0)
            x3.s r0 = new x3.s
            r25 = r0
            r25.<init>((java.lang.String) r26, (o3.o) r27, (java.lang.String) r28, (java.lang.String) r29, (androidx.work.c) r30, (androidx.work.c) r31, (long) r32, (long) r34, (long) r36, (o3.c) r38, (int) r39, (int) r40, (long) r41, (long) r43, (long) r45, (long) r47, (boolean) r49, (int) r50, (int) r51, (int) r52, (long) r53, (int) r55, (int) r56)
            r5 = r0
            goto L_0x02b0
        L_0x02a4:
            r22 = r2
            r23 = r4
        L_0x02a8:
            r24 = r8
            r57 = r11
            r58 = r12
            r59 = r13
        L_0x02b0:
            r7.b(r5)
            java.lang.String r0 = "id.toString()"
            if (r9 == 0) goto L_0x02d5
            int r2 = r1.length
            r4 = 0
        L_0x02b9:
            if (r4 >= r2) goto L_0x02d5
            r5 = r1[r4]
            x3.a r7 = new x3.a
            java.util.UUID r8 = r3.f13696a
            java.lang.String r8 = r8.toString()
            sk.j.e(r8, r0)
            r7.<init>(r8, r5)
            x3.b r5 = r15.p()
            r5.c(r7)
            int r4 = r4 + 1
            goto L_0x02b9
        L_0x02d5:
            x3.w r2 = r15.v()
            java.util.UUID r4 = r3.f13696a
            java.lang.String r4 = r4.toString()
            sk.j.e(r4, r0)
            java.util.Set<java.lang.String> r5 = r3.f13698c
            r2.b(r4, r5)
            if (r21 == 0) goto L_0x02fe
            x3.n r2 = r15.s()
            x3.m r4 = new x3.m
            java.util.UUID r3 = r3.f13696a
            java.lang.String r3 = r3.toString()
            sk.j.e(r3, r0)
            r4.<init>(r6, r3)
            r2.a(r4)
        L_0x02fe:
            r0 = r16
            r2 = r22
            r4 = r23
            r8 = r24
            r11 = r57
            r12 = r58
            r13 = r59
            goto L_0x019d
        L_0x030e:
            r1 = 1
            goto L_0x00e9
        L_0x0311:
            r0.f14036p = r1
            r0 = r20 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.e.a(p3.x):boolean");
    }

    public final void run() {
        WorkDatabase workDatabase;
        try {
            x xVar = this.f17397a;
            xVar.getClass();
            if (!x.J(xVar, new HashSet())) {
                j0 j0Var = this.f17397a.f14029b;
                workDatabase = j0Var.f13939c;
                workDatabase.c();
                f.a(workDatabase, j0Var.f13938b, this.f17397a);
                boolean a10 = a(this.f17397a);
                workDatabase.n();
                workDatabase.j();
                if (a10) {
                    m.a(this.f17397a.f14029b.f13937a, RescheduleReceiver.class, true);
                    j0 j0Var2 = this.f17397a.f14029b;
                    v.b(j0Var2.f13938b, j0Var2.f13939c, j0Var2.f13941e);
                }
                this.f17398b.a(m.f13686a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f17397a + ")");
        } catch (Throwable th2) {
            this.f17398b.a(new m.a.C0169a(th2));
        }
    }
}
