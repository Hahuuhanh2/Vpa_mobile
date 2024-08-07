package com.ots.base.utils.customview.bottomnavigationbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.q;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import ek.g;
import sk.j;
import sk.k;

/* compiled from: BottomNavigationViewItem.kt */
public final class BottomNavigationViewItem extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f8288e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final g f8289a = j7.a.b0(new b(this));

    /* renamed from: b  reason: collision with root package name */
    public final g f8290b = j7.a.b0(new a(this));

    /* renamed from: c  reason: collision with root package name */
    public final g f8291c = j7.a.b0(new c(this));

    /* renamed from: d  reason: collision with root package name */
    public int f8292d;

    /* compiled from: BottomNavigationViewItem.kt */
    public static final class a extends k implements rk.a<ImageView> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomNavigationViewItem f8293a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(BottomNavigationViewItem bottomNavigationViewItem) {
            super(0);
            this.f8293a = bottomNavigationViewItem;
        }

        public final Object invoke() {
            return (ImageView) this.f8293a.findViewById(R$id.navItemIV);
        }
    }

    /* compiled from: BottomNavigationViewItem.kt */
    public static final class b extends k implements rk.a<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomNavigationViewItem f8294a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(BottomNavigationViewItem bottomNavigationViewItem) {
            super(0);
            this.f8294a = bottomNavigationViewItem;
        }

        public final Object invoke() {
            return this.f8294a.findViewById(R$id.navItemLinear);
        }
    }

    /* compiled from: BottomNavigationViewItem.kt */
    public static final class c extends k implements rk.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomNavigationViewItem f8295a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BottomNavigationViewItem bottomNavigationViewItem) {
            super(0);
            this.f8295a = bottomNavigationViewItem;
        }

        public final Object invoke() {
            return (TextView) this.f8295a.findViewById(R$id.navItemTV);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        LayoutInflater.from(context).inflate(R$layout.button_nav_item, this, true);
        getNavItemLinear().setContentDescription(String.valueOf(this.f8292d));
        getNavItemLinear().setOnClickListener(new q(this, 2));
    }

    private final ImageView getNavItemIV() {
        return (ImageView) this.f8290b.getValue();
    }

    private final View getNavItemLinear() {
        return (View) this.f8289a.getValue();
    }

    private final TextView getNavItemTV() {
        return (TextView) this.f8291c.getValue();
    }

    public final int getIndex() {
        return this.f8292d;
    }

    public final bf.a getListener() {
        return null;
    }

    public final void setIndex(int i10) {
        this.f8292d = i10;
    }

    public final void setItemSelected(boolean z10) {
    }

    public final void setListener(bf.a aVar) {
    }
}
