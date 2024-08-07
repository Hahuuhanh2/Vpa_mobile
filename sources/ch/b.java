package ch;

import al.r0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c0.q0;
import com.ots.core.R$dimen;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import java.util.WeakHashMap;
import lf.i;
import mg.e3;
import p3.l0;
import r2.q;
import r2.w;
import r2.x;
import rk.l;
import s2.a;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;

/* compiled from: AwaitAuctionFragment.kt */
public final class b extends i<e3> {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f19177q0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f19178m0;

    /* renamed from: n0  reason: collision with root package name */
    public i f19179n0;

    /* renamed from: o0  reason: collision with root package name */
    public lg.b f19180o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ek.g f19181p0 = j7.a.b0(a.f19182a);

    /* compiled from: AwaitAuctionFragment.kt */
    public static final class a extends k implements rk.a<tg.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19182a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new tg.g(a.f19176a);
        }
    }

    /* renamed from: ch.b$b  reason: collision with other inner class name */
    /* compiled from: AwaitAuctionFragment.kt */
    public static final class C0257b implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19183a;

        public C0257b(l lVar) {
            this.f19183a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19183a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19183a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19183a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19183a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f19184a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19184a = fragment;
        }

        public final Object invoke() {
            return this.f19184a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f19185a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f19185a = cVar;
        }

        public final Object invoke() {
            return (x) this.f19185a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19186a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f19186a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f19186a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19187a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ek.c cVar) {
            super(0);
            this.f19187a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f19187a);
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
        public final /* synthetic */ Fragment f19188a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f19189b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, ek.c cVar) {
            super(0);
            this.f19188a = fragment;
            this.f19189b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f19189b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f19188a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public b() {
        c cVar = new c(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new d(cVar));
        this.f19178m0 = j0.b(this, s.a(AuctionViewModel.class), new e(a02), new f(a02), new g(this, a02));
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof i) {
            this.f19179n0 = (i) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    public final void O() {
        this.J = true;
        this.f19179n0 = null;
    }

    public final void W(View view, Bundle bundle) {
        boolean z10;
        j.f(view, "view");
        q0 q0Var = new q0(this, 17);
        WeakHashMap<View, w1.q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(view, q0Var);
        n0().f19392m.e(y(), new C0257b(new f(this)));
        n0().f19394o.e(y(), new C0257b(new g(this)));
        lg.b bVar = this.f19180o0;
        if (bVar != null) {
            if (bVar.a().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                AuctionViewModel n02 = n0();
                l0.j0(l0.d0(n02), r0.f19085b, new rg.d(n02, (ik.d<? super rg.d>) null), 2);
            }
            ((e3) i0()).f21043x.getRecyclerView().setAdapter(m0());
            RecyclerView recyclerView = ((e3) i0()).f21043x.getRecyclerView();
            tg.g m02 = m0();
            int dimensionPixelSize = w().getDimensionPixelSize(R$dimen.dp_8);
            j.f(recyclerView, "view");
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(2));
            recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
            RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
            j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((androidx.recyclerview.widget.w) itemAnimator).f3302g = false;
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(m02);
            recyclerView.i(new kf.i(2, dimensionPixelSize));
            ((e3) i0()).f21043x.setOnPullRefreshAction(new c(this));
            m0().f22982q = new d(this);
            m0().f22983r = new e(this);
            ((e3) i0()).f21043x.b(m0().f9444f);
            kf.j.a(d0(), "Không có kết quả", "Chưa có biển số nào", C0531R$drawable.ic_whitebox, (Integer) null, ((e3) i0()).f21043x.getEmptyStateView());
            return;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }

    public final int j0() {
        return C0535R$layout.fragment_await_auction;
    }

    public final tg.g m0() {
        return (tg.g) this.f19181p0.getValue();
    }

    public final AuctionViewModel n0() {
        return (AuctionViewModel) this.f19178m0.getValue();
    }
}
