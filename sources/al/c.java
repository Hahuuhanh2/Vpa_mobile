package al;

import ek.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sk.j;

/* compiled from: Await.kt */
public final class c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18994b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");

    /* renamed from: a  reason: collision with root package name */
    public final j0<T>[] f18995a;
    private volatile int notCompletedCount;

    /* compiled from: Await.kt */
    public final class a extends l1 {

        /* renamed from: o  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f18996o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e  reason: collision with root package name */
        public final k<List<? extends T>> f18997e;

        /* renamed from: f  reason: collision with root package name */
        public t0 f18998f;

        public a(l lVar) {
            this.f18997e = lVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m((Throwable) obj);
            return i.f20112a;
        }

        public final void m(Throwable th2) {
            if (th2 != null) {
                u9.b i10 = this.f18997e.i(th2);
                if (i10 != null) {
                    this.f18997e.n(i10);
                    b bVar = (b) f18996o.get(this);
                    if (bVar != null) {
                        bVar.i();
                    }
                }
            } else if (c.f18994b.decrementAndGet(c.this) == 0) {
                k<List<? extends T>> kVar = this.f18997e;
                j0<T>[] j0VarArr = c.this.f18995a;
                ArrayList arrayList = new ArrayList(j0VarArr.length);
                for (j0<T> completed : j0VarArr) {
                    arrayList.add(completed.getCompleted());
                }
                kVar.resumeWith(arrayList);
            }
        }
    }

    /* compiled from: Await.kt */
    public final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        public final c<T>.a[] f19000a;

        public b(a[] aVarArr) {
            this.f19000a = aVarArr;
        }

        public final void h(Throwable th2) {
            i();
        }

        public final void i() {
            c<T>.a[] aVarArr = this.f19000a;
            int length = aVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                t0 t0Var = aVarArr[i10].f18998f;
                if (t0Var != null) {
                    t0Var.b();
                    i10++;
                } else {
                    j.l("handle");
                    throw null;
                }
            }
        }

        public final Object invoke(Object obj) {
            Throwable th2 = (Throwable) obj;
            i();
            return i.f20112a;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("DisposeHandlersOnCancel[");
            q10.append(this.f19000a);
            q10.append(']');
            return q10.toString();
        }
    }

    public c(j0<? extends T>[] j0VarArr) {
        this.f18995a = j0VarArr;
        this.notCompletedCount = j0VarArr.length;
    }
}
