package kf;

import android.view.View;
import d.i;
import rk.l;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f12548b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f12549c;

    public /* synthetic */ b(long j10, View view, l lVar) {
        this.f12547a = view;
        this.f12548b = lVar;
        this.f12549c = j10;
    }

    public final void onClick(View view) {
        View view2 = this.f12547a;
        l lVar = this.f12548b;
        long j10 = this.f12549c;
        j.f(view2, "$this_clickWithDebounce");
        j.f(lVar, "$onClick");
        if (view2.isClickable()) {
            view2.setClickable(false);
            j.c(view);
            lVar.invoke(view);
            view.postDelayed(new i(view2, 25), j10);
        }
    }
}
