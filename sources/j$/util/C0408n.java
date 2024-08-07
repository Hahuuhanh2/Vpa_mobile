package j$.util;

import j$.util.function.C0374g;
import j$.util.function.C0386m;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* renamed from: j$.util.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0408n implements C0410p, Iterator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PrimitiveIterator.OfDouble f18570a;

    private /* synthetic */ C0408n(PrimitiveIterator.OfDouble ofDouble) {
        this.f18570a = ofDouble;
    }

    public static /* synthetic */ C0410p a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C0409o ? ((C0409o) ofDouble).f18571a : new C0408n(ofDouble);
    }

    public final /* synthetic */ void d(C0388n nVar) {
        this.f18570a.forEachRemaining(C0386m.a(nVar));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18570a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18570a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18570a.hasNext();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f18570a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f18570a.remove();
    }
}
