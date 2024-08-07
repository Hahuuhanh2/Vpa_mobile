package wg;

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
import com.google.android.material.button.MaterialButton;
import com.ots.core.R$dimen;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import java.util.WeakHashMap;
import lf.i;
import mg.c3;
import p3.l0;
import r2.w;
import r2.x;
import rk.l;
import s2.a;
import sk.j;
import sk.k;
import sk.s;
import tg.q;
import w1.d0;
import w1.q0;

/* compiled from: AuctionFragment.kt */
public final class b extends n<c3> {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f23380q0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f23381m0;

    /* renamed from: n0  reason: collision with root package name */
    public i f23382n0;

    /* renamed from: o0  reason: collision with root package name */
    public PriceTable f23383o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ek.g f23384p0 = j7.a.b0(a.f23385a);

    /* compiled from: AuctionFragment.kt */
    public static final class a extends k implements rk.a<q> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23385a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new q(a.f23379a);
        }
    }

    /* renamed from: wg.b$b  reason: collision with other inner class name */
    /* compiled from: AuctionFragment.kt */
    public static final class C0314b implements r2.q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f23386a;

        public C0314b(l lVar) {
            this.f23386a = lVar;
        }

        public final ek.a<?> a() {
            return this.f23386a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f23386a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof r2.q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f23386a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f23386a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f23387a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f23387a = fragment;
        }

        public final Object invoke() {
            return this.f23387a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f23388a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f23388a = cVar;
        }

        public final Object invoke() {
            return (x) this.f23388a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f23389a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ek.c cVar) {
            super(0);
            this.f23389a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f23389a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f23390a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ek.c cVar) {
            super(0);
            this.f23390a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f23390a);
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
        public final /* synthetic */ Fragment f23391a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f23392b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, ek.c cVar) {
            super(0);
            this.f23391a = fragment;
            this.f23392b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f23392b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f23391a.f();
            j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public b() {
        c cVar = new c(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new d(cVar));
        this.f23381m0 = j0.b(this, s.a(AuctionRoomViewModel.class), new e(a02), new f(a02), new g(this, a02));
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof i) {
            this.f23382n0 = (i) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    public final void O() {
        this.J = true;
    }

    public final void S() {
        this.J = true;
        AuctionRoomViewModel n02 = n0();
        l0.j0(l0.d0(n02), r0.f19085b, new xg.d(n02, (ik.d<? super xg.d>) null), 2);
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        ea.c cVar = new ea.c(this, 26);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(view, cVar);
        ((c3) i0()).A.v(n0());
        ((c3) i0()).f21007z.getRecyclerView().setAdapter(m0());
        RecyclerView recyclerView = ((c3) i0()).f21007z.getRecyclerView();
        q m02 = m0();
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
        ((c3) i0()).f21007z.setOnPullRefreshAction(new d(this));
        ((c3) i0()).f21007z.setOnLoadMoreAction(e.f23396a);
        m0().f23007r = new f(this);
        n0().f19439n.e(y(), new C0314b(new g(this)));
        n0().f19435j.e(y(), new C0314b(new h(this)));
        n0().f19433h.e(y(), new C0314b(new i(this)));
        n0().f19437l.e(y(), new C0314b(new j(this)));
        kf.j.a(d0(), "Không có phòng đấu giá", "Rất tiếc! Hiện tại chưa có phòng đấu giá nào đang diễn ra", C0531R$drawable.ic_notebook, (Integer) null, ((c3) i0()).f21007z.getEmptyStateView());
        m0().f23006q = new k(this);
        MaterialButton materialButton = ((c3) i0()).A.f21366x;
        j.e(materialButton, "btnLogin");
        materialButton.setOnClickListener(new kf.b(200, materialButton, new l(this)));
        AuctionRoomViewModel n02 = n0();
        l0.j0(l0.d0(n02), r0.f19085b, new xg.d(n02, (ik.d<? super xg.d>) null), 2);
    }

    public final int j0() {
        return C0535R$layout.fragment_auction;
    }

    public final q m0() {
        return (q) this.f23384p0.getValue();
    }

    public final AuctionRoomViewModel n0() {
        return (AuctionRoomViewModel) this.f23381m0.getValue();
    }
}
