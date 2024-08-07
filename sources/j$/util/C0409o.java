package j$.util;

import j$.util.function.C0384l;
import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.o  reason: case insensitive filesystem */
public final /* synthetic */ class C0409o implements PrimitiveIterator.OfDouble {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0410p f18571a;

    private /* synthetic */ C0409o(C0410p pVar) {
        this.f18571a = pVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(C0410p pVar) {
        if (pVar == null) {
            return null;
        }
        return pVar instanceof C0408n ? ((C0408n) pVar).f18570a : new C0409o(pVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18571a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18571a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18571a.d(C0384l.a(doubleConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18571a.hasNext();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f18571a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f18571a.remove();
    }
}
