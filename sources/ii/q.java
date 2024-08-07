package ii;

import al.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import mg.r3;
import nh.x0;
import nh.y0;
import p3.l0;
import q.rorbin.badgeview.QBadgeView;
import r2.w;
import r2.x;
import rk.p;
import s2.a;
import sk.s;

/* compiled from: RegisterAuctionFragment.kt */
public final class q extends c<r3> {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f20604x0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f20605m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f20606n0 = "REGISTER_AUCTION";

    /* renamed from: o0  reason: collision with root package name */
    public String f20607o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    public lg.b f20608p0;

    /* renamed from: q0  reason: collision with root package name */
    public QBadgeView f20609q0;

    /* renamed from: r0  reason: collision with root package name */
    public QBadgeView f20610r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ek.g f20611s0 = j7.a.b0(g.f20622a);

    /* renamed from: t0  reason: collision with root package name */
    public final ek.g f20612t0 = j7.a.b0(h.f20623a);

    /* renamed from: u0  reason: collision with root package name */
    public final ek.g f20613u0 = j7.a.b0(i.f20624a);

    /* renamed from: v0  reason: collision with root package name */
    public gf.b f20614v0;

    /* renamed from: w0  reason: collision with root package name */
    public gf.b f20615w0;

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class a extends sk.k implements p<AwaitAuction, String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20616a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(2);
            this.f20616a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            AwaitAuction awaitAuction = (AwaitAuction) obj;
            String str = (String) obj2;
            sk.j.f(awaitAuction, "item");
            sk.j.f(str, "action");
            q qVar = this.f20616a;
            qVar.f20606n0 = str;
            q.m0(qVar, awaitAuction.getId());
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class b extends sk.k implements p<AwaitAuction, String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20617a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(q qVar) {
            super(2);
            this.f20617a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            AwaitAuction awaitAuction = (AwaitAuction) obj;
            String str = (String) obj2;
            sk.j.f(awaitAuction, "item");
            sk.j.f(str, "action");
            q qVar = this.f20617a;
            qVar.f20606n0 = str;
            q.m0(qVar, awaitAuction.getId());
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class c extends sk.k implements p<AwaitAuction, String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20618a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(q qVar) {
            super(2);
            this.f20618a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            AwaitAuction awaitAuction = (AwaitAuction) obj;
            String str = (String) obj2;
            sk.j.f(awaitAuction, "item");
            sk.j.f(str, "action");
            q qVar = this.f20618a;
            qVar.f20606n0 = str;
            q.m0(qVar, awaitAuction.getId());
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class d extends sk.k implements p<Boolean, AwaitAuction, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20619a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(q qVar) {
            super(2);
            this.f20619a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AwaitAuction awaitAuction = (AwaitAuction) obj2;
            sk.j.f(awaitAuction, "item");
            if (ze.b.l(this.f20619a.d0(), this.f20619a.n0())) {
                HomeViewModel o02 = this.f20619a.o0();
                String id2 = awaitAuction.getId();
                if (id2 == null) {
                    id2 = "";
                }
                o02.d(id2, booleanValue);
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class e extends sk.k implements p<Boolean, AwaitAuction, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20620a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(q qVar) {
            super(2);
            this.f20620a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AwaitAuction awaitAuction = (AwaitAuction) obj2;
            sk.j.f(awaitAuction, "item");
            if (ze.b.l(this.f20620a.d0(), this.f20620a.n0())) {
                HomeViewModel o02 = this.f20620a.o0();
                String id2 = awaitAuction.getId();
                if (id2 == null) {
                    id2 = "";
                }
                o02.d(id2, booleanValue);
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class f extends sk.k implements p<Boolean, AwaitAuction, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f20621a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(q qVar) {
            super(2);
            this.f20621a = qVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AwaitAuction awaitAuction = (AwaitAuction) obj2;
            sk.j.f(awaitAuction, "item");
            if (ze.b.l(this.f20621a.d0(), this.f20621a.n0())) {
                HomeViewModel o02 = this.f20621a.o0();
                String id2 = awaitAuction.getId();
                if (id2 == null) {
                    id2 = "";
                }
                o02.d(id2, booleanValue);
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class g extends sk.k implements rk.a<tg.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f20622a = new g();

        public g() {
            super(0);
        }

        public final Object invoke() {
            return new tg.m(r.f20632a);
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class h extends sk.k implements rk.a<tg.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f20623a = new h();

        public h() {
            super(0);
        }

        public final Object invoke() {
            return new tg.m(s.f20633a);
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class i extends sk.k implements rk.a<tg.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f20624a = new i();

        public i() {
            super(0);
        }

        public final Object invoke() {
            return new tg.m(t.f20634a);
        }
    }

    /* compiled from: RegisterAuctionFragment.kt */
    public static final class j implements r2.q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f20625a;

        public j(rk.l lVar) {
            this.f20625a = lVar;
        }

        public final ek.a<?> a() {
            return this.f20625a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20625a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof r2.q) || !(obj instanceof sk.f)) {
                return false;
            }
            return sk.j.a(this.f20625a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f20625a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class k extends sk.k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20626a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f20626a = fragment;
        }

        public final Object invoke() {
            return this.f20626a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class l extends sk.k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f20627a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f20627a = kVar;
        }

        public final Object invoke() {
            return (x) this.f20627a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class m extends sk.k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20628a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(ek.c cVar) {
            super(0);
            this.f20628a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f20628a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class n extends sk.k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f20629a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(ek.c cVar) {
            super(0);
            this.f20629a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f20629a);
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
    public static final class o extends sk.k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f20630a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f20631b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment, ek.c cVar) {
            super(0);
            this.f20630a = fragment;
            this.f20631b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f20631b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f20630a.f();
            sk.j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public q() {
        k kVar = new k(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new l(kVar));
        this.f20605m0 = j0.b(this, s.a(HomeViewModel.class), new m(a02), new n(a02), new o(this, a02));
        Z(new ef.a(this, 6), new g.d());
    }

    public static final void m0(q qVar, String str) {
        if (ze.b.l(qVar.d0(), qVar.n0())) {
            qVar.o0().j(str);
        }
    }

    public final void S() {
        String str;
        this.J = true;
        User e10 = n0().e();
        if (e10 != null) {
            str = e10.getId();
        } else {
            str = null;
        }
        if (str != null) {
            o0().i();
            o0().h();
            HomeViewModel.f(o0(), (String) null, 7);
        }
    }

    public final void W(View view, Bundle bundle) {
        sk.j.f(view, "view");
        o0().f19725w.e(y(), new j(new u(this)));
        o0().f19727y.e(y(), new j(new v(this)));
        o0().A.e(y(), new j(new w(this)));
        o0().f19719q.e(y(), new j(new x(this)));
        o0().f19721s.e(y(), new j(new z(this)));
        o0().E.e(y(), new j(new a0(this)));
        o0().f19715m.e(y(), new j(new b0(this)));
        ImageView imageView = ((r3) i0()).f21328y;
        sk.j.e(imageView, "btnNotify");
        this.f20609q0 = p0(imageView);
        ImageView imageView2 = ((r3) i0()).f21326w;
        sk.j.e(imageView2, "btnCart");
        this.f20610r0 = p0(imageView2);
        o0().f19717o.e(y(), new j(new c0(this)));
        o0().g((String) null);
        HomeViewModel o02 = o0();
        al.d0 d02 = l0.d0(o02);
        gl.b bVar = r0.f19085b;
        l0.j0(d02, bVar, new x0(o02, (String) null, (ik.d<? super x0>) null), 2);
        HomeViewModel o03 = o0();
        l0.j0(l0.d0(o03), bVar, new y0(o03, (String) null, (ik.d<? super y0>) null), 2);
        ((r3) i0()).C.setAdapter((tg.m) this.f20611s0.getValue());
        ((r3) i0()).E.setAdapter((tg.m) this.f20612t0.getValue());
        ((r3) i0()).D.setAdapter((tg.m) this.f20613u0.getValue());
        RecyclerView recyclerView = ((r3) i0()).C;
        recyclerView.setAdapter((tg.m) this.f20611s0.getValue());
        d0();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        RecyclerView recyclerView2 = ((r3) i0()).E;
        recyclerView2.setAdapter((tg.m) this.f20612t0.getValue());
        d0();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        RecyclerView recyclerView3 = ((r3) i0()).D;
        recyclerView3.setAdapter((tg.m) this.f20613u0.getValue());
        d0();
        recyclerView3.setLayoutManager(new LinearLayoutManager(0));
        ((tg.m) this.f20611s0.getValue()).f22998s = new d(this);
        ((tg.m) this.f20612t0.getValue()).f22998s = new e(this);
        ((tg.m) this.f20613u0.getValue()).f22998s = new f(this);
        ((r3) i0()).G.setOnClickListener(new n(this, 0));
        ((r3) i0()).H.setOnClickListener(new o(this, 0));
        ((r3) i0()).I.setOnClickListener(new p(this, 0));
        ((r3) i0()).f21328y.setOnClickListener(new n(this, 1));
        ((r3) i0()).f21326w.setOnClickListener(new o(this, 1));
        ((tg.m) this.f20611s0.getValue()).f22997r = new a(this);
        ((tg.m) this.f20612t0.getValue()).f22997r = new b(this);
        ((tg.m) this.f20613u0.getValue()).f22997r = new c(this);
        ((r3) i0()).F.setOnClickListener(new p(this, 1));
        ((r3) i0()).f21327x.setOnClickListener(new n(this, 2));
    }

    public final int j0() {
        return C0535R$layout.fragment_register_auction;
    }

    public final lg.b n0() {
        lg.b bVar = this.f20608p0;
        if (bVar != null) {
            return bVar;
        }
        sk.j.l("sharedPrefsHelper");
        throw null;
    }

    public final HomeViewModel o0() {
        return (HomeViewModel) this.f20605m0.getValue();
    }

    public final QBadgeView p0(ImageView imageView) {
        try {
            String valueOf = String.valueOf(0);
            QBadgeView qBadgeView = new QBadgeView(r());
            qBadgeView.a(imageView);
            qBadgeView.f(valueOf);
            qBadgeView.g();
            return qBadgeView;
        } catch (Exception unused) {
            return null;
        }
    }
}
