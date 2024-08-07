package p3;

import a4.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import o3.j;
import o3.o;
import x3.s;
import x3.t;
import y3.m;
import z3.c;

/* compiled from: WorkerWrapper */
public final class o0 implements Runnable {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f13976y = 0;

    /* renamed from: a  reason: collision with root package name */
    public Context f13977a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13978b;

    /* renamed from: c  reason: collision with root package name */
    public s f13979c;

    /* renamed from: d  reason: collision with root package name */
    public d f13980d;

    /* renamed from: e  reason: collision with root package name */
    public b f13981e;

    /* renamed from: f  reason: collision with root package name */
    public d.a f13982f = new d.a.C0036a();

    /* renamed from: n  reason: collision with root package name */
    public androidx.work.a f13983n;

    /* renamed from: o  reason: collision with root package name */
    public j7.a f13984o;

    /* renamed from: p  reason: collision with root package name */
    public w3.a f13985p;

    /* renamed from: q  reason: collision with root package name */
    public WorkDatabase f13986q;

    /* renamed from: r  reason: collision with root package name */
    public t f13987r;

    /* renamed from: s  reason: collision with root package name */
    public x3.b f13988s;

    /* renamed from: t  reason: collision with root package name */
    public List<String> f13989t;

    /* renamed from: u  reason: collision with root package name */
    public String f13990u;

    /* renamed from: v  reason: collision with root package name */
    public c<Boolean> f13991v = new c<>();

    /* renamed from: w  reason: collision with root package name */
    public final c<d.a> f13992w = new c<>();

    /* renamed from: x  reason: collision with root package name */
    public volatile int f13993x = -256;

    /* compiled from: WorkerWrapper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f13994a;

        /* renamed from: b  reason: collision with root package name */
        public w3.a f13995b;

        /* renamed from: c  reason: collision with root package name */
        public b f13996c;

        /* renamed from: d  reason: collision with root package name */
        public androidx.work.a f13997d;

        /* renamed from: e  reason: collision with root package name */
        public WorkDatabase f13998e;

        /* renamed from: f  reason: collision with root package name */
        public s f13999f;

        /* renamed from: g  reason: collision with root package name */
        public final List<String> f14000g;

