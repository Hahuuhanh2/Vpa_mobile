package l5;

import android.graphics.drawable.Drawable;
import k5.d;
import o5.l;

/* compiled from: CustomTarget */
public abstract class c<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f12701a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12702b;

    /* renamed from: c  reason: collision with root package name */
    public d f12703c;

    public c() {
        if (l.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f12701a = Integer.MIN_VALUE;
            this.f12702b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c(f fVar) {
    }

    public final void d(d dVar) {
        this.f12703c = dVar;
    }

    public final void e(Drawable drawable) {
    }

    public final void f() {
    }

    public final void h(Drawable drawable) {
    }

    public final d i() {
        return this.f12703c;
    }

    public final void k(f fVar) {
        fVar.b(this.f12701a, this.f12702b);
    }
}
