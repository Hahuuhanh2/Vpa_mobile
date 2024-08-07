package ul;

import al.g0;
import al.l;
import ik.d;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* compiled from: HttpServiceMethod */
public abstract class i<ResponseT, ReturnT> extends a0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final x f23114a;

    /* renamed from: b  reason: collision with root package name */
    public final Call.Factory f23115b;

    /* renamed from: c  reason: collision with root package name */
    public final f<ResponseBody, ResponseT> f23116c;

    /* compiled from: HttpServiceMethod */
    public static final class a<ResponseT, ReturnT> extends i<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f23117d;

        public a(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(xVar, factory, fVar);
            this.f23117d = cVar;
        }

        public final Object c(q qVar, Object[] objArr) {
            return this.f23117d.b(qVar);
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class b<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f23118d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f23119e = false;

        public b(x xVar, Call.Factory factory, f fVar, c cVar) {
            super(xVar, factory, fVar);
            this.f23118d = cVar;
        }

        public final Object c(q qVar, Object[] objArr) {
            b bVar = (b) this.f23118d.b(qVar);
            d dVar = objArr[objArr.length - 1];
            try {
                if (this.f23119e) {
                    l lVar = new l(1, g0.b0(dVar));
                    lVar.v(new l(bVar));
                    bVar.k0(new m(lVar));
                    Object s10 = lVar.s();
                    jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                    return s10;
                }
                l lVar2 = new l(1, g0.b0(dVar));
                lVar2.v(new k(bVar));
                bVar.k0(new jl.b(lVar2));
                Object s11 = lVar2.s();
                jk.a aVar2 = jk.a.COROUTINE_SUSPENDED;
                return s11;
            } catch (Exception e10) {
                return p.a(e10, dVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class c<ResponseT> extends i<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f23120d;

        public c(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(xVar, factory, fVar);
            this.f23120d = cVar;
        }

        public final Object c(q qVar, Object[] objArr) {
            b bVar = (b) this.f23120d.b(qVar);
            d dVar = objArr[objArr.length - 1];
            try {
                l lVar = new l(1, g0.b0(dVar));
                lVar.v(new n(bVar));
                bVar.k0(new o(lVar));
                Object s10 = lVar.s();
                jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                return s10;
            } catch (Exception e10) {
                return p.a(e10, dVar);
            }
        }
    }

    public i(x xVar, Call.Factory factory, f<ResponseBody, ResponseT> fVar) {
        this.f23114a = xVar;
        this.f23115b = factory;
        this.f23116c = fVar;
    }

    public final ReturnT a(Object[] objArr) {
        return c(new q(this.f23114a, objArr, this.f23115b, this.f23116c), objArr);
    }

    public abstract Object c(q qVar, Object[] objArr);
}
