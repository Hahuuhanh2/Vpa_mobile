package w1;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f16350a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f16351b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f16352c;

    public t(View view, Runnable runnable) {
        this.f16350a = view;
        this.f16351b = view.getViewTreeObserver();
        this.f16352c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            t tVar = new t(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(tVar);
            view.addOnAttachStateChangeListener(tVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final void b() {
        if (this.f16351b.isAlive()) {
            this.f16351b.removeOnPreDrawListener(this);
        } else {
            this.f16350a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f16350a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        b();
        this.f16352c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f16351b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
