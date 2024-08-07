package e4;

import java.util.Collections;
import o4.a;
import z.k;

/* compiled from: ValueCallbackKeyframeAnimation */
public final class p<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f9151i;

    public p(k kVar, A a10) {
        super(Collections.emptyList());
        k(kVar);
        this.f9151i = a10;
    }

    public final float c() {
        return 1.0f;
    }

    public final A f() {
        k kVar = this.f9098e;
        A a10 = this.f9151i;
        float f10 = this.f9097d;
        return kVar.c(0.0f, 0.0f, a10, a10, f10, f10, f10);
    }

    public final A g(a<K> aVar, float f10) {
        return f();
    }

    public final void i() {
        if (this.f9098e != null) {
            super.i();
        }
    }

    public final void j(float f10) {
        this.f9097d = f10;
    }
}
