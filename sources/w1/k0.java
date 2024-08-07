package w1;

import android.view.View;
import android.view.ViewGroup;
import ek.i;
import ik.d;
import kk.e;
import kk.h;
import rk.p;
import xk.g;

@e(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
/* compiled from: ViewGroup.kt */
public final class k0 extends h implements p<g<? super View>, d<? super i>, Object> {

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f16327b;

    /* renamed from: c  reason: collision with root package name */
    public View f16328c;

    /* renamed from: d  reason: collision with root package name */
    public int f16329d;

    /* renamed from: e  reason: collision with root package name */
    public int f16330e;

    /* renamed from: f  reason: collision with root package name */
    public int f16331f;

    /* renamed from: n  reason: collision with root package name */
    public /* synthetic */ Object f16332n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16333o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(ViewGroup viewGroup, d<? super k0> dVar) {
        super(dVar);
        this.f16333o = viewGroup;
    }

    public final d<i> create(Object obj, d<?> dVar) {
        k0 k0Var = new k0(this.f16333o, dVar);
        k0Var.f16332n = obj;
        return k0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((g) obj, (d) obj2)).invokeSuspend(i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r12.f16331f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            int r1 = r12.f16330e
            int r4 = r12.f16329d
            android.view.ViewGroup r5 = r12.f16327b
            java.lang.Object r6 = r12.f16332n
            xk.g r6 = (xk.g) r6
            p3.l0.Q0(r13)
            r13 = r12
            goto L_0x009a
        L_0x001c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0024:
            int r1 = r12.f16330e
            int r4 = r12.f16329d
            android.view.View r5 = r12.f16328c
            android.view.ViewGroup r6 = r12.f16327b
            java.lang.Object r7 = r12.f16332n
            xk.g r7 = (xk.g) r7
            p3.l0.Q0(r13)
            r13 = r12
            goto L_0x0064
        L_0x0035:
            p3.l0.Q0(r13)
            java.lang.Object r13 = r12.f16332n
            xk.g r13 = (xk.g) r13
            android.view.ViewGroup r1 = r12.f16333o
            r4 = 0
            int r5 = r1.getChildCount()
            r6 = r12
        L_0x0044:
            if (r4 >= r5) goto L_0x00a7
            android.view.View r7 = r1.getChildAt(r4)
            r6.f16332n = r13
            r6.f16327b = r1
            r6.f16328c = r7
            r6.f16329d = r4
            r6.f16330e = r5
            r6.f16331f = r3
            r13.a(r7, r6)
            jk.a r8 = jk.a.COROUTINE_SUSPENDED
            if (r8 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r5
            r5 = r10
        L_0x0064:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00a1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            w1.k0 r8 = new w1.k0
            r9 = 0
            r8.<init>(r5, r9)
            r13.f16332n = r7
            r13.f16327b = r6
            r13.f16328c = r9
            r13.f16329d = r4
            r13.f16330e = r1
            r13.f16331f = r2
            r7.getClass()
            xk.f r5 = new xk.f
            r5.<init>()
            ik.d r8 = al.g0.K(r5, r5, r8)
            r5.f23497d = r8
            java.lang.Object r5 = r7.b(r5, r13)
            jk.a r8 = jk.a.COROUTINE_SUSPENDED
            if (r5 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            ek.i r5 = ek.i.f20112a
        L_0x0095:
            if (r5 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r5 = r6
            r6 = r7
        L_0x009a:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto L_0x00a5
        L_0x00a1:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        L_0x00a5:
            int r4 = r4 + r3
            goto L_0x0044
        L_0x00a7:
            ek.i r13 = ek.i.f20112a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
