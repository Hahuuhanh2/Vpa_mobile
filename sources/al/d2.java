package al;

import ek.e;
import ek.i;
import fl.r;
import fl.v;
import ik.d;
import ik.f;
import p3.l0;

/* compiled from: CoroutineContext.kt */
public final class d2<T> extends r<T> {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal<e<f, Object>> f19009e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d2(ik.d r3, ik.f r4) {
        /*
            r2 = this;
            al.e2 r0 = al.e2.f19013a
            ik.f$b r1 = r4.get(r0)
            if (r1 != 0) goto L_0x000d
            ik.f r0 = r4.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f19009e = r0
            ik.f r3 = r3.getContext()
            ik.e$a r0 = ik.e.a.f20651a
            ik.f$b r3 = r3.get(r0)
            boolean r3 = r3 instanceof al.a0
            if (r3 != 0) goto L_0x0031
            r3 = 0
            java.lang.Object r3 = fl.v.b(r4, r3)
            fl.v.a(r4, r3)
            r2.m0(r4, r3)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d2.<init>(ik.d, ik.f):void");
    }

    public final void h0(Object obj) {
        if (this.threadLocalIsSet) {
            e eVar = this.f19009e.get();
            if (eVar != null) {
                v.a((f) eVar.f20102a, eVar.f20103b);
            }
            this.f19009e.remove();
        }
        Object x02 = l0.x0(obj);
        d<T> dVar = this.f20259d;
        f context = dVar.getContext();
        d2<?> d2Var = null;
        Object b10 = v.b(context, d2Var);
        if (b10 != v.f20264a) {
            d2Var = y.c(dVar, context, b10);
        }
        try {
            this.f20259d.resumeWith(x02);
            i iVar = i.f20112a;
        } finally {
            if (d2Var == null || d2Var.l0()) {
                v.a(context, b10);
            }
        }
    }

    public final boolean l0() {
        boolean z10;
        if (!this.threadLocalIsSet || this.f19009e.get() != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f19009e.remove();
        return !z10;
    }

    public final void m0(f fVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f19009e.set(new e(fVar, obj));
    }
}
