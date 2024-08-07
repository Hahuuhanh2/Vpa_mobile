package xb;

import ab.c;
import al.a0;
import al.g0;
import android.app.Application;
import android.content.Context;
import c0.r;
import ek.i;
import java.util.Objects;
import m9.d;
import sk.j;
import yb.a;
import yb.b;
import za.b;
import zb.g;

/* compiled from: FirebaseSessions.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final d f17227a;

    /* renamed from: b  reason: collision with root package name */
    public final g f17228b;

    /* renamed from: c  reason: collision with root package name */
    public final u f17229c;

    /* renamed from: d  reason: collision with root package name */
    public final p f17230d;

    /* compiled from: FirebaseSessions.kt */
    public static final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f17231a;

        public a(n nVar) {
            this.f17231a = nVar;
        }

        public final Object a(q qVar, ik.d<? super i> dVar) {
            Object a10 = n.a(this.f17231a, qVar, dVar);
            if (a10 == jk.a.COROUTINE_SUSPENDED) {
                return a10;
            }
            return i.f20112a;
        }
    }

    public n(d dVar, c cVar, a0 a0Var, a0 a0Var2, b<c6.g> bVar) {
        boolean z10;
        d dVar2 = dVar;
        this.f17227a = dVar2;
        b a10 = s.a(dVar);
        dVar.a();
        Context context = dVar2.f13218a;
        j.e(context, "firebaseApp.applicationContext");
        g gVar = new g(context, a0Var2, a0Var, cVar, a10);
        this.f17228b = gVar;
        g0 g0Var = new g0();
        this.f17230d = new p(cVar, new j(bVar));
        if (Math.random() <= gVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u uVar = new u(z10, g0Var);
        this.f17229c = uVar;
        y yVar = new y(g0Var, a0Var, new a(this), gVar, uVar);
        dVar.a();
        Context applicationContext = dVar2.f13218a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(yVar.f17272g);
            r rVar = new r(applicationContext, yVar);
            dVar.a();
            dVar2.f13227j.add(rVar);
            return;
        }
        applicationContext.getClass().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(xb.n r9, xb.q r10, ik.d r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof xb.m
            if (r0 == 0) goto L_0x0016
            r0 = r11
            xb.m r0 = (xb.m) r0
            int r1 = r0.f17226f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f17226f = r1
            goto L_0x001b
        L_0x0016:
            xb.m r0 = new xb.m
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.f17224d
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17226f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            p3.l0.Q0(r11)     // Catch:{ IllegalStateException -> 0x010f }
            goto L_0x010f
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            java.util.Map r9 = r0.f17223c
            xb.q r10 = r0.f17222b
            xb.n r2 = r0.f17221a
            p3.l0.Q0(r11)
            goto L_0x00ca
        L_0x0044:
            xb.q r10 = r0.f17222b
            xb.n r9 = r0.f17221a
            p3.l0.Q0(r11)
            goto L_0x005f
        L_0x004c:
            p3.l0.Q0(r11)
            yb.a r11 = yb.a.f17628a
            r0.f17221a = r9
            r0.f17222b = r10
            r0.f17226f = r5
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r1) goto L_0x005f
            goto L_0x0111
        L_0x005f:
            java.util.Map r11 = (java.util.Map) r11
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x006b
            ek.i r1 = ek.i.f20112a
            goto L_0x0111
        L_0x006b:
            java.util.Collection r2 = r11.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r2.next()
            yb.b r6 = (yb.b) r6
            yb.b$b r7 = new yb.b$b
            java.lang.String r8 = r10.f17244a
            r7.<init>(r8)
            r6.c(r7)
            goto L_0x0073
        L_0x008a:
            java.util.Collection r2 = r11.values()
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0099
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0099
            goto L_0x00b1
        L_0x0099:
            java.util.Iterator r2 = r2.iterator()
        L_0x009d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r2.next()
            yb.b r6 = (yb.b) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x009d
            r2 = 0
            goto L_0x00b2
        L_0x00b1:
            r2 = r5
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            ek.i r1 = ek.i.f20112a
            goto L_0x0111
        L_0x00b7:
            zb.g r2 = r9.f17228b
            r0.f17221a = r9
            r0.f17222b = r10
            r0.f17223c = r11
            r0.f17226f = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 != r1) goto L_0x00c8
            goto L_0x0111
        L_0x00c8:
            r2 = r9
            r9 = r11
        L_0x00ca:
            zb.g r11 = r2.f17228b
            zb.j r4 = r11.f17935a
            java.lang.Boolean r4 = r4.a()
            if (r4 == 0) goto L_0x00d9
            boolean r5 = r4.booleanValue()
            goto L_0x00e5
        L_0x00d9:
            zb.j r11 = r11.f17936b
            java.lang.Boolean r11 = r11.a()
            if (r11 == 0) goto L_0x00e5
            boolean r5 = r11.booleanValue()
        L_0x00e5:
            if (r5 != 0) goto L_0x00ea
            ek.i r1 = ek.i.f20112a
            goto L_0x0111
        L_0x00ea:
            xb.u r11 = r2.f17229c
            boolean r11 = r11.f17253a
            if (r11 != 0) goto L_0x00f3
            ek.i r1 = ek.i.f20112a
            goto L_0x0111
        L_0x00f3:
            ua.d r11 = xb.s.f17251a     // Catch:{ IllegalStateException -> 0x010f }
            m9.d r11 = r2.f17227a     // Catch:{ IllegalStateException -> 0x010f }
            zb.g r4 = r2.f17228b     // Catch:{ IllegalStateException -> 0x010f }
            xb.r r9 = xb.s.b(r11, r10, r4, r9)     // Catch:{ IllegalStateException -> 0x010f }
            xb.p r10 = r2.f17230d     // Catch:{ IllegalStateException -> 0x010f }
            r11 = 0
            r0.f17221a = r11     // Catch:{ IllegalStateException -> 0x010f }
            r0.f17222b = r11     // Catch:{ IllegalStateException -> 0x010f }
            r0.f17223c = r11     // Catch:{ IllegalStateException -> 0x010f }
            r0.f17226f = r3     // Catch:{ IllegalStateException -> 0x010f }
            java.lang.Object r9 = r10.a(r9, r0)     // Catch:{ IllegalStateException -> 0x010f }
            if (r9 != r1) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            ek.i r1 = ek.i.f20112a
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.n.a(xb.n, xb.q, ik.d):java.lang.Object");
    }

    public final void b(yb.b bVar) {
        boolean z10;
        yb.a aVar = yb.a.f17628a;
        b.a b10 = bVar.b();
        a.C0235a b11 = yb.a.b(b10);
        if (b11.f17631b != null) {
            Objects.toString(b10);
        } else {
            b11.f17631b = bVar;
            b11.f17630a.b((Object) null);
        }
        Objects.toString(bVar.b());
        bVar.a();
        q qVar = this.f17229c.f17258f;
        if (qVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (qVar != null) {
            bVar.c(new b.C0236b(qVar.f17244a));
        } else {
            j.l("currentSession");
            throw null;
        }
    }
}
