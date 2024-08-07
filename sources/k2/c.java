package k2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import h8.g;

/* compiled from: SpringAnimation */
public final class c extends b<c> {

    /* renamed from: r  reason: collision with root package name */
    public d f11940r = null;

    /* renamed from: s  reason: collision with root package name */
    public float f11941s = Float.MAX_VALUE;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11942t = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Object obj) {
        super(obj);
        g.a aVar = g.f10648x;
    }

    public final void c() {
        boolean z10;
        if (this.f11940r.f11944b > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f11932f) {
            this.f11942t = true;
        }
    }
}
