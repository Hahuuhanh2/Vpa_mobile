package u3;

import cl.n;
import ik.d;
import java.util.Objects;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;
import sk.k;
import t3.b;
import v3.f;
import v3.g;

@e(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", l = {55}, m = "invokeSuspend")
/* compiled from: ContraintControllers.kt */
public final class c extends i implements p<cl.p<? super t3.b>, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15079a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15080b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d<Object> f15081c;

    /* compiled from: ContraintControllers.kt */
    public static final class a extends k implements rk.a<ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d<Object> f15082a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f15083b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, b bVar) {
            super(0);
            this.f15082a = dVar;
            this.f15083b = bVar;
        }

        public final Object invoke() {
            f<T> fVar = this.f15082a.f15086a;
            b bVar = this.f15083b;
            fVar.getClass();
            j.f(bVar, "listener");
            synchronized (fVar.f16021c) {
                if (fVar.f16022d.remove(bVar) && fVar.f16022d.isEmpty()) {
                    fVar.d();
                }
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: ContraintControllers.kt */
    public static final class b implements t3.a<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d<Object> f15084a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ cl.p<t3.b> f15085b;

        public b(d<Object> dVar, cl.p<? super t3.b> pVar) {
            this.f15084a = dVar;
            this.f15085b = pVar;
        }

        public final void a(Object obj) {
            Object obj2;
            if (this.f15084a.c(obj)) {
                obj2 = new b.C0193b(this.f15084a.a());
            } else {
                obj2 = b.a.f14803a;
            }
            this.f15085b.d().l(obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, d<? super c> dVar2) {
        super(2, dVar2);
        this.f15081c = dVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f15081c, dVar);
        cVar.f15080b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((cl.p) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f15079a;
        if (i10 == 0) {
            l0.Q0(obj);
            cl.p pVar = (cl.p) this.f15080b;
            d<Object> dVar = this.f15081c;
            b bVar = new b(dVar, pVar);
            f<T> fVar = dVar.f15086a;
            fVar.getClass();
            synchronized (fVar.f16021c) {
                if (fVar.f16022d.add(bVar)) {
                    if (fVar.f16022d.size() == 1) {
                        fVar.f16023e = fVar.a();
                        o3.j a10 = o3.j.a();
                        int i11 = g.f16024a;
                        Objects.toString(fVar.f16023e);
                        a10.getClass();
                        fVar.c();
                    }
                    bVar.a(fVar.f16023e);
                }
                ek.i iVar = ek.i.f20112a;
            }
            a aVar2 = new a(this.f15081c, bVar);
            this.f15079a = 1;
            if (n.a(pVar, aVar2, this) == aVar) {
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
