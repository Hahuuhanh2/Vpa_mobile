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
import mg.p3;
import r2.q;
import r2.w;
import r2.x;
import rk.l;
import s2.a;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: PaidCartFragment.kt */
public final class h extends a<p3> {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f20299o0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f20300m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ek.g f20301n0 = j7.a.b0(new a(this));

    /* compiled from: PaidCartFragment.kt */
    public static final class a extends k implements rk.a<eh.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f20302a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(0);
            this.f20302a = hVar;
        }

        public final Object invoke() {
            return new eh.c(new g(this.f20302a));
        }
    }

    /* compiled from: PaidCartFragment.kt */
    public static final class b implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f20303a;

        public b(l lVar) {
            this.f20303a = lVar;
        }

        public final ek.a<?> a() {
            return this.f20303a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20303a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f20303a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f20303a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20304a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f20304a = fragment;
        }

        public final Object invoke() {
            return this.f20304a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f20305a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f20305a = cVar;
        }

        public final Object invoke() {
            return (x) this.f20305a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20306a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f20306a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f20306a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20307a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ek.c cVar) {
            super(0);
            this.f20307a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f20307a);
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
    public static final class g extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20308a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f20309b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, ek.c cVar) {
            super(0);
            this.f20308a = fragment;
            this.f20309b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f20309b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f20308a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public h() {
        c cVar = new c(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new d(cVar));
        this.f20300m0 = j0.b(this, s.a(CartViewModel.class), new e(a02), new f(a02), new g(this, a02));
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        m0().f19600g.e(y(), new b(new e(this)));
        m0().f19609p.e(y(), new b(new f(this)));
        ((p3) i0()).f21287w.getRecyclerView().setAdapter((eh.c) this.f20301n0.getValue());
        ((p3) i0()).f21287w.setOnPullRefreshAction(new d(this));
        m0().d(CartStatus.PAID);
        kf.j.a(d0(), "Chưa có đơn hàng", "Vui lòng chọn biển số để thanh toán", C0531R$drawable.ic_notebook, (Integer) null, ((p3) i0()).f21287w.getEmptyStateView());
    }

    public final int j0() {
        return C0535R$layout.fragment_paid_cart;
    }

    public final CartViewModel m0() {
        return (CartViewModel) this.f20300m0.getValue();
    }
}
