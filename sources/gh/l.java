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
import s2.a;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: RefundCartFragment.kt */
public final class l extends b<g4> {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f20312o0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f20313m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ek.g f20314n0 = j7.a.b0(g.f20322a);

    /* compiled from: RefundCartFragment.kt */
    public static final class a implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f20315a;

        public a(k kVar) {
            this.f20315a = kVar;
        }

        public final ek.a<?> a() {
            return this.f20315a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20315a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f20315a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f20315a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class b extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20316a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20316a = fragment;
        }

        public final Object invoke() {
            return this.f20316a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f20317a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f20317a = bVar;
        }

        public final Object invoke() {
            return (x) this.f20317a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20318a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ek.c cVar) {
            super(0);
            this.f20318a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f20318a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20319a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f20319a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f20319a);
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
        public final /* synthetic */ Fragment f20320a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f20321b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, ek.c cVar) {
            super(0);
            this.f20320a = fragment;
            this.f20321b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f20321b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f20320a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    /* compiled from: RefundCartFragment.kt */
    public static final class g extends k implements rk.a<eh.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f20322a = new g();

        public g() {
            super(0);
        }

        public final Object invoke() {
            return new eh.e(m.f20323a);
        }
    }

    public l() {
        b bVar = new b(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new c(bVar));
        this.f20313m0 = j0.b(this, s.a(CartViewModel.class), new d(a02), new e(a02), new f(this, a02));
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        m0().f19600g.e(y(), new a(new k(this)));
        ((g4) i0()).f21079w.getRecyclerView().setAdapter((eh.e) this.f20314n0.getValue());
        ((g4) i0()).f21079w.setOnPullRefreshAction(new j(this));
        m0().d(CartStatus.REFUND);
        kf.j.a(d0(), "Chưa có đơn hàng", "Vui lòng chọn biển số để thanh toán", C0531R$drawable.ic_notebook, (Integer) null, ((g4) i0()).f21079w.getEmptyStateView());
    }

    public final int j0() {
        return C0535R$layout.fragment_unpaid_cart;
    }

    public final CartViewModel m0() {
        return (CartViewModel) this.f20313m0.getValue();
    }
}
