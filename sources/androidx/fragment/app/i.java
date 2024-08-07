package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import r2.l;

/* compiled from: Fragment */
public final class i implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f2647a;

    public i(Fragment fragment) {
        this.f2647a = fragment;
    }

    public final void q(l lVar, i.a aVar) {
        View view;
        if (aVar == i.a.ON_STOP && (view = this.f2647a.L) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
