package com.vpa.daugia.module.auction.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.history.HistoryViewModel;
import mg.g;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: AuctionProgressActivity.kt */
public final class AuctionProgressActivity extends Hilt_AuctionProgressActivity<g> {
    public static final /* synthetic */ int V = 0;
    public final d0 R = new d0(s.a(HistoryViewModel.class), new d(this), new c(this), new e(this));
    public lg.b S;
    public long T;
    public final ek.g U = j7.a.b0(new a(this));

    /* compiled from: AuctionProgressActivity.kt */
    public static final class a extends k implements rk.a<tg.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionProgressActivity f19403a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionProgressActivity auctionProgressActivity) {
            super(0);
            this.f19403a = auctionProgressActivity;
        }

        public final Object invoke() {
            lg.b bVar = this.f19403a.S;
            if (bVar != null) {
                return new tg.b(bVar, a.f19424a);
            }
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    /* compiled from: AuctionProgressActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19404a;

        public b(sg.c cVar) {
            this.f19404a = cVar;
        }

        public final ek.a<?> a() {
            return this.f19404a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19404a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19404a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19404a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19405a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19405a = componentActivity;
        }

        public final Object invoke() {
            return this.f19405a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19406a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19406a = componentActivity;
        }

        public final Object invoke() {
            return this.f19406a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19407a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19407a = componentActivity;
        }

        public final Object invoke() {
            return this.f19407a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_progress;
    }

    public final tg.b T() {
        return (tg.b) this.U.getValue();
    }

    public final HistoryViewModel U() {
        return (HistoryViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || (string = extras.getString("DATA_AUCTION")) == null)) {
            this.T = Long.parseLong(string);
        }
        ((AppTextView) ((g) M()).f21067y.f10530d).setText("diễn biến đấu giá");
        U().f19643k.e(this, new b(new sg.c(this)));
        ((g) M()).f21066x.getRecyclerView().setAdapter(T());
        ((g) M()).f21066x.setOnPullRefreshAction(new sg.a(this));
        ((g) M()).f21066x.setOnLoadMoreAction(new sg.b(this));
        U().f(Long.valueOf(this.T));
        kf.j.a(this, "Chưa có lịch sử đấu giá", "", C0531R$drawable.ic_note_history, (Integer) null, ((g) M()).f21066x.getEmptyStateView());
        ((ImageButton) ((g) M()).f21067y.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 5));
    }
}
