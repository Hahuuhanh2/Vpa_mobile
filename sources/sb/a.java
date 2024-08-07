package sb;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f14702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f14703b;

    public /* synthetic */ a(c cVar, View view) {
        this.f14702a = cVar;
        this.f14703b = view;
    }

    public final void onGlobalLayout() {
        c cVar = this.f14702a;
        View view = this.f14703b;
        cVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(cVar);
    }
}
