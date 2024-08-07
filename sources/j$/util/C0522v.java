package j$.util;

import j$.util.function.C0373f0;
import j$.util.function.C0374g;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* renamed from: j$.util.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0522v implements C0524x, Iterator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PrimitiveIterator.OfLong f18948a;

    private /* synthetic */ C0522v(PrimitiveIterator.OfLong ofLong) {
        this.f18948a = ofLong;
    }

    public static /* synthetic */ C0524x a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0523w ? ((C0523w) ofLong).f18949a : new C0522v(ofLong);
    }

    public final /* synthetic */ void b(C0375g0 g0Var) {
        this.f18948a.forEachRemaining(C0373f0.a(g0Var));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18948a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18948a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18948a.hasNext();
    }

    public final /* synthetic */ long nextLong() {
        return this.f18948a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f18948a.remove();
    }
}
