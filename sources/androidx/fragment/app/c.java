package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.d;
import androidx.fragment.app.l0;
import s1.e;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2586b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.a f2587c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l0.b f2588d;

    public /* synthetic */ c(View view, d.a aVar, d dVar, l0.b bVar) {
        this.f2585a = view;
        this.f2586b = dVar;
        this.f2587c = aVar;
        this.f2588d = bVar;
    }

    public final void onCancel() {
        View view = this.f2585a;
        d dVar = this.f2586b;
        d.a aVar = this.f2587c;
        l0.b bVar = this.f2588d;
        j.f(dVar, "this$0");
        j.f(aVar, "$animationInfo");
        j.f(bVar, "$operation");
        view.clearAnimation();
        dVar.f2663a.endViewTransition(view);
        aVar.a();
        if (FragmentManager.J(2)) {
            bVar.toString();
        }
    }
}
