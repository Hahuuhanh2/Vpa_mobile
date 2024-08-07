package j$.util;

import j$.util.function.C0374g;
import j$.util.function.Consumer;
import j$.util.function.K;
import j$.util.function.L;
import java.util.PrimitiveIterator;

public final /* synthetic */ class r implements C0520t, Iterator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PrimitiveIterator.OfInt f18573a;

    private /* synthetic */ r(PrimitiveIterator.OfInt ofInt) {
        this.f18573a = ofInt;
    }

    public static /* synthetic */ C0520t a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0412s ? ((C0412s) ofInt).f18574a : new r(ofInt);
    }

    public final /* synthetic */ void c(L l10) {
        this.f18573a.forEachRemaining(K.a(l10));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18573a.forEachRemaining(C0374g.a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18573a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f18573a.hasNext();
    }

    public final /* synthetic */ int nextInt() {
        return this.f18573a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f18573a.remove();
    }
}
