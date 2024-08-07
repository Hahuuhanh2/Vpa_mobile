package com.vpa.daugia.module.menu.ui.fragment;

import al.r0;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import ik.d;
import jf.c;
import p3.l0;

/* compiled from: MenuFragment.kt */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MenuFragment f19769a;

    public a(MenuFragment menuFragment) {
        this.f19769a = menuFragment;
    }

    public final void a(boolean z10) {
        if (z10) {
            MenuFragment menuFragment = this.f19769a;
            int i10 = MenuFragment.f19755o0;
            MenuViewModel n02 = menuFragment.n0();
            l0.j0(l0.d0(n02), r0.f19085b, new rh.c(n02, (d<? super rh.c>) null), 2);
            Intent intent = new Intent(this.f19769a.d0(), AuthActivity.class);
            intent.setFlags(335544320);
            this.f19769a.h0(intent);
            FragmentActivity m10 = this.f19769a.m();
            if (m10 != null) {
                m10.finish();
            }
        }
    }
}
