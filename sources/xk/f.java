package xk;

import ek.i;
import ik.d;
import ik.g;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jk.a;
import p3.l0;
import sk.j;

/* compiled from: SequenceBuilder.kt */
public final class f<T> extends g<T> implements Iterator<T>, d<i>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f23494a;

    /* renamed from: b  reason: collision with root package name */
    public T f23495b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator<? extends T> f23496c;

    /* renamed from: d  reason: collision with root package name */
    public d<? super i> f23497d;

    public final void a(Object obj, d dVar) {
        this.f23495b = obj;
        this.f23494a = 3;
        this.f23497d = dVar;
        a aVar = a.COROUTINE_SUSPENDED;
        j.f(dVar, "frame");
    }

    public final Object b(Iterator<? extends T> it, d<? super i> dVar) {
        if (!it.hasNext()) {
            return i.f20112a;
        }
        this.f23496c = it;
        this.f23494a = 2;
        this.f23497d = dVar;
        a aVar = a.COROUTINE_SUSPENDED;
        j.f(dVar, "frame");
        return aVar;
    }

    public final RuntimeException c() {
        int i10 = this.f23494a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder q10 = android.support.v4.media.a.q("Unexpected state of the iterator: ");
        q10.append(this.f23494a);
        return new IllegalStateException(q10.toString());
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final ik.f getContext() {
        return g.f20653a;
    }

    public final boolean hasNext() {
        while (true) {
            int i10 = this.f23494a;
            if (i10 != 0) {
                if (i10 == 1) {
                    java.util.Iterator<? extends T> it = this.f23496c;
                    j.c(it);
                    if (it.hasNext()) {
                        this.f23494a = 2;
                        return true;
                    }
                    this.f23496c = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw c();
                }
            }
            this.f23494a = 5;
            d<? super i> dVar = this.f23497d;
            j.c(dVar);
            this.f23497d = null;
            dVar.resumeWith(i.f20112a);
        }
    }

    public final T next() {
        int i10 = this.f23494a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i10 == 2) {
            this.f23494a = 1;
            java.util.Iterator<? extends T> it = this.f23496c;
            j.c(it);
            return it.next();
        } else if (i10 == 3) {
            this.f23494a = 0;
            T t10 = this.f23495b;
            this.f23495b = null;
            return t10;
        } else {
            throw c();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        l0.Q0(obj);
        this.f23494a = 4;
    }
}
