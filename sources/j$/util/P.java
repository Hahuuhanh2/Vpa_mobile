package j$.util;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;

final class P implements C0524x, C0375g0, Iterator {

    /* renamed from: a  reason: collision with root package name */
    boolean f18350a = false;

    /* renamed from: b  reason: collision with root package name */
    long f18351b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ I f18352c;

    P(I i10) {
        this.f18352c = i10;
    }

    public final void accept(long j10) {
        this.f18350a = true;
        this.f18351b = j10;
    }

    /* renamed from: b */
    public final void forEachRemaining(C0375g0 g0Var) {
        g0Var.getClass();
        while (hasNext()) {
            g0Var.accept(nextLong());
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof C0375g0) {
            forEachRemaining((C0375g0) consumer);
            return;
        }
        consumer.getClass();
        if (!c0.f18388a) {
            forEachRemaining(new C0521u(consumer));
        } else {
            c0.a(P.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
    }

    public final boolean hasNext() {
        if (!this.f18350a) {
            this.f18352c.e(this);
        }
        return this.f18350a;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final Long next() {
        if (!c0.f18388a) {
            return Long.valueOf(nextLong());
        }
        c0.a(P.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f18350a || hasNext()) {
            this.f18350a = false;
            return this.f18351b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
