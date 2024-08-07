package el;

import al.g0;
import dl.f;
import ek.i;
import fk.h;
import ik.d;
import ik.f;
import ik.g;
import kk.c;
import rk.p;
import rk.q;
import sk.j;

/* compiled from: SafeCollector.kt */
public final class k<T> extends c implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f20152a;

    /* renamed from: b  reason: collision with root package name */
    public final ik.f f20153b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20154c;

    /* renamed from: d  reason: collision with root package name */
    public ik.f f20155d;

    /* renamed from: e  reason: collision with root package name */
    public d<? super i> f20156e;

    /* compiled from: SafeCollector.kt */
    public static final class a extends sk.k implements p<Integer, f.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20157a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    public k(dl.f<? super T> fVar, ik.f fVar2) {
        super(i.f20150a, g.f20653a);
        this.f20152a = fVar;
        this.f20153b = fVar2;
        this.f20154c = ((Number) fVar2.fold(0, a.f20157a)).intValue();
    }

    public final Object a(d<? super i> dVar, T t10) {
        ik.f context = dVar.getContext();
        g0.O(context);
        ik.f fVar = this.f20155d;
        if (fVar != context) {
            if (fVar instanceof g) {
                StringBuilder q10 = android.support.v4.media.a.q("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                q10.append(((g) fVar).f20148a);
                q10.append(", but then emission attempt of value '");
                q10.append(t10);
                q10.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(h.D0(q10.toString()).toString());
            } else if (((Number) context.fold(0, new m(this))).intValue() == this.f20154c) {
                this.f20155d = context;
            } else {
                StringBuilder q11 = android.support.v4.media.a.q("Flow invariant is violated:\n\t\tFlow was collected in ");
                q11.append(this.f20153b);
                q11.append(",\n\t\tbut emission happened in ");
                q11.append(context);
                q11.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(q11.toString().toString());
            }
        }
        this.f20156e = dVar;
        q<dl.f<Object>, Object, d<? super i>, Object> qVar = l.f20158a;
        dl.f<T> fVar2 = this.f20152a;
        j.d(fVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object d10 = qVar.d(fVar2, t10, this);
        if (!j.a(d10, jk.a.COROUTINE_SUSPENDED)) {
            this.f20156e = null;
        }
        return d10;
    }

    public final Object e(T t10, d<? super i> dVar) {
        try {
            Object a10 = a(dVar, t10);
            if (a10 == jk.a.COROUTINE_SUSPENDED) {
                return a10;
            }
            return i.f20112a;
        } catch (Throwable th2) {
            this.f20155d = new g(dVar.getContext(), th2);
            throw th2;
        }
    }

    public final kk.d getCallerFrame() {
        d<? super i> dVar = this.f20156e;
        if (dVar instanceof kk.d) {
            return (kk.d) dVar;
        }
        return null;
    }

    public final ik.f getContext() {
        ik.f fVar = this.f20155d;
        if (fVar == null) {
            return g.f20653a;
        }
        return fVar;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable a10 = ek.f.a(obj);
        if (a10 != null) {
            this.f20155d = new g(getContext(), a10);
        }
        d<? super i> dVar = this.f20156e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return jk.a.COROUTINE_SUSPENDED;
    }

    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
