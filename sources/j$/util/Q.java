package j$.util;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;

final class Q implements C0410p, C0388n, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f18353a = false;

    /* renamed from: b  reason: collision with root package name */
    double f18354b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C f18355c;

    Q(C c10) {
        this.f18355c = c10;
    }

    public final void accept(double d10) {
        this.f18353a = true;
        this.f18354b = d10;
    }

    /* renamed from: d */
    public final void forEachRemaining(C0388n nVar) {
        nVar.getClass();
        while (hasNext()) {
            nVar.accept(nextDouble());
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof C0388n) {
            forEachRemaining((C0388n) consumer);
            return;
        }
        consumer.getClass();
        if (!c0.f18388a) {
            forEachRemaining(new C0406l(consumer));
        } else {
            c0.a(Q.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }

    public final boolean hasNext() {
        if (!this.f18353a) {
            this.f18355c.o(this);
        }
        return this.f18353a;
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final Double next() {
        if (!c0.f18388a) {
            return Double.valueOf(nextDouble());
        }
        c0.a(Q.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f18353a || hasNext()) {
            this.f18353a = false;
            return this.f18354b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
