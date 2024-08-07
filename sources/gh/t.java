package gh;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import mg.g4;
import r2.q;
import r2.w;
import r2.x;
import rk.l;
import s2.a;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: UnpaidCartFragment.kt */
public final class t extends c<g4> {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f20329o0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f20330m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ek.g f20331n0 = j7.a.b0(new g(this));

    /* compiled from: UnpaidCartFragment.kt */
    public static final class a implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f20332a;

        public a(l lVar) {
            this.f20332a = lVar;
        }

        public final ek.a<?> a() {
            return this.f20332a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20332a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f20332a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f20332a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class b extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20333a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20333a = fragment;
        }

        public final Object invoke() {
            return this.f20333a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f20334a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f20334a = bVar;
        }

        public final Object invoke() {
            return (x) this.f20334a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20335a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ek.c cVar) {
            super(0);
            this.f20335a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f20335a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20336a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f20336a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f20336a);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                return fVar.g();
            }
            return a.C0190a.f14602b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20337a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f20338b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, ek.c cVar) {
            super(0);
            this.f20337a = fragment;
            this.f20338b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f20338b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f20337a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    /* compiled from: UnpaidCartFragment.kt */
    public static final class g extends k implements rk.a<eh.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f20339a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(t tVar) {
            super(0);
            this.f20339a = tVar;
        }

        public final Object invoke() {
            return new eh.f(new x(this.f20339a));
        }
    }

    public t() {
        b bVar = new b(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new c(bVar));
        this.f20330m0 = j0.b(this, s.a(CartViewModel.class), new d(a02), new e(a02), new f(this, a02));
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        n0().f19600g.e(y(), new a(new p(this)));
        n0().f19607n.e(y(), new a(new r(this)));
        n0().f19609p.e(y(), new a(new s(this)));
        ((g4) i0()).f21079w.getRecyclerView().setAdapter(m0());
        ((g4) i0()).f21079w.setOnPullRefreshAction(new o(this));
        n0().d(CartStatus.NOT_PAID);
        kf.j.a(d0(), "Chưa có đơn hàng", "Vui lòng chọn biển số để thanh toán", C0531R$drawable.ic_notebook, (Integer) null, ((g4) i0()).f21079w.getEmptyStateView());
        m0().f20067q = new v(this);
        m0().f20068r = new w(this);
    }

    public final int j0() {
        return C0535R$layout.fragment_unpaid_cart;
    }

    public final eh.f m0() {
        return (eh.f) this.f20331n0.getValue();
    }

    public final CartViewModel n0() {
        return (CartViewModel) this.f20330m0.getValue();
    }
}
