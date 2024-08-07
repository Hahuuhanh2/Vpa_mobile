package al;

import gl.c;
import ik.d;
import ik.e;
import ik.f;
import ik.g;
import rk.p;
import sk.k;
import sk.r;

/* compiled from: CoroutineContext.kt */
public final class y {

    /* compiled from: CoroutineContext.kt */
    public static final class a extends k implements p<f, f.b, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19106a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof x) {
                return fVar.plus(((x) bVar).x());
            }
            return fVar.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public static final class b extends k implements p<f, f.b, f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r<f> f19107a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f19108b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(r<f> rVar, boolean z10) {
            super(2);
            this.f19107a = rVar;
            this.f19108b = z10;
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof x)) {
                return fVar.plus(bVar);
            }
            if (((f) this.f19107a.f22931a).get(bVar.getKey()) == null) {
                x xVar = (x) bVar;
                if (this.f19108b) {
                    xVar = xVar.x();
                }
                return fVar.plus(xVar);
            }
            r<f> rVar = this.f19107a;
            rVar.f22931a = ((f) rVar.f22931a).minusKey(bVar.getKey());
            return fVar.plus(((x) bVar).S());
        }
    }

    public static final f a(f fVar, f fVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        z zVar = z.f19118a;
        boolean booleanValue = ((Boolean) fVar.fold(bool, zVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.fold(bool, zVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.plus(fVar2);
        }
        r rVar = new r();
        rVar.f22931a = fVar2;
        g gVar = g.f20653a;
        f fVar3 = (f) fVar.fold(gVar, new b(rVar, z10));
        if (booleanValue2) {
            rVar.f22931a = ((f) rVar.f22931a).fold(gVar, a.f19106a);
        }
        return fVar3.plus((f) rVar.f22931a);
    }

    public static final f b(d0 d0Var, f fVar) {
        f a10 = a(d0Var.s(), fVar, true);
        c cVar = r0.f19084a;
        if (a10 == cVar || a10.get(e.a.f20651a) != null) {
            return a10;
        }
        return a10.plus(cVar);
    }

    public static final d2<?> c(d<?> dVar, f fVar, Object obj) {
        boolean z10;
        d2<?> d2Var = null;
        if (!(dVar instanceof kk.d)) {
            return null;
        }
        if (fVar.get(e2.f19013a) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        kk.d dVar2 = (kk.d) dVar;
        while (true) {
            if (!(dVar2 instanceof o0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                if (dVar2 instanceof d2) {
                    d2Var = (d2) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (d2Var != null) {
            d2Var.m0(fVar, obj);
        }
        return d2Var;
    }
}
