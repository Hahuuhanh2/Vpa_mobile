package j$.util;

import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;
import java.util.NoSuchElementException;

final class O implements C0520t, L, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f18345a = false;

    /* renamed from: b  reason: collision with root package name */
    int f18346b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F f18347c;

    O(F f10) {
        this.f18347c = f10;
    }

    public final void accept(int i10) {
        this.f18345a = true;
        this.f18346b = i10;
    }

    /* renamed from: c */
    public final void forEachRemaining(L l10) {
        l10.getClass();
        while (hasNext()) {
            l10.accept(nextInt());
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof L) {
            forEachRemaining((L) consumer);
            return;
        }
        consumer.getClass();
        if (!c0.f18388a) {
            forEachRemaining(new C0411q(consumer));
        } else {
            c0.a(O.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
    }

    public final boolean hasNext() {
        if (!this.f18345a) {
            this.f18347c.j(this);
        }
        return this.f18345a;
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final Integer next() {
        if (!c0.f18388a) {
            return Integer.valueOf(nextInt());
        }
        c0.a(O.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f18345a || hasNext()) {
            this.f18345a = false;
            return this.f18346b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
