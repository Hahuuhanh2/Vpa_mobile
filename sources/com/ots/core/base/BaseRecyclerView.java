package com.ots.core.base;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ots.core.R$layout;
import d2.e;
import d2.f;
import d2.l;
import ek.i;
import hf.z;
import java.util.List;
import sk.j;
import sk.k;

/* compiled from: BaseRecyclerView.kt */
public final class BaseRecyclerView extends RelativeLayout {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f8338p = 0;

    /* renamed from: a  reason: collision with root package name */
    public z f8339a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8340b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f8341c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f8342d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8343e = true;

    /* renamed from: f  reason: collision with root package name */
    public rk.a<i> f8344f = b.f8348a;

    /* renamed from: n  reason: collision with root package name */
    public rk.a<i> f8345n = a.f8347a;

    /* renamed from: o  reason: collision with root package name */
    public rk.a<i> f8346o = c.f8349a;

    /* compiled from: BaseRecyclerView.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8347a = new a();

        public a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* compiled from: BaseRecyclerView.kt */
    public static final class b extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8348a = new b();

        public b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* compiled from: BaseRecyclerView.kt */
    public static final class c extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8349a = new c();

        public c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRecyclerView(Context context) {
        super(context);
        j.f(context, "context");
        a(context);
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        l c10 = f.c((LayoutInflater) systemService, R$layout.widget_base_recycler_view, this, true, (e) null);
        j.e(c10, "inflate(...)");
        setBinding((z) c10);
        RecyclerView recyclerView = getBinding().f10824x;
        j.e(recyclerView, "recyclerView");
        setRecyclerView(recyclerView);
        LinearLayout linearLayout = getBinding().f10823w;
        j.e(linearLayout, "emptyStateView");
        setEmptyStateView(linearLayout);
        RecyclerView recyclerView2 = getRecyclerView();
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        getBinding().f10826z.setOnRefreshListener(new ea.c(this, 25));
        getBinding().f10824x.j(new ef.i(this));
    }

    public final void b(List<? extends Object> list) {
        j.f(list, "list");
        getBinding().f10826z.setRefreshing(false);
        new Handler(Looper.getMainLooper()).postDelayed(new oa.c(3, list, this), 500);
    }

    public final void c() {
        boolean z10;
        this.f8340b = false;
        q5.a aVar = getBinding().f10825y.f5013b;
        ValueAnimator valueAnimator = aVar.f14368e;
        if (valueAnimator != null) {
            if (valueAnimator == null || !valueAnimator.isStarted()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && aVar.getCallback() != null) {
                aVar.f14368e.start();
            }
        }
        ShimmerFrameLayout shimmerFrameLayout = getBinding().f10825y;
        j.e(shimmerFrameLayout, "shimmerViewContainer");
        shimmerFrameLayout.setVisibility(0);
        LinearLayout linearLayout = getBinding().f10823w;
        j.e(linearLayout, "emptyStateView");
        linearLayout.setVisibility(8);
        this.f8346o.invoke();
        new Handler(Looper.getMainLooper()).postDelayed(new fb.l(this, 3), 10);
    }

    public final z getBinding() {
        z zVar = this.f8339a;
        if (zVar != null) {
            return zVar;
        }
        j.l("binding");
        throw null;
    }

    public final LinearLayout getEmptyStateView() {
        LinearLayout linearLayout = this.f8342d;
        if (linearLayout != null) {
            return linearLayout;
        }
        j.l("emptyStateView");
        throw null;
    }

    public final boolean getOnLoadMore() {
        return this.f8340b;
    }

    public final rk.a<i> getOnLoadMoreAction() {
        return this.f8345n;
    }

    public final boolean getOnPullRefresh() {
        return this.f8343e;
    }

    public final rk.a<i> getOnPullRefreshAction() {
        return this.f8344f;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f8341c;
        if (recyclerView != null) {
            return recyclerView;
        }
        j.l("recyclerView");
        throw null;
    }

    public final rk.a<i> getSetClearAdapterAction() {
        return this.f8346o;
    }

    public final void setBinding(z zVar) {
        j.f(zVar, "<set-?>");
        this.f8339a = zVar;
    }

    public final void setEmptyStateView(LinearLayout linearLayout) {
        j.f(linearLayout, "<set-?>");
        this.f8342d = linearLayout;
    }

    public final void setOnLoadMore(boolean z10) {
        this.f8340b = z10;
    }

    public final void setOnLoadMoreAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8345n = aVar;
    }

    public final void setOnPullRefresh(boolean z10) {
        this.f8343e = z10;
    }

    public final void setOnPullRefreshAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8344f = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        j.f(recyclerView, "<set-?>");
        this.f8341c = recyclerView;
    }

    public final void setSetClearAdapterAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8346o = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context);
    }
}
