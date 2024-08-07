package com.vpa.daugia.module.notification.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.google.android.material.search.h;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import ek.g;
import mg.k0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: NotificationManagerActivity.kt */
public final class NotificationManagerActivity extends Hilt_NotificationManagerActivity<k0> {
    public static final /* synthetic */ int T = 0;
    public final d0 R = new d0(s.a(NotificationViewModel.class), new d(this), new c(this), new e(this));
    public final g S = j7.a.b0(new a(this));

    /* compiled from: NotificationManagerActivity.kt */
    public static final class a extends k implements rk.a<xh.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NotificationManagerActivity f19782a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(NotificationManagerActivity notificationManagerActivity) {
            super(0);
            this.f19782a = notificationManagerActivity;
        }

        public final Object invoke() {
            return new xh.a(new a(this.f19782a));
        }
    }

    /* compiled from: NotificationManagerActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19783a;

        public b(l lVar) {
            this.f19783a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19783a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19783a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19783a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19783a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19784a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19784a = componentActivity;
        }

        public final Object invoke() {
            return this.f19784a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19785a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19785a = componentActivity;
        }

        public final Object invoke() {
            return this.f19785a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19786a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19786a = componentActivity;
        }

        public final Object invoke() {
            return this.f19786a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_notification_manager;
    }

    public final xh.a T() {
        return (xh.a) this.S.getValue();
    }

    public final NotificationViewModel U() {
        return (NotificationViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((k0) M()).f21144y.f10530d).setText("Thông báo");
        U().f19773g.e(this, new b(new wh.b(this)));
        U().f19775i.e(this, new b(new wh.c(this)));
        U().f19777k.e(this, new b(new wh.d(this)));
        U().d();
        ((k0) M()).f21143x.getRecyclerView().setAdapter(T());
        ((k0) M()).f21143x.setOnPullRefreshAction(new wh.e(this));
        ((k0) M()).f21143x.setSetClearAdapterAction(new wh.f(this));
        ((k0) M()).f21143x.setOnLoadMoreAction(new wh.g(this));
        kf.j.a(this, "Hiện tại chưa có thông báo nào được hiển thị.", "", C0531R$drawable.ic_notify_empty, (Integer) null, ((k0) M()).f21143x.getEmptyStateView());
        ((k0) M()).f21142w.setOnClickListener(new h(this, 29));
        ((ImageButton) ((k0) M()).f21144y.f10528b).setOnClickListener(new com.google.android.material.textfield.b(this, 27));
        ((k0) M()).f21145z.setOnClickListener(new com.google.android.material.datepicker.q(this, 28));
    }
}
