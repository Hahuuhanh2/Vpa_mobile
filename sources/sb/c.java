package sb;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
import mb.a;

/* compiled from: FirstDrawDoneListener */
public final class c implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14705a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<View> f14706b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f14707c;

    public c(View view, a aVar) {
        this.f14706b = new AtomicReference<>(view);
        this.f14707c = aVar;
    }

    public final void onDraw() {
        View andSet = this.f14706b.getAndSet((Object) null);
        if (andSet != null) {
            andSet.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, andSet));
            this.f14705a.postAtFrontOfQueue(this.f14707c);
        }
    }
}
