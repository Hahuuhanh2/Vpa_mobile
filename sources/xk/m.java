package xk;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import rk.l;
import sk.j;

/* compiled from: Sequences.kt */
public final class m<T, R> implements e<R> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f23501a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f23502b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f23503a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m<T, R> f23504b;

        public a(m<T, R> mVar) {
            this.f23504b = mVar;
            this.f23503a = mVar.f23501a.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f23503a.hasNext();
        }

        public final R next() {
            return this.f23504b.f23502b.invoke(this.f23503a.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(e<? extends T> eVar, l<? super T, ? extends R> lVar) {
        j.f(lVar, "transformer");
        this.f23501a = eVar;
        this.f23502b = lVar;
    }

    public final java.util.Iterator<R> iterator() {
        return new a(this);
    }
}
