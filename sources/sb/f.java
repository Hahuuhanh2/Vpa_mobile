package sb;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import d.h;
import d.i;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PreDrawListener */
public final class f implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14711a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<View> f14712b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f14713c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f14714d;

    public f(View view, h hVar, i iVar) {
        this.f14712b = new AtomicReference<>(view);
        this.f14713c = hVar;
        this.f14714d = iVar;
    }

    public final boolean onPreDraw() {
        View andSet = this.f14712b.getAndSet((Object) null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f14711a.post(this.f14713c);
        this.f14711a.postAtFrontOfQueue(this.f14714d);
        return true;
    }
}
