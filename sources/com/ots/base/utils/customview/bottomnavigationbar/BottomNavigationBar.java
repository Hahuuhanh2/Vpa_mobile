package com.ots.base.utils.customview.bottomnavigationbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import ek.g;
import sk.j;
import sk.k;

/* compiled from: BottomNavigationBar.kt */
public final class BottomNavigationBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final g f8275a = j7.a.b0(new a(this));

    /* compiled from: BottomNavigationBar.kt */
    public static final class a extends k implements rk.a<CurvedBottomNavigationView> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomNavigationBar f8276a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(BottomNavigationBar bottomNavigationBar) {
            super(0);
            this.f8276a = bottomNavigationBar;
        }

        public final Object invoke() {
            return (CurvedBottomNavigationView) this.f8276a.findViewById(R$id.customNavBar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bottom_navigation_bar, this, true);
    }

    private final CurvedBottomNavigationView getCustomNavBar() {
        return (CurvedBottomNavigationView) this.f8275a.getValue();
    }

    public final void setOnBottomNavItemClickedListener(bf.a aVar) {
        j.f(aVar, "listener");
        getCustomNavBar().setOnBottomNavItemClickedListener(aVar);
    }
}
