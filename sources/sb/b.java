package sb;

import android.view.View;

/* compiled from: FirstDrawDoneListener */
public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f14704a;

    public b(c cVar) {
        this.f14704a = cVar;
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnDrawListener(this.f14704a);
        view.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
    }
}
