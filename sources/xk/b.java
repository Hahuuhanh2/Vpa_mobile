package xk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import sk.j;

/* compiled from: Sequences.kt */
public final class b<T> implements e<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f23483a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23484b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f23485a;

        /* renamed from: b  reason: collision with root package name */
        public int f23486b;

        public a(b<T> bVar) {
            this.f23485a = bVar.f23483a.iterator();
            this.f23486b = bVar.f23484b;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            while (this.f23486b > 0 && this.f23485a.hasNext()) {
                this.f23485a.next();
                this.f23486b--;
            }
            return this.f23485a.hasNext();
        }

        public final T next() {
            while (this.f23486b > 0 && this.f23485a.hasNext()) {
                this.f23485a.next();
                this.f23486b--;
            }
            return this.f23485a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e<? extends T> eVar, int i10) {
        boolean z10;
        j.f(eVar, "sequence");
        this.f23483a = eVar;
        this.f23484b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public final b a(int i10) {
        int i11 = this.f23484b + i10;
        if (i11 < 0) {
            return new b(this, i10);
        }
        return new b(this.f23483a, i11);
    }

    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
