package zb;

import al.d0;
import al.e0;
import al.g0;
import al.i1;
import al.r0;
import al.y1;
import android.content.Context;
import f2.p;
import h2.c;
import ik.d;
import ik.f;
import java.util.List;
import rk.l;
import sk.j;
import sk.o;
import sk.s;
import wk.e;

/* compiled from: SessionsSettings.kt */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17933c = new a();
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final c f17934d;

    /* renamed from: a  reason: collision with root package name */
    public final j f17935a;

    /* renamed from: b  reason: collision with root package name */
    public final j f17936b;

    /* compiled from: SessionsSettings.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ e<Object>[] f17937a;

        static {
            o oVar = new o();
            s.f22932a.getClass();
            f17937a = new e[]{oVar};
        }
    }

    @kk.e(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {116, 117}, m = "updateSettings")
    /* compiled from: SessionsSettings.kt */
    public static final class b extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public g f17938a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f17939b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f17940c;

        /* renamed from: d  reason: collision with root package name */
        public int f17941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, d<? super b> dVar) {
            super(dVar);
            this.f17940c = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17939b = obj;
            this.f17941d |= Integer.MIN_VALUE;
            return this.f17940c.b(this);
        }
    }

    static {
        h2.a aVar = h2.a.f10533a;
        gl.b bVar = r0.f19085b;
        y1 y1Var = new y1((i1) null);
        bVar.getClass();
        fl.d a10 = e0.a(f.a.a(bVar, y1Var));
        j.f(aVar, "produceMigrations");
        f17934d = new c(aVar, a10);
    }

    public g(Context context, f fVar, f fVar2, ab.c cVar, xb.b bVar) {
        i2.c cVar2;
        i2.c cVar3;
        b bVar2 = new b(context);
        e eVar = new e(bVar, fVar);
        f17933c.getClass();
        c cVar4 = f17934d;
        e<Object> eVar2 = a.f17937a[0];
        cVar4.getClass();
        j.f(eVar2, "property");
        i2.c cVar5 = cVar4.f10540e;
        if (cVar5 == null) {
            synchronized (cVar4.f10539d) {
                if (cVar4.f10540e == null) {
                    Context applicationContext = context.getApplicationContext();
                    l<Context, List<f2.c<i2.e>>> lVar = cVar4.f10537b;
                    j.e(applicationContext, "applicationContext");
                    List invoke = lVar.invoke(applicationContext);
                    d0 d0Var = cVar4.f10538c;
                    h2.b bVar3 = new h2.b(applicationContext, cVar4);
                    j.f(invoke, "migrations");
                    j.f(d0Var, "scope");
                    cVar4.f10540e = new i2.c(new p(new i2.d(bVar3), j7.a.c0(new f2.d(invoke, (d<? super f2.d>) null)), new g0(), d0Var));
                }
                cVar3 = cVar4.f10540e;
                j.c(cVar3);
            }
            cVar2 = cVar3;
        } else {
            cVar2 = cVar5;
        }
        c cVar6 = new c(fVar2, cVar, bVar, eVar, cVar2);
        this.f17935a = bVar2;
        this.f17936b = cVar6;
    }

    public final double a() {
        boolean z10;
        Double d10 = this.f17935a.d();
        boolean z11 = true;
        if (d10 != null) {
            double doubleValue = d10.doubleValue();
            if (0.0d > doubleValue || doubleValue > 1.0d) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return doubleValue;
            }
        }
        Double d11 = this.f17936b.d();
        if (d11 != null) {
            double doubleValue2 = d11.doubleValue();
            if (0.0d > doubleValue2 || doubleValue2 > 1.0d) {
                z11 = false;
            }
            if (z11) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(ik.d<? super ek.i> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zb.g.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            zb.g$b r0 = (zb.g.b) r0
            int r1 = r0.f17941d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17941d = r1
            goto L_0x0018
        L_0x0013:
            zb.g$b r0 = new zb.g$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f17939b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17941d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p3.l0.Q0(r6)
            goto L_0x0057
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            zb.g r2 = r0.f17938a
            p3.l0.Q0(r6)
            goto L_0x0049
        L_0x0038:
            p3.l0.Q0(r6)
            zb.j r6 = r5.f17935a
            r0.f17938a = r5
            r0.f17941d = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r2 = r5
        L_0x0049:
            zb.j r6 = r2.f17936b
            r2 = 0
            r0.f17938a = r2
            r0.f17941d = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            ek.i r6 = ek.i.f20112a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.g.b(ik.d):java.lang.Object");
    }
}
