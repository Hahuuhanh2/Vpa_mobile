package androidx.appcompat.app;

import android.view.View;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import w1.r0;
import w1.s0;

/* compiled from: AppCompatDelegateImpl */
public final class j extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f441a;

    public j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f441a = appCompatDelegateImpl;
    }

    public final void a() {
        this.f441a.C.setAlpha(1.0f);
        this.f441a.F.d((r0) null);
        this.f441a.F = null;
    }

    public final void c() {
        this.f441a.C.setVisibility(0);
        if (this.f441a.C.getParent() instanceof View) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.h.c((View) this.f441a.C.getParent());
        }
    }
}
