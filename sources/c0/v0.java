package c0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.b;
import androidx.camera.core.d;

/* compiled from: SettableImageProxy */
public final class v0 extends b {

    /* renamed from: d  reason: collision with root package name */
    public final Object f4360d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final k0 f4361e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4362f;

    /* renamed from: n  reason: collision with root package name */
    public final int f4363n;

    public v0(d dVar, Size size, k0 k0Var) {
        super(dVar);
        if (size == null) {
            this.f4362f = super.c();
            this.f4363n = super.b();
        } else {
            this.f4362f = size.getWidth();
            this.f4363n = size.getHeight();
        }
        this.f4361e = k0Var;
    }

    public final int b() {
        return this.f4363n;
    }

    public final int c() {
        return this.f4362f;
    }

    public final k0 f0() {
        return this.f4361e;
    }

    public final void h(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f4362f, this.f4363n)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f4360d) {
        }
    }
}
