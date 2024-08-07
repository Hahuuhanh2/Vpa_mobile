package j$.util;

import j$.util.function.C0371e0;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.w  reason: case insensitive filesystem */
public final /* synthetic */ class C0523w implements PrimitiveIterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0524x f18949a;

    private /* synthetic */ C0523w(C0524x xVar) {
        this.f18949a = xVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(C0524x xVar) {
        if (xVar == null) {
            return null;
        }
        return xVar instanceof C0522v ? ((C0522v) xVar).f18948a : new C0523w(xVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18949a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18949a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18949a.b(C0371e0.a(longConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18949a.hasNext();
    }

    public final /* synthetic */ long nextLong() {
        return this.f18949a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f18949a.remove();
    }
}
