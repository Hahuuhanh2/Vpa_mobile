package f2;

import dl.d0;
import dl.f;
import dl.m;
import dl.z;
import f2.p;
import ik.d;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.q;

@e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
public final class t extends i implements p<f<Object>, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9868a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f9869b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9870c;

    @e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class a extends i implements p<a0<Object>, d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f9871a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a0<Object> f9872b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a0<Object> a0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f9872b = a0Var;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f9872b, dVar);
            aVar.f9871a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((a0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            a0<Object> a0Var = (a0) this.f9871a;
            a0<Object> a0Var2 = this.f9872b;
            boolean z10 = false;
            if (!(a0Var2 instanceof b) && !(a0Var2 instanceof i) && a0Var == a0Var2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(p<Object> pVar, d<? super t> dVar) {
        super(2, dVar);
        this.f9870c = pVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        t tVar = new t(this.f9870c, dVar);
        tVar.f9869b = obj;
        return tVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f9868a;
        if (i10 == 0) {
            l0.Q0(obj);
            f fVar = (f) this.f9869b;
            a0 a0Var = (a0) this.f9870c.f9816h.h();
            if (!(a0Var instanceof b)) {
                this.f9870c.f9818j.a(new p.a.C0104a(a0Var));
            }
            z zVar = this.f9870c.f9816h;
            a aVar2 = new a(a0Var, (d<? super a>) null);
            this.f9868a = 1;
            if (!(fVar instanceof d0)) {
                Object a10 = zVar.a(new m(new q(), new u(fVar), aVar2), this);
                if (a10 != aVar) {
                    a10 = ek.i.f20112a;
                }
                if (a10 != aVar) {
                    a10 = ek.i.f20112a;
                }
                if (a10 != aVar) {
                    a10 = ek.i.f20112a;
                }
                if (a10 == aVar) {
                    return aVar;
                }
            } else {
                ((d0) fVar).getClass();
                throw null;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
