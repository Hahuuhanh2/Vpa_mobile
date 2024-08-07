package j$.util;

import j$.util.function.Consumer;
import j$.util.function.J;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0412s implements PrimitiveIterator.OfInt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0520t f18574a;

    private /* synthetic */ C0412s(C0520t tVar) {
        this.f18574a = tVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(C0520t tVar) {
        if (tVar == null) {
            return null;
        }
        return tVar instanceof r ? ((r) tVar).f18573a : new C0412s(tVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18574a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18574a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18574a.c(J.a(intConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18574a.hasNext();
    }

    public final /* synthetic */ int nextInt() {
        return this.f18574a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f18574a.remove();
    }
}
