package w1;

import al.g0;
import android.view.View;
import android.view.ViewGroup;
import ek.i;
import ik.d;
import jk.a;
import kk.e;
import kk.h;
import p3.l0;
import rk.p;
import xk.f;
import xk.g;

@e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
/* compiled from: View.kt */
public final class m0 extends h implements p<g<? super View>, d<? super i>, Object> {

    /* renamed from: b  reason: collision with root package name */
    public int f16341b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f16342c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f16343d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(View view, d<? super m0> dVar) {
        super(dVar);
        this.f16343d = view;
    }

    public final d<i> create(Object obj, d<?> dVar) {
        m0 m0Var = new m0(this.f16343d, dVar);
        m0Var.f16342c = obj;
        return m0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((g) obj, (d) obj2)).invokeSuspend(i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f16341b;
        if (i10 != 0) {
            if (i10 == 1) {
                g gVar = (g) this.f16342c;
                l0.Q0(obj);
                View view = this.f16343d;
                if (view instanceof ViewGroup) {
                    k0 k0Var = new k0((ViewGroup) view, (d<? super k0>) null);
                    this.f16342c = null;
                    this.f16341b = 2;
                    gVar.getClass();
                    f fVar = new f();
                    fVar.f23497d = g0.K(fVar, fVar, k0Var);
                    Object b10 = gVar.b(fVar, this);
                    if (b10 != aVar) {
                        b10 = i.f20112a;
                    }
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
            } else if (i10 == 2) {
                l0.Q0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.f20112a;
        }
        l0.Q0(obj);
        g gVar2 = (g) this.f16342c;
        View view2 = this.f16343d;
        this.f16342c = gVar2;
        this.f16341b = 1;
        gVar2.a(view2, this);
        return aVar;
    }
}
