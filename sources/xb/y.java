package xb;

import al.a0;
import al.d0;
import al.e0;
import al.g0;
import ik.d;
import ik.f;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import xb.n;
import zb.g;

/* compiled from: SessionInitiator.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final z f17266a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17267b;

    /* renamed from: c  reason: collision with root package name */
    public final w f17268c;

    /* renamed from: d  reason: collision with root package name */
    public final g f17269d;

    /* renamed from: e  reason: collision with root package name */
    public final u f17270e;

    /* renamed from: f  reason: collision with root package name */
    public long f17271f;

    /* renamed from: g  reason: collision with root package name */
    public final x f17272g = new x(this);

    @e(c = "com.google.firebase.sessions.SessionInitiator$initiateSession$1", f = "SessionInitiator.kt", l = {63}, m = "invokeSuspend")
    /* compiled from: SessionInitiator.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17273a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f17274b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ q f17275c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y yVar, q qVar, d<? super a> dVar) {
            super(2, dVar);
            this.f17274b = yVar;
            this.f17275c = qVar;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f17274b, this.f17275c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f17273a;
            if (i10 == 0) {
                l0.Q0(obj);
                w wVar = this.f17274b.f17268c;
                q qVar = this.f17275c;
                this.f17273a = 1;
                if (wVar.a(qVar, this) == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                l0.Q0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ek.i.f20112a;
        }
    }

    public y(g0 g0Var, f fVar, n.a aVar, g gVar, u uVar) {
        this.f17266a = g0Var;
        this.f17267b = fVar;
        this.f17268c = aVar;
        this.f17269d = gVar;
        this.f17270e = uVar;
        this.f17271f = g0Var.g();
        a();
    }

    public final void a() {
        String str;
        u uVar = this.f17270e;
        int i10 = uVar.f17257e + 1;
        uVar.f17257e = i10;
        if (i10 == 0) {
            str = uVar.f17256d;
        } else {
            str = uVar.a();
        }
        q qVar = new q(str, uVar.f17256d, uVar.f17257e, uVar.f17254b.n());
        uVar.f17258f = qVar;
        l0.j0(e0.a(this.f17267b), (a0) null, new a(this, qVar, (d<? super a>) null), 3);
    }
}