        /* renamed from: h  reason: collision with root package name */
        public WorkerParameters.a f14001h = new WorkerParameters.a();

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.a aVar, b bVar, w3.a aVar2, WorkDatabase workDatabase, s sVar, ArrayList arrayList) {
            this.f13994a = context.getApplicationContext();
            this.f13996c = bVar;
            this.f13995b = aVar2;
            this.f13997d = aVar;
            this.f13998e = workDatabase;
            this.f13999f = sVar;
            this.f14000g = arrayList;
        }
    }

    static {
        j.b("WorkerWrapper");
    }

    public o0(a aVar) {
        this.f13977a = aVar.f13994a;
        this.f13981e = aVar.f13996c;
        this.f13985p = aVar.f13995b;
        s sVar = aVar.f13999f;
        this.f13979c = sVar;
        this.f13978b = sVar.f17019a;
        WorkerParameters.a aVar2 = aVar.f14001h;
        this.f13980d = null;
        androidx.work.a aVar3 = aVar.f13997d;
        this.f13983n = aVar3;
        this.f13984o = aVar3.f3743c;
        WorkDatabase workDatabase = aVar.f13998e;
        this.f13986q = workDatabase;
        this.f13987r = workDatabase.u();
        this.f13988s = this.f13986q.p();
        this.f13989t = aVar.f14000g;
    }

    public final void a(d.a aVar) {
        if (aVar instanceof d.a.c) {
            j.a().getClass();
            if (this.f13979c.c()) {
                e();
                return;
            }
            this.f13986q.c();
            try {
                this.f13987r.m(o.SUCCEEDED, this.f13978b);
                this.f13987r.l(this.f13978b, ((d.a.c) this.f13982f).f3761a);
                this.f13984o.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                for (String str : this.f13988s.a(this.f13978b)) {
                    if (this.f13987r.s(str) == o.BLOCKED && this.f13988s.b(str)) {
                        j.a().getClass();
                        this.f13987r.m(o.ENQUEUED, str);
                        this.f13987r.i(currentTimeMillis, str);
                    }
                }
                this.f13986q.n();
            } finally {
                this.f13986q.j();
                f(false);
            }
        } else if (aVar instanceof d.a.b) {
            j.a().getClass();
            d();
        } else {
            j.a().getClass();
            if (this.f13979c.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f13987r.s(str2) != o.CANCELLED) {
                this.f13987r.m(o.FAILED, str2);
            }
            linkedList.addAll(this.f13988s.a(str2));
        }
    }

    public final void c() {
        if (!i()) {
            this.f13986q.c();
            try {
                o s10 = this.f13987r.s(this.f13978b);
                this.f13986q.t().a(this.f13978b);
                if (s10 == null) {
                    f(false);
                } else if (s10 == o.RUNNING) {
                    a(this.f13982f);
                } else if (!s10.b()) {
                    this.f13993x = -512;
                    d();
                }
                this.f13986q.n();
            } finally {
                this.f13986q.j();
            }
        }
    }

    public final void d() {
        this.f13986q.c();
        try {
            this.f13987r.m(o.ENQUEUED, this.f13978b);
            t tVar = this.f13987r;
            String str = this.f13978b;
            this.f13984o.getClass();
            tVar.i(System.currentTimeMillis(), str);
            this.f13987r.j(this.f13979c.f17040v, this.f13978b);
            this.f13987r.e(-1, this.f13978b);
            this.f13986q.n();
        } finally {
            this.f13986q.j();
            f(true);
        }
    }

    public final void e() {
        this.f13986q.c();
        try {
            t tVar = this.f13987r;
            String str = this.f13978b;
            this.f13984o.getClass();
            tVar.i(System.currentTimeMillis(), str);
            this.f13987r.m(o.ENQUEUED, this.f13978b);
            this.f13987r.u(this.f13978b);
            this.f13987r.j(this.f13979c.f17040v, this.f13978b);
            this.f13987r.d(this.f13978b);
            this.f13987r.e(-1, this.f13978b);
            this.f13986q.n();
        } finally {
            this.f13986q.j();
            f(false);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f(boolean z10) {
        this.f13986q.c();
        try {
            if (!this.f13986q.u().p()) {
                m.a(this.f13977a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f13987r.m(o.ENQUEUED, this.f13978b);
                this.f13987r.o(this.f13993x, this.f13978b);
                this.f13987r.e(-1, this.f13978b);
            }
            this.f13986q.n();
            this.f13986q.j();
            this.f13991v.i(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f13986q.j();
            throw th2;
        }
    }

    public final void g() {
        o s10 = this.f13987r.s(this.f13978b);
        if (s10 == o.RUNNING) {
            j.a().getClass();
            f(true);
            return;
        }
        j a10 = j.a();
        Objects.toString(s10);
        a10.getClass();
        f(false);
    }

    public final void h() {
        this.f13986q.c();
        try {
            b(this.f13978b);
            androidx.work.c cVar = ((d.a.C0036a) this.f13982f).f3760a;
            this.f13987r.j(this.f13979c.f17040v, this.f13978b);
            this.f13987r.l(this.f13978b, cVar);
            this.f13986q.n();
        } finally {
            this.f13986q.j();
            f(false);
        }
    }

    public final boolean i() {
        if (this.f13993x == -256) {
            return false;
        }
        j.a().getClass();
        o s10 = this.f13987r.s(this.f13978b);
        if (s10 == null) {
            f(false);
        } else {
            f(!s10.b());
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1 != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.util.List<java.lang.String> r0 = r14.f13989t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Work [ id="
            r1.<init>(r2)
            java.lang.String r2 = r14.f13978b
            r1.append(r2)
            java.lang.String r2 = ", tags={ "
            r1.append(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
            r3 = r2
        L_0x0019:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0033
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x002a
            r3 = r5
            goto L_0x002f
        L_0x002a:
            java.lang.String r5 = ", "
            r1.append(r5)
        L_0x002f:
            r1.append(r4)
            goto L_0x0019
        L_0x0033:
            java.lang.String r0 = " } ]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.f13990u = r0
            o3.o r0 = o3.o.ENQUEUED
            boolean r1 = r14.i()
            if (r1 == 0) goto L_0x0048
            goto L_0x021c
        L_0x0048:
            androidx.work.impl.WorkDatabase r1 = r14.f13986q
            r1.c()
            x3.s r1 = r14.f13979c     // Catch:{ all -> 0x0224 }
            o3.o r3 = r1.f17020b     // Catch:{ all -> 0x0224 }
            if (r3 == r0) goto L_0x0067
            r14.g()     // Catch:{ all -> 0x0224 }
            androidx.work.impl.WorkDatabase r0 = r14.f13986q     // Catch:{ all -> 0x0224 }
            r0.n()     // Catch:{ all -> 0x0224 }
            o3.j r0 = o3.j.a()     // Catch:{ all -> 0x0224 }
            x3.s r1 = r14.f13979c     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = r1.f17021c     // Catch:{ all -> 0x0224 }
            r0.getClass()     // Catch:{ all -> 0x0224 }
            goto L_0x00ab
        L_0x0067:
            boolean r1 = r1.c()     // Catch:{ all -> 0x0224 }
            if (r1 != 0) goto L_0x007c
            x3.s r1 = r14.f13979c     // Catch:{ all -> 0x0224 }
            o3.o r3 = r1.f17020b     // Catch:{ all -> 0x0224 }
            if (r3 != r0) goto L_0x0079
            int r1 = r1.f17029k     // Catch:{ all -> 0x0224 }
            if (r1 <= 0) goto L_0x0079
            r1 = r2
            goto L_0x007a
        L_0x0079:
            r1 = r5
        L_0x007a:
            if (r1 == 0) goto L_0x00b2
        L_0x007c:
            j7.a r1 = r14.f13984o     // Catch:{ all -> 0x0224 }
            r1.getClass()     // Catch:{ all -> 0x0224 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0224 }
            x3.s r1 = r14.f13979c     // Catch:{ all -> 0x0224 }
            long r6 = r1.a()     // Catch:{ all -> 0x0224 }
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b2
            o3.j r0 = o3.j.a()     // Catch:{ all -> 0x0224 }
            java.lang.String r1 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0224 }
            x3.s r4 = r14.f13979c     // Catch:{ all -> 0x0224 }
            java.lang.String r4 = r4.f17021c     // Catch:{ all -> 0x0224 }
            r3[r5] = r4     // Catch:{ all -> 0x0224 }
            java.lang.String.format(r1, r3)     // Catch:{ all -> 0x0224 }
            r0.getClass()     // Catch:{ all -> 0x0224 }
            r14.f(r2)     // Catch:{ all -> 0x0224 }
            androidx.work.impl.WorkDatabase r0 = r14.f13986q     // Catch:{ all -> 0x0224 }
            r0.n()     // Catch:{ all -> 0x0224 }
        L_0x00ab:
            androidx.work.impl.WorkDatabase r0 = r14.f13986q
            r0.j()
            goto L_0x021c
        L_0x00b2:
            androidx.work.impl.WorkDatabase r1 = r14.f13986q     // Catch:{ all -> 0x0224 }
            r1.n()     // Catch:{ all -> 0x0224 }
            androidx.work.impl.WorkDatabase r1 = r14.f13986q
            r1.j()
            x3.s r1 = r14.f13979c
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x00ca
            x3.s r1 = r14.f13979c
            androidx.work.c r1 = r1.f17023e
        L_0x00c8:
            r8 = r1
            goto L_0x012a
        L_0x00ca:
            androidx.work.a r1 = r14.f13983n
            o3.k r1 = r1.f3745e
            x3.s r3 = r14.f13979c
            java.lang.String r3 = r3.f17022d
            r1.getClass()
            java.lang.String r1 = "className"
            sk.j.f(r3, r1)
            int r1 = o3.g.f13679a
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00f4 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r1 = r1.newInstance(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "null cannot be cast to non-null type androidx.work.InputMerger"
            sk.j.d(r1, r3)     // Catch:{ Exception -> 0x00f4 }
            o3.f r1 = (o3.f) r1     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00fc
        L_0x00f4:
            o3.j r1 = o3.j.a()
            r1.getClass()
            r1 = 0
        L_0x00fc:
            if (r1 != 0) goto L_0x010e
            o3.j r0 = o3.j.a()
            x3.s r1 = r14.f13979c
            java.lang.String r1 = r1.f17022d
            r0.getClass()
            r14.h()
            goto L_0x021c
        L_0x010e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            x3.s r4 = r14.f13979c
            androidx.work.c r4 = r4.f17023e
            r3.add(r4)
            x3.t r4 = r14.f13987r
            java.lang.String r6 = r14.f13978b
            java.util.ArrayList r4 = r4.w(r6)
            r3.addAll(r4)
            androidx.work.c r1 = r1.a(r3)
            goto L_0x00c8
        L_0x012a:
            androidx.work.WorkerParameters r1 = new androidx.work.WorkerParameters
            java.lang.String r3 = r14.f13978b
            java.util.UUID r7 = java.util.UUID.fromString(r3)
            java.util.List<java.lang.String> r9 = r14.f13989t
            x3.s r3 = r14.f13979c
            int r3 = r3.f17029k
            androidx.work.a r3 = r14.f13983n
            java.util.concurrent.ExecutorService r10 = r3.f3741a
            a4.b r11 = r14.f13981e
            o3.r r12 = r3.f3744d
            y3.y r3 = new y3.y
            y3.x r13 = new y3.x
            androidx.work.impl.WorkDatabase r3 = r14.f13986q
            w3.a r4 = r14.f13985p
            a4.b r6 = r14.f13981e
            r13.<init>(r3, r4, r6)
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            androidx.work.d r3 = r14.f13980d
            if (r3 != 0) goto L_0x0165
            androidx.work.a r3 = r14.f13983n
            o3.r r3 = r3.f3744d
            android.content.Context r4 = r14.f13977a
            x3.s r6 = r14.f13979c
            java.lang.String r6 = r6.f17021c
            androidx.work.d r3 = r3.a(r4, r6, r1)
            r14.f13980d = r3
        L_0x0165:
            androidx.work.d r3 = r14.f13980d
            if (r3 != 0) goto L_0x0179
            o3.j r0 = o3.j.a()
            x3.s r1 = r14.f13979c
            java.lang.String r1 = r1.f17021c
            r0.getClass()
            r14.h()
            goto L_0x021c
        L_0x0179:
            boolean r4 = r3.f3759d
            if (r4 == 0) goto L_0x018d
            o3.j r0 = o3.j.a()
            x3.s r1 = r14.f13979c
            java.lang.String r1 = r1.f17021c
            r0.getClass()
            r14.h()
            goto L_0x021c
        L_0x018d:
            r3.f3759d = r2
            androidx.work.impl.WorkDatabase r3 = r14.f13986q
            r3.c()
            x3.t r3 = r14.f13987r     // Catch:{ all -> 0x021d }
            java.lang.String r4 = r14.f13978b     // Catch:{ all -> 0x021d }
            o3.o r3 = r3.s(r4)     // Catch:{ all -> 0x021d }
            if (r3 != r0) goto L_0x01b8
            x3.t r0 = r14.f13987r     // Catch:{ all -> 0x021d }
            o3.o r3 = o3.o.RUNNING     // Catch:{ all -> 0x021d }
            java.lang.String r4 = r14.f13978b     // Catch:{ all -> 0x021d }
            r0.m(r3, r4)     // Catch:{ all -> 0x021d }
            x3.t r0 = r14.f13987r     // Catch:{ all -> 0x021d }
            java.lang.String r3 = r14.f13978b     // Catch:{ all -> 0x021d }
            r0.x(r3)     // Catch:{ all -> 0x021d }
            x3.t r0 = r14.f13987r     // Catch:{ all -> 0x021d }
            java.lang.String r3 = r14.f13978b     // Catch:{ all -> 0x021d }
            r4 = -256(0xffffffffffffff00, float:NaN)
            r0.o(r4, r3)     // Catch:{ all -> 0x021d }
            goto L_0x01b9
        L_0x01b8:
            r2 = r5
        L_0x01b9:
            androidx.work.impl.WorkDatabase r0 = r14.f13986q     // Catch:{ all -> 0x021d }
            r0.n()     // Catch:{ all -> 0x021d }
            androidx.work.impl.WorkDatabase r0 = r14.f13986q
            r0.j()
            if (r2 == 0) goto L_0x0219
            boolean r0 = r14.i()
            if (r0 == 0) goto L_0x01cc
            goto L_0x021c
        L_0x01cc:
            y3.v r0 = new y3.v
            android.content.Context r3 = r14.f13977a
            x3.s r4 = r14.f13979c
            androidx.work.d r5 = r14.f13980d
            o3.e r6 = r1.f3738f
            a4.b r7 = r14.f13981e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            a4.b r1 = r14.f13981e
            a4.c$a r1 = r1.b()
            r1.execute(r0)
            z3.c<java.lang.Void> r0 = r0.f17422a
            z3.c<androidx.work.d$a> r1 = r14.f13992w
            v.f r2 = new v.f
            r3 = 19
            r2.<init>(r3, r14, r0)
            y3.s r3 = new y3.s
            r3.<init>()
            r1.b(r2, r3)
            p3.m0 r1 = new p3.m0
            r1.<init>(r14, r0)
            a4.b r2 = r14.f13981e
            a4.c$a r2 = r2.b()
            r0.b(r1, r2)
            java.lang.String r0 = r14.f13990u
            z3.c<androidx.work.d$a> r1 = r14.f13992w
            p3.n0 r2 = new p3.n0
            r2.<init>(r14, r0)
            a4.b r0 = r14.f13981e
            y3.p r0 = r0.c()
            r1.b(r2, r0)
            goto L_0x021c
        L_0x0219:
            r14.g()
        L_0x021c:
            return
        L_0x021d:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r14.f13986q
            r1.j()
            throw r0
        L_0x0224:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r14.f13986q
            r1.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.o0.run():void");
    }
}
